package w7;
public abstract class na {
    public static t7.r f50136a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f50136a == null) {
                    f50136a = new t7.r(2);
                }
                laVar = (la) f50136a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
