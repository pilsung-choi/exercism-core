package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    // 1.1 스타트
    int discount(Member member, int price);
}
