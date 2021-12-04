package kr.siyeon.Board.domain.repository;

import kr.siyeon.Board.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
