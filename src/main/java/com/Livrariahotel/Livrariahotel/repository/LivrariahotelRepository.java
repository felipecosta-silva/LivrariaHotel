package com.Livrariahotel.Livrariahotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Livrariahotel.Livrariahotel.model.Livrariahotel;

@Repository
public interface LivrariahotelRepository extends JpaRepository<Livrariahotel, Long> {}
