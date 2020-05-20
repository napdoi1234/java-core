package dao;

import java.util.List;

public interface GenericDAO<T> {
	 List <T> query (String sql,String db,Object... paramenter);
}
