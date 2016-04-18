package com.data;


import com.data.mapper.Game;

import java.util.List;
import java.util.Map;

/**
 * Created by bluesky on 16-4-13.
 */
public interface IPlayDataSource {

    Game getGameById(String id);

    List<Game> getGamesByCategoryId(String id);

    Integer getGameCount(Map<String, String> map);
}
