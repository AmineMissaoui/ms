package com.sagemcom.msarticle.dto;
import com.sagemcom.msarticle.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto extends BaseEntity {
    private String name;
    private int qte;
    private StockDto stockDto;
}


