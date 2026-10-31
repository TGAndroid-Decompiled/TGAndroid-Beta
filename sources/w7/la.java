package w7;
public abstract class la {
    public static t7.r f52628a;

    public static synchronized ja a(ga gaVar) {
        ja jaVar;
        synchronized (la.class) {
            try {
                if (f52628a == null) {
                    f52628a = new t7.r(2);
                }
                jaVar = (ja) f52628a.R0(gaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jaVar;
    }
}
