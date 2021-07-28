package com.cos.pic;

import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import com.cos.pic.utils.MyPath;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public @ResponseBody String home() {
        return "home";
    }

    @GetMapping("/send")
    public String send() {
        return "send";
    }

    @GetMapping("/feed")
    public String feed() {
        return "feed";
    }

    @PostMapping("/image")
    public @ResponseBody String image(MultipartFile pic) {
        // 중복되지 않는 난수
        UUID uuid = UUID.randomUUID();
        // 뒤에는 확장자 앞에다가 넣어준다.
        String imageFileName = uuid + "-" + pic.getOriginalFilename();

        // 원도우 경로 기법
        // 스프링에서는 역슬래쉬 / 로 하고 마지막에 슬래쉬를 하나더 붙어 준다.

        Path imagePath = Paths.get(MyPath.IMAGEPATH + imageFileName);

        try {
            Files.write(imagePath, pic.getBytes());
            // DB에 파일 경로를 저장!! imageFileName 저장하기
            // DB에 파일 경로 저장!!
            // Room 엔티티
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imageFileName;
    }

}