package nuaa.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	public List<UserInfo> getUser() {
		Connection conn = Db.createConnection();
		String sql = "select * from user";

		UserInfo userInfo = null;
		List<UserInfo> users = new ArrayList<UserInfo>();
		try {
			PreparedStatement ps = Db.prepare(conn, sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				userInfo = new UserInfo();
				userInfo.setId(rs.getInt("id"));
				userInfo.setName(rs.getString("name"));
				users.add(userInfo);
			}
			Db.close(rs);
			Db.close(ps);
			Db.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public void addUser(UserInfo userInfo) {
		Connection conn = Db.createConnection();
		String sql = "insert into user (id, name) values(?,?)";

		try {
			PreparedStatement ps = Db.prepare(conn, sql);
			ps.setInt(1, userInfo.getId());
			ps.setString(2, userInfo.getName());
			ps.executeUpdate();

			Db.close(ps);
			Db.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}