package w7;
public abstract class na {
    public static t7.r f50327a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f50327a == null) {
                    f50327a = new t7.r(2);
                }
                laVar = (la) f50327a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
