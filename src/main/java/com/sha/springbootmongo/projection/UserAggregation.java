package com.sha.springbootmongo.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Set;

/**
 * @author sa
 * @date 1/10/21
 * @time 12:07 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAggregation
{
    private @Id String country;
    private Set<String> names;
}
