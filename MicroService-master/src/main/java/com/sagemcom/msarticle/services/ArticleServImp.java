package com.sagemcom.msarticle.services;

import com.sagemcom.msarticle.client.StockClient;
import com.sagemcom.msarticle.dto.StockDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.generic.ServiceGeneric;
import com.sagemcom.msarticle.repositories.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ArticleServImp extends ServiceGeneric <Article, Long> implements ArticleServ {
    private final ArticleRepo articleRepo;
    @Override
    public Article save(Article entity) {
        entity.setCreatedAt(LocalDate.now());
        return articleRepo.save(entity);
    }

}
