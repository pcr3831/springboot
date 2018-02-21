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
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.enp.lubig.constant.Constants;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = Constants.BASE_PACKAGE, sqlSessionFactoryRef = "db2SqlSessionFactory")
public class SecondDataBaseConfig {

	@Bean(name = "db2DataSource", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.third.datasource")
	public DataSource db2DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "db2SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("db2DataSource") DataSource db2DataSource,
			ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(db2DataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("com.enp.lubig.vo");
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:com/enp/lubig/dao/mapper/openfire/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(name = "db2SqlSessionTemplate")
	public SqlSessionTemplate db2SqlSessionTemplate(SqlSessionFactory db2SqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(db2SqlSessionFactory);
	}

}
