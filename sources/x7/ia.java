package x7;
public abstract class ia {
    public static t7.r f45776a;

    public static synchronized ga a(ca caVar) {
        ga gaVar;
        synchronized (ia.class) {
            try {
                if (f45776a == null) {
                    f45776a = new t7.r(3);
                }
                gaVar = (ga) f45776a.O0(caVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gaVar;
    }

    public static synchronized ga b() {
        ga a2;
        synchronized (ia.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a2 = a(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return a2;
    }
}
