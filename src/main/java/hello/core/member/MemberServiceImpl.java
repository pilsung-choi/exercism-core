package hello.core.member;

public class MemberServiceImpl implements MemberService {
    //인터페이스를 통한 구현
    private final MemberRepository memberRepository;

    // 생성자를 통해서 의존 연결고리를 끊어줌
    // 왜, 어떻게 달라지는지 이해 필요
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
        // test
    }
}
