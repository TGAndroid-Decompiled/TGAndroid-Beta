package z7;
public abstract class yf {
    public static t7.r f51360a;

    public static synchronized wf a(sf sfVar) {
        wf wfVar;
        synchronized (yf.class) {
            try {
                if (f51360a == null) {
                    f51360a = new t7.r(4);
                }
                wfVar = (wf) f51360a.O0(sfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wfVar;
    }

    public static synchronized wf b() {
        wf a2;
        synchronized (yf.class) {
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
