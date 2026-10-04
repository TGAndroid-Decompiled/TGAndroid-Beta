package w7;
public abstract class na {
    public static t7.r f48790a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48790a == null) {
                    f48790a = new t7.r(2);
                }
                laVar = (la) f48790a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
