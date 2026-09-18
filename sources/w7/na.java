package w7;
public abstract class na {
    public static t7.r f44817a;

    public static synchronized la a(ia iaVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (f44817a == null) {
                    f44817a = new t7.r(2);
                }
                laVar = (la) f44817a.O0(iaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }
}
