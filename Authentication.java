package string.api;
@FunctionalInterface
public interface Authentication {

	boolean authentication(String username, String password);
}
