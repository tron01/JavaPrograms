
public class ArrayIssue {

    public static void main(String args[]) {

        try {
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 10;
            arr[2] = 11;

            // error only fixed length possible
            arr[3] = 111;

            for (int i : arr) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.err.println("Hai");
        }

    }

}
