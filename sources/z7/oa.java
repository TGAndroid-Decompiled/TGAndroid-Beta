package z7;
public abstract class oa {
    public static a8.ab f61687a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f61687a == null) {
                    f61687a = new a8.ab(4);
                }
                maVar = (ma) f61687a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
