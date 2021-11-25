package ec.mil.issfa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.issfa.api.models.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
    
}
