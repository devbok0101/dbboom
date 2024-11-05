package com.show.db.cpu.increase.dbboom.service;

import com.show.db.cpu.increase.dbboom.repository.LargeTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LargeTableService {
    private final LargeTableRepository largeTableRepository;

    public List<?> executeSlowQuery() {
        return largeTableRepository.findSlowQuery();
    }
}
