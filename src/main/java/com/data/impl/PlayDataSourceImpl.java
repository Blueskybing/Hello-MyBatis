package com.data.impl;


import com.data.IPlayDataSource;
import com.data.mapper.Game;
import com.data.mapper.PlayMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by bluesky on 16-4-13.
 */
@Transactional
@Service("playDataSourceImpl")
public class PlayDataSourceImpl implements IPlayDataSource {

    @Resource(name = "playMapper")
    private PlayMapper playMapper;


    public Game getGameById(String id) {
        return playMapper.selectGame(id);
    }

    @Override
    public List<Game> getGamesByCategoryId(String id) {
        return playMapper.selectGameListByCategoryId(id);
    }

    @Override
    public Integer getGameCount(Map<String, String> map) {

        return playMapper.selectGameCount(map);
    }


}
