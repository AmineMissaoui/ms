package tn.esprit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.entities.BaseEntity;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto extends BaseEntity {
    private String name;
    private int qte;
    private StockDto stockDto;
}


