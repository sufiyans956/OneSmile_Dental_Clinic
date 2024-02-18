package com.one_smile.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one_smile.entity.Examinations;

public interface ExaminationRepository extends JpaRepository<Examinations, Integer> {

}
