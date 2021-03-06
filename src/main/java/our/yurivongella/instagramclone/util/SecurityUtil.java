package our.yurivongella.instagramclone.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {

    private SecurityUtil() {

    }

    // SecurityContext 에 유저 정보가 저장되는 시점
    // 1. 로그인 할 때는 AuthController 에서 인증 완료 후 저장
    // 2. Request 가 들어올 때 JwtFilter 의 doFilter 메서드에서 저장
    public static Long getCurrentMemberId() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || authentication.getName() == null) {
            throw new RuntimeException("Security Context 에 인증 정보가 없습니다.");
        }

        return Long.parseLong(authentication.getName());
    }
}