import com.data.IPlayDataSource;
import com.data.ISearchDataSource;
import com.data.mapper.Game;
import com.data.mapper.PlayMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;


/**
 * Created by bluesky on 16-4-11.
 */
public class Test {
    public static void main(String[] args) {


        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});


   /*     IPlayDataSource playDataSourceImpl = (IPlayDataSource) context.getBean("playDataSourceImpl");

        Game game = playDataSourceImpl.getGameById("1");

        System.out.println(game.getGameId());
        System.out.println(game.getName());*/

        IPlayDataSource playDataSourceImpl = (IPlayDataSource) context.getBean("playDataSourceImpl");

        Game game = playDataSourceImpl.getGameById("1");
        System.out.println(game.getGameId());
        System.out.println(game.getName());

        List<Game> games = playDataSourceImpl.getGamesByCategoryId("1");
        System.out.println(games.get(0).getGameId());
        System.out.println(games.get(0).getName());


        ISearchDataSource searchDataSourceImpl = (ISearchDataSource) context.getBean("searchDataSourceImpl");

        List<String> hotWords = searchDataSourceImpl.getHotSearchWords();
        for (String hotWord : hotWords) {
            System.out.println(hotWord);
        }

        int count = playDataSourceImpl.getGameCount(new HashMap<String, String>() {
            {
                put("startDate", "");
                put("endDate", "");
            }
        });

        System.out.println(count);
    }
}
