package w7;
public abstract class na {
    public static t7.r f49228a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f49228a == null) {
                    f49228a = new t7.r(2);
                }
                laVar = (la) f49228a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
