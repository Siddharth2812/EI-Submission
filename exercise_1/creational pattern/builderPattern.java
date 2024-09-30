// Builder Pattern in Java

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", GPU=" + GPU + "]";
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Use case demonstration
public class builderPattern {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder("Intel i9", "16GB")
                            .storage("1TB SSD")
                            .GPU("NVIDIA RTX 3080")
                            .build();

        System.out.println(myComputer);
    }
}
