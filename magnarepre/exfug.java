public class Wrapper {
    private String version;
    
    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        String version = "1.0.0";
        wrapper.setVersion(version);
        System.out.println(wrapper.getVersion());  // Output: "1.0.0"
    }
}
