package es.jcyl.colapp.oad;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsuarioMapper implements RowMapper<UsuarioOt> {
	
	public static final String BASE_SQL = "Select u.id , u.login, u.password from usuarios u ";
	
	@Override
    public UsuarioOt mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Integer usuarioId = rs.getInt("id");
		String login      = rs.getString("login");
		String password   = rs.getString("password");
		
		
		return new UsuarioOt ( usuarioId, login, password);
	}

}
