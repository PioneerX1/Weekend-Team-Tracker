import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
  @Before
  public void reset() {
    Member.clearAllMembers();
  }

  @Test
  public void member_instantiatesCorrectly_true() {
    Member testMember = new Member("Fred");
    assertEquals(true, testMember instanceof Member);
  }
  @Test
  public void getMemberName_retrieveMemberName_Fred() {
    Member testMember = new Member("Fred");
    assertEquals("Fred", testMember.getMemberName());
  }
  @Test
  public void getAllMembers_retrieveAllInstancesOfMember_true() {
    Member testMember = new Member("Fred");
    Member testMember2 = new Member("Chuck");
    assertEquals(true, Member.getAllMembers().contains(testMember));
    assertEquals(true, Member.getAllMembers().contains(testMember2));
  }
  @Test
  public void clearAllMembers_eraseAllInstancesOfMember_0() {
    Member testMember = new Member("Fred");
    Member testMember2 = new Member("Chuck");
    Member.clearAllMembers();
    assertEquals(0, Member.getAllMembers().size());
  }
  @Test
  public void getMemberId_retrieveUniqueMemberId_2() {
    Member testMember = new Member("Fred");
    Member testMember2 = new Member("Chuck");
    assertEquals(2, testMember2.getMemberId());
  }
  @Test
  public void getAllMembers_retrieveNumberOfTotalMembers_2() {
    Member testMember = new Member("Fred");
    Member testMember2 = new Member("Chuck");
    assertEquals(2, Member.getAllMembers().size());
  }
  @Test
  public void findMember_retrievesMemberWithSameId_FredMember() {
    Member testMember = new Member("Fred");
    Member testMember2 = new Member("Chuck");
    assertEquals(testMember, Member.findMember(testMember.getMemberId()));
  }

}
