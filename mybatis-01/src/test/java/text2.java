//import com.mybatis.pojo.mapper.SelectMapper;
import com.mybatis.pojo.User;
import com.mybatis.pojo.mapper.SqlMapper;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import utils.SqlSessionUtils;

import java.util.List;
import java.util.Map;

public class text2 {
    @Test
    public void text4(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper=sqlSession.getMapper(SqlMapper.class);
//        User userById = mapper.getUserById(1);
//        System.out.println(userById);
        int i = mapper.deleteMore("15,88");
        System.out.println(i);
//        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
////    userByIdToMap.get(1)
//        System.out.println(userByIdToMap);

        //动态获取表的数据
        List<User> user = mapper.getUserByTableName("user");
        System.out.println(user);
        //获取自增主键的id
        User user1=new User(null,"五六七","44");
        mapper.insertUser(user1);
        System.out.println(user1);

    }
}
