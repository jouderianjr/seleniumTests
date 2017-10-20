package br.unifor.testExamples;

public class AuthenticationService {
    private Database db;

    public AuthenticationService(Database db) {
        this.db = db;
    }

    public boolean signin(String username, String password) {
        User user = db.findUserByUsername(username);

        if (user != null) {
          if (user.getPassword().equals(password)) {
              return true;
          }
        }

        return false;
    }
}
