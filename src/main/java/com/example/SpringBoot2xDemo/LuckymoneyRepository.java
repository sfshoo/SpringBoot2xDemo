package com.example.SpringBoot2xDemo;

import org.springframework.data.jpa.repository.JpaRepository;


// DAO
public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {
}
