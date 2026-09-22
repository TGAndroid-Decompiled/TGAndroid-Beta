package w7;
public abstract class na {
    public static t7.r f45107a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45107a == null) {
                    f45107a = new t7.r(2);
                }
                laVar = (la) f45107a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
