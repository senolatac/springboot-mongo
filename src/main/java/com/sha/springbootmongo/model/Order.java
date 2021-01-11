package com.sha.springbootmongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author sa
 * @date 1/10/21
 * @time 11:51 AM
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
public class Order
{
    @Id
    private String id;

    private String userId;

    private String orderName;

    private LocalDateTime orderTime;
}
