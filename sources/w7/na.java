package w7;
public abstract class na {
    public static t7.r f48789a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48789a == null) {
                    f48789a = new t7.r(2);
                }
                laVar = (la) f48789a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
