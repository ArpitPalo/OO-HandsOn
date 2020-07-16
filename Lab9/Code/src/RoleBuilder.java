public class RoleBuilder {
	private static String roles[] = { "UNDEFINED", "DEVELOPER", "TEST_ENGINEER", "SR_DEVELOPER", "DESIGNER" };

	public static String getRoleDescription(int roleId) {

	// Complete the logic
		if(roleId > 4 || roleId < 0) {
			roleId = 0;
		}
		return roles[roleId];
	}
}
