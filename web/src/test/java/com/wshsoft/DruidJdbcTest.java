package com.wshsoft;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;




/**
 * dao测试的基类
 * xiejian
 * @Date 2014-5-16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/ApplicationContext-druid.xml" })

public class DruidJdbcTest {
    @Autowired
	 DruidDataSource dataSource;
    
@Test	
public  void test() {
		
		DruidPooledConnection dpc = null;
	    Statement stmt = null;
	    ResultSet rset = null;
		try {

			dpc = dataSource.getConnection();
            stmt = dpc.createStatement();
            System.out.println("Executing statement.");
            rset = stmt.executeQuery("select * from sys_user");//该数据库中有 sys_user 表
            System.out.println("Results:");
            int numcols = rset.getMetaData().getColumnCount();
            while(rset.next()) {
                for(int i=1;i<=numcols;i++) {
                    System.out.print("\t" + rset.getString(i));
                }
                System.out.println("");
            } 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try { if (rset != null) rset.close(); } catch(Exception e) { }
            try { if (stmt != null) stmt.close(); } catch(Exception e) { }
            try { if (dpc != null) dpc.close(); } catch(Exception e) { }
        }
	}



	@Before
	public void before() {
		
	}

	
	@After
	public  void after() {
		
	}
}
