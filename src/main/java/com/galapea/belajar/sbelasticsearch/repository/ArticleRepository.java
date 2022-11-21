package com.galapea.belajar.sbelasticsearch.repository;

import com.galapea.belajar.sbelasticsearch.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {
}
