import java.util.ArrayList;

public class GroupMembers {
    public static void main(String[] args) throws Exception {
        // Creating an ArrayList to store group members
        ArrayList<GroupMember> members = new ArrayList<>();
        members.add(new GroupMember("Nelson", "Njoku"));

        System.out.println("Group Members:");

        // Corrected method call to getFullName
        for (GroupMember member : members) {
            System.out.println("* " + member.getFullName());
        }
    }
}

class GroupMember {
    private String firstName;
    private String lastName;

    // Constructors
    public GroupMember(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and setter for first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter for last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // return the full name
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
