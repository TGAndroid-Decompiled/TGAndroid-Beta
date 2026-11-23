package z7;
public abstract class oa {
    public static a8.ab f61732a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f61732a == null) {
                    f61732a = new a8.ab(4);
                }
                maVar = (ma) f61732a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
