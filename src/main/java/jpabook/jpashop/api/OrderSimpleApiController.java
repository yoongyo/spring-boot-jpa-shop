package jpabook.jpashop.api;


import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import jpabook.jpashop.repository.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


/**
 * xToOne(ManyToOne, OneToOne)
 * Order
 * Order -> Member
 * Order -> Delivery
 */
@RestController
@RequiredArgsConstructor
public class OrderSimpleApiController {

    private final OrderRepository orderRepository;

//    @GetMapping("/api/v1/simple-orders")
//    public List<Order> ordersV1() {
//
//    }
//    @GetMapping("/api/v2/simple-orders")
//    public List<SimpleOrderDto> ordersV2() {
//        orderRepository.fina
//    }
//
//    @Data
//    static class SimpleOrderDto {
//        private Long orderId;
//        private String name;
//        private LocalDateTime orderDate;
//        private OrderStatus orderStatus;
//        private Address address;
//
//        public SimpleOrderDto(Order order) {
//            orderId = order.getId();
//            order.getMember().getName();
//        }
//    }


}
