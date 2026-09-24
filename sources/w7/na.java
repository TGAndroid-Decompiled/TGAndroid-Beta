package w7;
public abstract class na {
    public static t7.r f45056a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45056a == null) {
                    f45056a = new t7.r(2);
                }
                laVar = (la) f45056a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
