package w7;
public abstract class na {
    public static t7.r f44812a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f44812a == null) {
                    f44812a = new t7.r(2);
                }
                laVar = (la) f44812a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
