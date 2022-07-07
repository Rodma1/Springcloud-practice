package com.chen.dao.pojo;

import lombok.Data;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 16:56
 * @Version 1.0
 * @Description:
 */
@Data
public class User {

    private Long id;

    private String name;

    private Character gender;

    private Long bookId;
}
