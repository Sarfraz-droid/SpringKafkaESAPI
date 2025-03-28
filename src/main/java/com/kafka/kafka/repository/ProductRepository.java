package com.kafka.kafka.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.kafka.kafka.classes.Product;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
}
