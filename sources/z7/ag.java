package z7;
public abstract class ag {
    public static t7.r f50747a;

    public static synchronized yf a(uf ufVar) {
        yf yfVar;
        synchronized (ag.class) {
            try {
                if (f50747a == null) {
                    f50747a = new t7.r(4);
                }
                yfVar = (yf) f50747a.R0(ufVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yfVar;
    }

    public static synchronized yf b() {
        yf a2;
        synchronized (ag.class) {
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
