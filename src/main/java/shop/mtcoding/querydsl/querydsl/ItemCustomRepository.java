package shop.mtcoding.querydsl.querydsl;

import shop.mtcoding.querydsl.dto.ItemDTO;

import java.util.List;

// QueryDsl 매핑 인터페이스 생성
public interface ItemCustomRepository {

    List<ItemDTO> findAllByDynamic(Integer searchType, String searchValue);

}
