package z7;
public abstract class oa {
    public static a8.za f59914a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f59914a == null) {
                    f59914a = new a8.za(4);
                }
                maVar = (ma) f59914a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
