import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private int mId;
  private static List<Member> instances = new ArrayList<Member>();

  public Member(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getMemberName() {
    return mName;
  }

  public int getMemberId() {
    return mId;
  }

  public static List<Member> getAllMembers() {
    return instances;
  }

  public static void clearAllMembers() {
    instances.clear();
  }

  public static Member findMember(int id) {
    return instances.get(id - 1);
  }
}
