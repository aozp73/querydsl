package shop.mtcoding.querydsl.querydsl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.querydsl.dto.ItemDTO;

@RestController
@RequestMapping(value = "itemTable")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("")
    public ResponseEntity<?> findAllByDynamic(
            @RequestParam(value = "searchType", defaultValue = "0") Integer searchType,
            @RequestParam(value = "searchValue", defaultValue = "") String searchValue,
            Model model){

        List<ItemDTO> itemDTOList = itemService.findAllByDynamic(searchType, searchValue);

        return new ResponseEntity<>(itemDTOList, HttpStatus.OK);
    }

}
