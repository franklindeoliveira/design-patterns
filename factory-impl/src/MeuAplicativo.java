import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MeuAplicativo {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().getConnection();

		PreparedStatement ps = conexao.prepareStatement("select * from ...");
		// codigo continua aqui
	}

}
