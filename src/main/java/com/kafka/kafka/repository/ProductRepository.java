package com.kafka.kafka.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.kafka.kafka.classes.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
}
