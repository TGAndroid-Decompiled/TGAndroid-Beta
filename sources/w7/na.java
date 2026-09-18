package w7;
public abstract class na {
    public static t7.r f45043a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45043a == null) {
                    f45043a = new t7.r(2);
                }
                laVar = (la) f45043a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
