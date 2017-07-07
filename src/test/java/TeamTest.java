import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Before
  public void resetTeams() {
    Team.clearAllTeams();
  }

  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Lukes");
    assertEquals(true, testTeam instanceof Team);
  }
  @Test
  public void getTeamName_retrievesTeamName_Lukes() {
    Team testTeam = new Team("Lukes");
    assertEquals("Lukes", testTeam.getTeamName());
  }
  @Test
  public void getAllTeams_retrievesAllInstancesOfTeam_true() {
    Team testTeam = new Team("Lukes");
    Team testTeam2 = new Team("Picards");
    assertEquals(true, Team.getAllTeams().contains(testTeam));
    assertEquals(true, Team.getAllTeams().contains(testTeam2));
  }
  @Test
  public void clearAllTeams_erasesAllInstancesOfTeam_0() {
    Team testTeam = new Team("Lukes");
    Team testTeam2 = new Team("Picards");
    Team.clearAllTeams();
    assertEquals(0, Team.getAllTeams().size());
  }
  @Test
  public void getTeamId_retrieveUniqueIdFromTeam_1() {
    Team testTeam = new Team("Lukes");
    Team testTeam2 = new Team("Picards");
    assertEquals(1, testTeam.getTeamId());
  }
  @Test
  public void getAllTeams_retrieveTotalNumberOfTeams_2() {
    Team testTeam = new Team("Lukes");
    Team testTeam2 = new Team("Picards");
    assertEquals(2, Team.getAllTeams().size());
  }
  @Test
  public void findTeam_retrievesSpecificTeamByIdNumber_Lukes() {
    Team testTeam = new Team("Lukes");
    Team testTeam2 = new Team("Picards");
    assertEquals(testTeam, Team.findTeam(testTeam.getTeamId()));
  }
  @Test
  public void addMember_addsMembertoTeam_true() {
    Team testTeam = new Team("Lukes");
    Member testMember = new Member("Frank");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }

}
