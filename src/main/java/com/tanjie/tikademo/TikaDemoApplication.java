package com.tanjie.tikademo;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.*;

@SpringBootApplication
public class TikaDemoApplication {

    public static void main(String[] args) throws IOException, TikaException {
        SpringApplication.run(TikaDemoApplication.class, args);

        Tika tika = new Tika();
        File readme = ResourceUtils.getFile("classpath:data/README.pdf");
        String content = tika.parseToString(readme);
        System.out.println(content);

        File template =  ResourceUtils.getFile("classpath:data/template.pptx");
        String content1 = tika.parseToString(template);
        System.out.println(content1);
    }

}
