package ssafy.project.jobterview.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ssafy.project.jobterview.domain.Member;
import ssafy.project.jobterview.dto.MemberDto;
import ssafy.project.jobterview.dto.UpdatePasswordDto;

import java.util.Optional;

public interface MemberService {
    public Member save(Member member);

    public Member findByEmail(String email);

    Optional<Member> findByNickname(String nickname);

    public void quit(String email);

    public Page<Member> findByNicknameContains(Pageable pageable, String keyword);
<<<<<<< HEAD
=======
    public Page<Member> findByEmailContains(Pageable pageable, String keyword);

    public Page<Member> findAll(Pageable pageable);

    public void update(String email);
>>>>>>> 4cfa8b4 (관리자, 메이트, 쪽지 완성)
}
