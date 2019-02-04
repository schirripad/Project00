package Project00;

public class TeamBeardsAndKim extends Team {

	public TeamBeardsAndKim(String name) {
		super(name);
	}

	@Override
	public void createTeamMembers() {
		members.add(new SchirripaMember());
		members.add(new HutchinsonMember());
		members.add(new MillerMember());
	}

}
