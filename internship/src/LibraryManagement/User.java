package LibraryManagement;

public class User {
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    
    public int getUserId() { return userId; }

    @Override
    public String toString() {
        return "User: " + name + " (ID: " + userId + ")";
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
