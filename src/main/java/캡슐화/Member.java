package 캡슐화;

public class Member {
    // private 접근 제어자를 통해 변수를 선언해 주었기 때문에 외부에서 접근 할 수 없다.
    private int id;
    private String name;

    // 그래서 getter / setter 메소드를 통해 변수에 값을 저장해주고 가져 올 수 있게 해준다.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
