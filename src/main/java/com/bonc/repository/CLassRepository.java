package com.bonc.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bonc.entity.Classes;

public interface CLassRepository extends JpaRepository<Classes, Integer> {
}
