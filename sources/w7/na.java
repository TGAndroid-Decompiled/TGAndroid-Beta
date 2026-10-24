package w7;
public abstract class na {
    public static t7.r f49227a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f49227a == null) {
                    f49227a = new t7.r(2);
                }
                laVar = (la) f49227a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
