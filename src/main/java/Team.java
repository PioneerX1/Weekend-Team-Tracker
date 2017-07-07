import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> teamInstances = new ArrayList<Team>();
  private int mTeamId;
  private List<Member> mMembers;

  public Team(String teamName) {
    mTeamName = teamName;
    teamInstances.add(this);
    mTeamId = teamInstances.size();
    mMembers = new ArrayList<Member>();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public int getTeamId() {
    return mTeamId;
  }

  public static List<Team> getAllTeams() {
    return teamInstances;
  }

  public static void clearAllTeams() {
    teamInstances.clear();
  }

  public static Team findTeam(int id) {
    return teamInstances.get(id - 1);
  }

  public void addMember(Member member) {
    mMembers.add(member);
  }

  public List<Member> getMembers() {
    return mMembers;
  }
}
