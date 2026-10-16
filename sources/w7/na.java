package w7;
public abstract class na {
    public static t7.r f47393a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f47393a == null) {
                    f47393a = new t7.r(2);
                }
                laVar = (la) f47393a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
