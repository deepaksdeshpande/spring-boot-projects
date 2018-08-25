package com.spring.cassandra.util;

//@Configuration
//@PropertySource(value = {"classpath:cassandra.properties"})
/*public class CassandraUtil {*/
/*
	private static final String contactPoints = "cassandra.contactpoints";
	private static final String port = "cassandra.port";
	private static final String keySpace = "cassandra.keyspace";
	
	@Autowired
	private Environment environment;

	private String getContactPoints() {
		return environment.getProperty(contactPoints);
	}
	
	private int getPort() {
		return Integer.parseInt(environment.getProperty(port));
	}
	
	private String getKeySpace() {
		return environment.getProperty(keySpace);
	}
	
	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints(getContactPoints());
		cluster.setPort(getPort());
		return cluster;
	}
	
	@Bean
	public CassandraMappingContext mappingContext() {
		return new CassandraMappingContext();
	}
	
	@Bean
	public CassandraConverter convert() {
		return new MappingCassandraConverter(mappingContext());
	}
	
	@Bean
	public CassandraSessionFactoryBean session() throws Exception {
		CassandraSessionFactoryBean cassandraSessionFactoryBean = new CassandraSessionFactoryBean();
		cassandraSessionFactoryBean.setCluster(cluster().getObject());
		cassandraSessionFactoryBean.setKeyspaceName(getKeySpace());
		cassandraSessionFactoryBean.setConverter(convert());
		cassandraSessionFactoryBean.setSchemaAction(SchemaAction.NONE);
		return cassandraSessionFactoryBean;
	}
	
	@Bean
	public CassandraOperations cassandraTemplate() throws Exception {
		return new CassandraTemplate(session().getObject());
	}
	*/
/*}*/
