
class TV {
    public void on() {
        System.out.println("TV is ON.");
    }

    public void off() {
        System.out.println("TV is OFF.");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound system is ON.");
    }

    public void off() {
        System.out.println("Sound system is OFF.");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}

class Lights {
    public void dim(int level) {
        System.out.println("Dimming lights to " + level + "%.");
    }
}

class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, Lights lights) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Setting up movie...");
        lights.dim(30);
        soundSystem.on();
        soundSystem.setVolume(50);
        tv.on();
    }

    public void endMovie() {
        System.out.println("Shutting down...");
        tv.off();
        soundSystem.off();
        lights.dim(100);
    }
}

public class facadePattern {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, lights);

        homeTheater.watchMovie();  
        homeTheater.endMovie();    
    }
}