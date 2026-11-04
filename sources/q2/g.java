package q2;

import android.os.SystemClock;
import java.util.List;
public final class g extends z2.c {
    public int f53679g;

    @Override
    public final int c() {
        return this.f53679g;
    }

    @Override
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.f53679g, elapsedRealtime)) {
            return;
        }
        for (int i3 = this.f59588b - 1; i3 >= 0; i3--) {
            if (!a(i3, elapsedRealtime)) {
                this.f53679g = i3;
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
