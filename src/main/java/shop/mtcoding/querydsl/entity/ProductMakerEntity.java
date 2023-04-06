package shop.mtcoding.querydsl.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PRODUCT_MAKER")
@EqualsAndHashCode(of = "id", callSuper = false)
public class ProductMakerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "maker_name")
    private String makerName;


}
