package y7;

import a8.qg;
public abstract class ea {
    public static qg f52196a;

    public static synchronized ca a(z9 z9Var) {
        ca caVar;
        synchronized (ea.class) {
            try {
                if (f52196a == null) {
                    f52196a = new qg(4);
                }
                caVar = (ca) f52196a.R0(z9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return caVar;
    }

    public static synchronized ca b() {
        ca a2;
        synchronized (ea.class) {
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
