package w7;
public abstract class na {
    public static t7.r f45072a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45072a == null) {
                    f45072a = new t7.r(2);
                }
                laVar = (la) f45072a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
