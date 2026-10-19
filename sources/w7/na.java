package w7;
public abstract class na {
    public static t7.r f48781a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48781a == null) {
                    f48781a = new t7.r(2);
                }
                laVar = (la) f48781a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
