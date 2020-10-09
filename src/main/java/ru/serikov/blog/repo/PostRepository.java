package ru.serikov.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.serikov.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {


}
