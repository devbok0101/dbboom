package com.show.db.cpu.increase.dbboom.repository;

import com.show.db.cpu.increase.dbboom.entity.LargeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LargeTableRepository extends JpaRepository<LargeTable, Long> {

    @Query("SELECT lt FROM LargeTable lt WHERE lt.dataType = 'varchar'")
    List<LargeTable> findSlowQuery();
}