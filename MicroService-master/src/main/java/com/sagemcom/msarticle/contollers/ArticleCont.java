package com.sagemcom.msarticle.contollers;

import com.sagemcom.msarticle.client.StockClient;
import com.sagemcom.msarticle.dto.StockDto;
import com.sagemcom.msarticle.entities.Article;
import com.sagemcom.msarticle.generic.RestControllerGeneric;
import com.sagemcom.msarticle.services.ArticleServ;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("article")
public class ArticleCont extends RestControllerGeneric<Article , Long>{
    private final ArticleServ articleServ;
    private final StockClient stockClient;


    @GetMapping(value = "stock/{id}")
    public StockDto getPostById(@PathVariable(value = "id") Integer id) {
        return stockClient.getStockById(id);
    }
}
