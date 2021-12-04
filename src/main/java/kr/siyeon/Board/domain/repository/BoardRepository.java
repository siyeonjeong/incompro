package kr.siyeon.Board.domain.repository;

import kr.siyeon.Board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
