package com.data.impl;


import com.data.ISearchDataSource;
import com.data.mapper2.SearchMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bluesky on 16-4-13.
 */
@Transactional
@Service("searchDataSourceImpl")
public class SearchDataSourceImpl implements ISearchDataSource {

    @Resource(name = "searchMapper")
    private SearchMapper searchMapper;


    @Override
    public List<String> getHotSearchWords() {


        return searchMapper.selectHotSearchWords();


    }
}
