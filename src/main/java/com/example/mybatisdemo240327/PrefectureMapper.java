package com.example.mybatisdemo240327;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PrefectureMapper {

    @Select("SELECT * FROM prefectures")
    List<Prefecture> findAll();

}
