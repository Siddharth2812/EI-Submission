
interface TrafficLightState {
    void handleRequest();
}

class RedLightState implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Red Light: Stop.");
    }
}

class YellowLightState implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Yellow Light: Slow down.");
    }
}

class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest() {
        System.out.println("Green Light: Go.");
    }
}

class TrafficLight {
    private TrafficLightState currentState;

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void changeLight() {
        currentState.handleRequest();
    }
}

public class statePattern {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.setState(new RedLightState());
        light.changeLight(); 

        light.setState(new YellowLightState());
        light.changeLight(); 

        light.setState(new GreenLightState());
        light.changeLight(); 
    }
}
