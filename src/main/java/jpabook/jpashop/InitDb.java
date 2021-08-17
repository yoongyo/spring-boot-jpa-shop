//package jpabook.jpashop;
//
//
//import jpabook.jpashop.domain.*;
//import jpabook.jpashop.domain.item.Book;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//
//
///**
// * 총 주문 2개
// *   * UserA
// *    * JPA1 BOOK
// *    * JPA2 BOOK
// *
// *  * UserB
// *    * SPRING Book
// *    * SPRING Book
// */
//
//
//@Component
//@RequiredArgsConstructor
//public class InitDb {
//
//    private final InitService initService;
//
//    @PostConstruct
//    public void init() {
////        initService.dbInit12();
////        initService.dbInit();
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService {
//        private final EntityManager em;
//
//        public void dbInit1() {
//            Member member = createMember("서울", "1");
//            em.persist(member);
//
//            Book book1 = new Book();
//            book1.setName("JPA1 BOOK");
//            book1.setPrice(10000);
//            book1.setStockQuantity(100);
//            em.persist(book1);
//
//            Book book2 = new Book();
//            book2.setName("JPA2 BOOK");
//            book2.setPrice(10000);
//            book2.setStockQuantity(100);
//            em.persist(book2);
//
//            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 10000, 1);
//            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 20000, 2);
//
//            Delivery delivery = new Delivery();
//            delivery.setAddress(member.getAddress());
//            Order order = Order.createOrder(member, delivery, orderItem1, orderItem2);
//            em.persist(order);
//        }
//
//        private Member createMember(String name, String city, String street, String zipcode) {
//            Member member = new Member();
//            member.setName("userA");
//            member.setAddress(new Address(name, city, street, zipcode));
//            return member;
//        }
//
//        public void dbInit2() {
//            Member member = createMember("w진주", "2");
//            em.persist(member);
//
//            Book book1 = new Book();
//            book1.setName("JPA1 BOOK");
//            book1.setPrice(10000);
//            book1.setStockQuantity(100);
//            em.persist(book1);
//
//            Book book2 = new Book();
//            book2.setName("JPA2 BOOK");
//            book2.setPrice(10000);
//            book2.setStockQuantity(100);
//            em.persist(book2);
//
//            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 10000, 1);
//            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 20000, 2);
//
//            Delivery delivery = new Delivery();
//            delivery.setAddress(member.getAddress());
//            Order order = Order.createOrder(member, delivery, orderItem1, orderItem2);
//            em.persist(order);
//        }
//    }
//
//}
//
