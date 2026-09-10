package w7;
public abstract class na {
    public static t7.r f43749a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f43749a == null) {
                    f43749a = new t7.r(2);
                }
                laVar = (la) f43749a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
