package pastCampus.hello.design.adapter;

public class HairDryer implements Electronic100V {

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v On");
    }
}
