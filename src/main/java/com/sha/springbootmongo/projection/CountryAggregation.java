package com.sha.springbootmongo.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:04 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryAggregation
{
    private @Id String country;
    private Long total;
}
