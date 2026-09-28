package w7;
public abstract class na {
    public static t7.r f45070a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45070a == null) {
                    f45070a = new t7.r(2);
                }
                laVar = (la) f45070a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
