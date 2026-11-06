package r2;

import android.os.SystemClock;
import java.util.List;
public final class g extends a3.d {
    public int f54200g;

    @Override
    public final int d() {
        return this.f54200g;
    }

    @Override
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.f54200g, elapsedRealtime)) {
            return;
        }
        for (int i7 = this.f75b - 1; i7 >= 0; i7--) {
            if (!a(i7, elapsedRealtime)) {
                this.f54200g = i7;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object r() {
        return null;
    }
}
