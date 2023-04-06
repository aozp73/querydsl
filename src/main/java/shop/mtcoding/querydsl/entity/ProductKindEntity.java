package shop.mtcoding.querydsl.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PRODUCT_KIND")
@EqualsAndHashCode(of = "id", callSuper = false)
public class ProductKindEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "kind_name")
    private String kindName;


}
