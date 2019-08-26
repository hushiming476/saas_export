package cn.itcast.dao.company;


import cn.itcast.domain.company.Company;

import java.util.List;

/**
   企业的接口
 */
public interface CompanyDao {


    //查询所有企业
    List<Company> findAll();

}
