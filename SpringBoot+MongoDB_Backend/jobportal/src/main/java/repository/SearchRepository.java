package repository;
import model.Post;
import java.util.List;

public interface SearchRepository {
	List<Post> findByText(String text);

}
