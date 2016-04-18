package com.data.mapper;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by bluesky on 16-4-11.
 */
@Repository
public interface PlayMapper {

    Game selectGame(String gameId);

    List<Game> selectGameListByCategoryId(String categoryId);

    Integer selectGameCount(Map<String, String> map);

}
