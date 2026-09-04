package w7;
public abstract class f9 {
    public static int a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
