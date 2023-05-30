package com.example.demo2.entity;

import javax.persistence.*;

@Entity //해당 클래스를 Entity클래스로 정의하겠다! 테이블을 자바 객체화할떄 사용되는 내용/DB의 테이블 역할을 한다 /여기에 작성하면 그 내용으로 DB에 생성이된다
@Table(name="nation_table") // 테이블 이름 지정
public class NationEntity {
     // @Entity를 정의할때 최소한 반드시 필요한조건은 pk가 하나 있어야함
    @Id //pk 컬럼 지정할때 씀
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_incrememt 적용
    private Long id;

    //column 추가
    @Column(length = 50, nullable = false, unique = true) //nullable은 null일수있다가 false면 결론은 notnull이다
    private String nationName; //국가이름 필드설정

    @Column
    private int population;




}
