package x7;
public abstract class ha {
    public static t7.r f49022a;

    public static synchronized fa a(ba baVar) {
        fa faVar;
        synchronized (ha.class) {
            try {
                if (f49022a == null) {
                    f49022a = new t7.r(3);
                }
                faVar = (fa) f49022a.O0(baVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return faVar;
    }

    public static synchronized fa b() {
        fa a2;
        synchronized (ha.class) {
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
