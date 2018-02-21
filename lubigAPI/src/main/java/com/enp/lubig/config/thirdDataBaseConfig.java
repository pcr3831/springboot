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
@MapperScan(basePackages = Constants.BASE_PACKAGE, sqlSessionFactoryRef = "db3SqlSessionFactory")
public class thirdDataBaseConfig {

	@Bean(name = "db3DataSource", destroyMethod = "close")
	@ConfigurationProperties(prefix = "spring.second.datasource")
	public DataSource db3DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "db3SqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("db3DataSource") DataSource db3DataSource,
			ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(db3DataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("com.enp.lubig.vo");
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:com/enp/lubig/dao/mapper/sms/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(name = "db3SqlSessionTemplate")
	public SqlSessionTemplate db3SqlSessionTemplate(SqlSessionFactory db3SqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(db3SqlSessionFactory);
	}

}
