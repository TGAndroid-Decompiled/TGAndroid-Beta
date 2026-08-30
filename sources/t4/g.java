package t4;

import android.os.SystemClock;
import java.util.List;
public final class g extends f5.c {
    public int f44482g;

    @Override
    public final int h() {
        return this.f44482g;
    }

    @Override
    public final Object j() {
        return null;
    }

    @Override
    public final int k() {
        return 0;
    }

    @Override
    public final void v(long j10, long j11, long j12, List list, q4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!o(this.f44482g, elapsedRealtime)) {
            return;
        }
        for (int i10 = this.f5913b - 1; i10 >= 0; i10--) {
            if (!o(i10, elapsedRealtime)) {
                this.f44482g = i10;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
