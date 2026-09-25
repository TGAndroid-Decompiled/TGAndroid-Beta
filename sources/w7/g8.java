package w7;

import android.os.SystemClock;
public abstract class g8 {
    public static ki.w a(x2.r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new ki.w(1, 0, length, i10);
    }
}
