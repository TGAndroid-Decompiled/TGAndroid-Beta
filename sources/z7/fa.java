package z7;

import b8.ng;
public abstract class fa {
    public static ng f59875a;

    public static synchronized da a(aa aaVar) {
        da daVar;
        synchronized (fa.class) {
            try {
                if (f59875a == null) {
                    f59875a = new ng(4);
                }
                daVar = (da) f59875a.R0(aaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return daVar;
    }

    public static synchronized da b() {
        da a10;
        synchronized (fa.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 == 3) {
                a10 = a(new Object());
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
        return a10;
    }
}
