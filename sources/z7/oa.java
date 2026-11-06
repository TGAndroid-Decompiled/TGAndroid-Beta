package z7;
public abstract class oa {
    public static a8.za f59815a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f59815a == null) {
                    f59815a = new a8.za(4);
                }
                maVar = (ma) f59815a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
