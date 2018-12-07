package chap02;

public class Code003 {
    public static void main(String[] args) {
        System.out.println(chap02.Code001Kt.bigger(5, 7));
        System.out.println(Code001Kt.bigger(9, 7)); // 같은 패키지라면 패키지명 생략
        // System.out.println(bigger(5, 7)); // 불가 - Cannot resolve method 'bigger(int, int)'
    }
}