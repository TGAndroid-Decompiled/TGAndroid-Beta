package w7;
public abstract class na {
    public static t7.r f48827a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48827a == null) {
                    f48827a = new t7.r(2);
                }
                laVar = (la) f48827a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
