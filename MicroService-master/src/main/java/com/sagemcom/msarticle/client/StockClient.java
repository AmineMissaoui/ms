package com.sagemcom.msarticle.client;

import com.sagemcom.msarticle.dto.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-stock")
public interface StockClient {
    @GetMapping(value = "stock/{id}")
    StockDto getStockById(@PathVariable(value = "id") long id);
}
