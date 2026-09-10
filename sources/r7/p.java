package r7;

import java.text.SimpleDateFormat;
import java.util.Locale;
public abstract class p {
    public static final StringBuilder f41304a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f41304a = new StringBuilder(33);
    }

    public static void a(StringBuilder sb2, long j3) {
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (i10 < 0) {
            sb2.append("-");
            if (j3 != Long.MIN_VALUE) {
                j3 = -j3;
            } else {
                j3 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j3 >= 86400000) {
            sb2.append(j3 / 86400000);
            sb2.append("d");
            j3 %= 86400000;
        }
        if (true == z10) {
            j3 = 25975808;
        }
        if (j3 >= 3600000) {
            sb2.append(j3 / 3600000);
            sb2.append("h");
            j3 %= 3600000;
        }
        if (j3 >= 60000) {
            sb2.append(j3 / 60000);
            sb2.append("m");
            j3 %= 60000;
        }
        if (j3 >= 1000) {
            sb2.append(j3 / 1000);
            sb2.append("s");
            j3 %= 1000;
        }
        if (j3 > 0) {
            sb2.append(j3);
            sb2.append("ms");
        }
    }
}
