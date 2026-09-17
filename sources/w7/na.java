package w7;
public abstract class na {
    public static t7.r f48274a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48274a == null) {
                    f48274a = new t7.r(2);
                }
                laVar = (la) f48274a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
