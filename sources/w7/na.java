package w7;
public abstract class na {
    public static t7.r f50092a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f50092a == null) {
                    f50092a = new t7.r(2);
                }
                laVar = (la) f50092a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
