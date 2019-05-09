package es.jcyl.colapp.oad;

public class UsuarioOt {
	
	private Integer usuarioId;
	private String  login;
	private String password;
	
	public UsuarioOt() {}
	
	
	public UsuarioOt(Integer usuarioId, String login, String password) {
		super();
		this.usuarioId = usuarioId;
		this.login = login;
		this.password = password;
	}
	
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UsuarioOt [usuarioId=" + usuarioId + ", login=" + login + ", password=" + password + "]";
	}

	
	
}
