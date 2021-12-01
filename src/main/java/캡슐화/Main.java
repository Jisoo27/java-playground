package 캡슐화;

public class Main {
    public static void main(String[] args) {
    Member member = new Member();

    member.setId(123);
    member.setName("coco");

        System.out.println(member.getId());
        System.out.println(member.getName());


    }
}
