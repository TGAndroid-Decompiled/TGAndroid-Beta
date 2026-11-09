package z7;
public abstract class oa {
    public static a8.za f59924a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f59924a == null) {
                    f59924a = new a8.za(4);
                }
                maVar = (ma) f59924a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
