package z7;
public abstract class zf {
    public static t7.r f51294a;

    public static synchronized xf a(tf tfVar) {
        xf xfVar;
        synchronized (zf.class) {
            try {
                if (f51294a == null) {
                    f51294a = new t7.r(4);
                }
                xfVar = (xf) f51294a.R0(tfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xfVar;
    }

    public static synchronized xf b() {
        xf a2;
        synchronized (zf.class) {
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
