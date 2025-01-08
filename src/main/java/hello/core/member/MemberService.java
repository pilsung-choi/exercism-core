package hello.core.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}

// 회원 클래스 다이어그랩
/*
    <interface>
    MemberService
        ↑
    MemberServiceImpl   →   <interface>              ⇠   MemoryMemberRepository
                            MemberRepository         ⇠   DbMemberRepository
 */
