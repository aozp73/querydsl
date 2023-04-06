package shop.mtcoding.querydsl.querydsl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.querydsl.dto.ItemDTO;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemDTO> findAllByDynamic(Integer searchType, String searchValue){
        return itemRepository.findAllByDynamic(searchType, searchValue);
    }

}

