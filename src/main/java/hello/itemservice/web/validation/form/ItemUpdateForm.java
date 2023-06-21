package hello.itemservice.web.validation.form;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    private Integer price;

    // 수정에서의 수량은 자유롭게 변경
    private Integer quantity;
}
