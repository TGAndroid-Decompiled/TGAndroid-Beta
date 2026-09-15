package w7;
public abstract class na {
    public static t7.r f44789a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f44789a == null) {
                    f44789a = new t7.r(2);
                }
                laVar = (la) f44789a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
