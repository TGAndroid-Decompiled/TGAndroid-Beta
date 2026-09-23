package w7;
public abstract class na {
    public static t7.r f44739a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f44739a == null) {
                    f44739a = new t7.r(2);
                }
                laVar = (la) f44739a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
