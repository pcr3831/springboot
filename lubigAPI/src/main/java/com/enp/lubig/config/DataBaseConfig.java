package com.enp.lubig.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.enp.lubig.constant.Constants;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = Constants.BASE_PACKAGE, sqlSessionFactoryRef = "db1SqlSessionFactory")
public class DataBaseConfig {

	@Primary
	@Bean(name = "db1DataSource", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource db1DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "db1SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("db1DataSource") DataSource db1DataSource,
			ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(db1DataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("com.enp.lubig.vo");
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:com/enp/lubig/dao/mapper/lubig/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Primary
	@Bean(name = "db1SqlSessionTemplate")
	public SqlSessionTemplate db1SqlSessionTemplate(SqlSessionFactory db1SqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(db1SqlSessionFactory);
	}

}
