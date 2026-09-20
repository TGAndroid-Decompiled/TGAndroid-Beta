package w7;

import android.os.SystemClock;
public abstract class h8 {
    public static y2.g a(x2.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.a(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new y2.g(1, 0, length, i10);
    }
}
