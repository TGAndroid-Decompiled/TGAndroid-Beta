package w7;
public abstract class na {
    public static t7.r f50090a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f50090a == null) {
                    f50090a = new t7.r(2);
                }
                laVar = (la) f50090a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
