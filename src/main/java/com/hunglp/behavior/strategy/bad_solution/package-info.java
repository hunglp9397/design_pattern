package com.hunglp.behavior.strategy.bad_solution;



/*
    Solution: Tạo 2 interface là Flyable và Quackable

    -> Giải quyết được:
            + Rubber Quack là trường hợp đặc biệt, ko implement fly() và quack()

    -> Vấn đề:

            + Bất kì khi nào Flyable và Quackable thay đổi method -> Phài tìm xuống tất cả các class mà implement 2 interface này đ mà sửa -> Tốn effort
            +


 */