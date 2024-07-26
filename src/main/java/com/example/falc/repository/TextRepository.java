package com.example.falc.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Long, Long> {
}
