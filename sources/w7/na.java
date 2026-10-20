package w7;
public abstract class na {
    public static t7.r f48786a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48786a == null) {
                    f48786a = new t7.r(2);
                }
                laVar = (la) f48786a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
