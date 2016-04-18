package com.data.mapper2;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bluesky on 16-4-12.
 */
@Repository(value = "searchMapper")
public interface SearchMapper {
    List<String> selectHotSearchWords();
}
