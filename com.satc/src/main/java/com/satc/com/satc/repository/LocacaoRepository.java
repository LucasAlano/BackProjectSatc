package com.satc.com.satc.repository;

import com.satc.com.satc.Model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository <Locacao, Long> {
}
