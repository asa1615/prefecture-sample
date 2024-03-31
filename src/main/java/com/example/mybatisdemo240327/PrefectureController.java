package com.example.mybatisdemo240327;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrefectureController {

    private final PrefectureMapper prefectureMapper;

    public PrefectureController(PrefectureMapper prefectureMapper){
        this.prefectureMapper = prefectureMapper;
    }

    @GetMapping("/prefectures")
    public List<Prefecture> findAll (){
        return prefectureMapper.findAll();
    }
}
