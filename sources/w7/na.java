package w7;
public abstract class na {
    public static t7.r f50213a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f50213a == null) {
                    f50213a = new t7.r(2);
                }
                laVar = (la) f50213a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
