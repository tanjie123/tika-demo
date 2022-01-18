package com.tanjie.tikademo;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TikaDemoApplication {

    public static void main(String[] args) throws IOException, TikaException {
        SpringApplication.run(TikaDemoApplication.class, args);

        Tika tika = new Tika();
        File file = new File("D:\\tanjie\\projects\\tika-demo\\src\\main\\resources\\data\\README.pdf");
        String content = tika.parseToString(file);
        System.out.println(content);

    }

}
