package com.sagemcom.msstock.contollers;

import com.sagemcom.msstock.entities.Stock;
import com.sagemcom.msstock.generic.RestControllerGeneric;
import com.sagemcom.msstock.services.StockServ;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("stock")
public class StockCont extends RestControllerGeneric<Stock, Long>{
    private final StockServ stockServ;
}
