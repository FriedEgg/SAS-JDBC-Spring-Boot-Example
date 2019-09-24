package com.github.friedegg.demo.mapper;

import com.github.friedegg.demo.domain.Iris;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author FriedEgg
 */
@Service
@Mapper
public interface IrisMapper {

    @Select("select * from iris where Species=#{Species}")
    List<Iris> findBySpecies(@Param("Species") String species);

    @Insert("insert into iris ( SepalLength , SepalWidth , PetalLength , PetalWidth , Species ) values (#{sepalLength}, #{sepalWidth}, #{petalLength}, #{petalWidth}, #{species})")
    void insert(Iris iris);

}
