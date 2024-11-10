package hello.core.singleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 하나만 생성해둔다
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메소드들을 통해서만 조회하도록 한다.
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 외부에서 생성하지 못하도록 생성자를 private로 생성한다.
    private SingletonService() {
    }

    public void logic(){
        System.out.println("Singleton Logic Called");
    }
}
