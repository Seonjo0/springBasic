package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 추상화에만 의존하게된 코드.

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member getMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
