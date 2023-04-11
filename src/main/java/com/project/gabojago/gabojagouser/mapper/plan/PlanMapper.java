package com.project.gabojago.gabojagouser.mapper.plan;

import com.project.gabojago.gabojagouser.dto.plan.PlanDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlanMapper {
    List<PlanDto> findAll();
    PlanDto findByBId(int pId);
    int insertOne(PlanDto plan);
    int updateOne(PlanDto plan);
    int deleteOne(int pId);

}