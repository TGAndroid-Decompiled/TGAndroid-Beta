package w7;
public abstract class na {
    public static t7.r f48805a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48805a == null) {
                    f48805a = new t7.r(2);
                }
                laVar = (la) f48805a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
