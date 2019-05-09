package es.jcyl.colapp.oad;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDao extends JdbcDaoSupport {
	
	
	@Autowired
    public UsuarioDao (DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	
	
	public UsuarioOt buscarUsuario (String login ) {
		
		String sql = UsuarioMapper.BASE_SQL + " where u.login = '" + login + "' ";
		//Object[] params = new Object[] { login };
		try {
	       UsuarioOt usuario = this.getJdbcTemplate().queryForObject(sql,  new UsuarioMapper() );
	       return usuario;
	    } 
		catch (EmptyResultDataAccessException e) {
	       return null;
	    } 
	}
	
    public UsuarioOt buscarUsuarioContrasena (String login , String password ) {
		
		String sql = UsuarioMapper.BASE_SQL + " where u.login = '" + login + "' and u.password = '" +  password + "' ";	
		//Object[] params = new Object[] { login , password};
		try {
	       UsuarioOt usuario = this.getJdbcTemplate().queryForObject(sql, new UsuarioMapper() );
	       return usuario;
	    } 
		catch (EmptyResultDataAccessException e) {
	       return null;
	    } 
	}
    
}
