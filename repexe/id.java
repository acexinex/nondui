import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] createdLotto = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Before sorting: " + Arrays.toString(createdLotto));
        
        Arrays.sort(createdLotto);
        
        System.out.println("After sorting: " + Arrays.toString(createdLotto));
    }
}
