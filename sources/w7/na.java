package w7;
public abstract class na {
    public static t7.r f47394a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f47394a == null) {
                    f47394a = new t7.r(2);
                }
                laVar = (la) f47394a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
