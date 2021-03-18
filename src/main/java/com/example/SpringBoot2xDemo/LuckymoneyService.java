package com.example.SpringBoot2xDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    private LuckymoneyRepository repository;

    @Autowired
    public void setRepository(LuckymoneyRepository repository) {
        this.repository = repository;
    }

    /**
     * 事务 指的是MySQL的事务 MyISAM引擎不支持事务，InnoDB支持
     * 实际应用场景：扣库存 > 创建订单
     */
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("Dante");
        luckymoney1.setMoney(new BigDecimal(520));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("Dante");
        luckymoney2.setMoney(new BigDecimal(1314));
        repository.save(luckymoney2);
    }
}
