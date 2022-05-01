import com.mybatis.pojo.User;
import com.mybatis.pojo.mapper.UserMapper;
import com.mybatis.pojo.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Parameter;

public class text {
    @Test
    public void text() throws Exception{
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getAlUser();
    }



}
