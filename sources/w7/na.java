package w7;
public abstract class na {
    public static t7.r f48779a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48779a == null) {
                    f48779a = new t7.r(2);
                }
                laVar = (la) f48779a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
