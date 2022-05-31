package com.rlg.java8.stream.lambda.practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StaticFiles {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\RGRIGORIU\\dev\\git\\LSMV\\CODING\\JAVA\\Main\\lsmv-web\\web\\src\\main\\webapp";
        Map<String, Map<String, Long>> folders = new TreeMap<>();

        Files.walk(Paths.get(source))
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    String parent = file.getParent().toString().substring(source.length()).replace("\\", "/");
                    Map<String, Long> fileTypes = Optional.ofNullable(folders.get(parent)).orElse(new HashMap<>());

                    String ext = FilenameUtils.getExtension(file.getFileName().toString());
                    long amount = Optional.ofNullable(fileTypes.get(ext)).orElse(0L);
                    fileTypes.put(ext.toLowerCase(), amount+1);

                    folders.put(parent, fileTypes);
                });

        System.out.println(new ObjectMapper().writeValueAsString(folders));

        Map<String, Long> types = new HashMap<>();
        Files.walk(Paths.get(source))
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    String ext = FilenameUtils.getExtension(file.getFileName().toString());
                    long amount = Optional.ofNullable(types.get(ext)).orElse(0L);
                    types.put(ext.toLowerCase(), amount+1);
                });

        System.out.println(
                new ObjectMapper().writeValueAsString(
                        types.entrySet()
                                .stream()
                                .sorted(
                                        Collections.reverseOrder(Map.Entry.comparingByValue()))
                                .collect(
                                        Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (a, b) -> b,
                                                LinkedHashMap::new))));
    }
}
