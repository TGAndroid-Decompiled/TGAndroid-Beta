package w7;
public abstract class la {
    public static t7.r f52646a;

    public static synchronized ja a(ga gaVar) {
        ja jaVar;
        synchronized (la.class) {
            try {
                if (f52646a == null) {
                    f52646a = new t7.r(2);
                }
                jaVar = (ja) f52646a.R0(gaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jaVar;
    }
}
