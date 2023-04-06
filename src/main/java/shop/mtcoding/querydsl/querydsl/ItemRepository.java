package shop.mtcoding.querydsl.querydsl;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.mtcoding.querydsl.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity,Integer>, ItemCustomRepository {
    // ItemCustomRepository 에서 QueryDsl 매핑 인터페이스 생성
}
