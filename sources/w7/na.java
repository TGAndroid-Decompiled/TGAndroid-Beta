package w7;
public abstract class na {
    public static t7.r f45071a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45071a == null) {
                    f45071a = new t7.r(2);
                }
                laVar = (la) f45071a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
