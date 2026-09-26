package w7;
public abstract class na {
    public static t7.r f45069a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f45069a == null) {
                    f45069a = new t7.r(2);
                }
                laVar = (la) f45069a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
