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

    @Select("select * from sashelp.iris where species=#{species}")
    List<Iris> findBySpecies(@Param("species") String species);

}
