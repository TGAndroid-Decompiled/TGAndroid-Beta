package w7;
public abstract class na {
    public static t7.r f44785a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f44785a == null) {
                    f44785a = new t7.r(2);
                }
                laVar = (la) f44785a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
