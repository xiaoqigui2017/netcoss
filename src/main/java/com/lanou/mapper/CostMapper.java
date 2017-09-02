package com.lanou.mapper;


import com.lanou.bean.Cost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CostMapper {

   List<Cost> findAll();
   void save(Cost cost);
   Cost findById(@Param("fid") int id);
   void update(Cost cost);
   int updateStuatsAndTime(Cost cost);
   void delete(@Param("did") int id);



}
