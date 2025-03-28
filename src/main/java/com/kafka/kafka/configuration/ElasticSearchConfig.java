package com.kafka.kafka.configuration;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {

	@Override
	public ClientConfiguration clientConfiguration() {
		// aFRKU241UUJLNlJkUjFPMVFTZ0U6RU9FdjVsT2hUSTJUek03RzZaZ2FnUQ==
		// =aQJaIIFGaZaKnNlHapx
		return ClientConfiguration.builder()           
			.connectedToLocalhost()
			.usingSsl(getSSLContext())
			.withBasicAuth("elastic", "Hyxf6BNGLEmkM2X-+LRd")
			.build();
	}

	public static SSLContext getSSLContext() {
		try {
			return new SSLContextBuilder().loadTrustMaterial(null, TrustAllStrategy.INSTANCE).build();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
