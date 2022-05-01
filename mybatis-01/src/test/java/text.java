import com.mybatis.pojo.User;
import com.mybatis.pojo.mapper.SelectMapper;
import com.mybatis.pojo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import utils.SqlSessionUtils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class text {
    @Test
    public void text() throws Exception{

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession=build.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//       int resulet= userMapper.insertUser();
//        System.out.println(resulet);
//        sqlSession.commit();
    }
    @Test
    public void text2()throws Exception{
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //加载映射
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User t = userMapper.getUserByName("陶子涵");
//        System.out.println(t);
//        User t = userMapper.login("栗子", "555");
//        System.out.println(t);

        //通过自己创建map集合，穿传进去，（有多个参数的时候）磨人的时候用arg[0]或
//        Map <String,Object> map=new HashMap<>();
//        map.put("name","陶子涵");
//        map.put("pwd","123");
//        User login = userMapper.login1(map);
//        System.out.println(login);

        //放置实例化对象也是可行的，在
//        User user=new User(88,"王五","44");
//        int i = userMapper.insertUser(user);
//        System.out.println(i);

        User user = userMapper.checkLoginByParam("王五", "44");
        System.out.println(user);
    }
@Test
    public void text3(){

    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
    User userById = mapper.getUserById(1);
    System.out.println(userById);
    Integer count = mapper.getCount();
    System.out.println(count);


}
@Test
    public void text4(){
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
 Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
//    userByIdToMap.get(1)
    System.out.println(userByIdToMap);

    }
    @Test
    public void test5(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> h = mapper.getUserByLike("子涵");
        System.out.println(h);
    }

}
