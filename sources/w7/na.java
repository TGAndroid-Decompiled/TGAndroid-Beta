package w7;
public abstract class na {
    public static t7.r f48780a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f48780a == null) {
                    f48780a = new t7.r(2);
                }
                laVar = (la) f48780a.R0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
