package q4;

import android.os.SystemClock;
import java.util.List;
public final class g extends d5.c {
    public int f46261g;

    @Override
    public final void b(long j10, long j11, long j12, List list, n4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!e(this.f46261g, elapsedRealtime)) {
            return;
        }
        for (int i10 = this.f5324b - 1; i10 >= 0; i10--) {
            if (!e(i10, elapsedRealtime)) {
                this.f46261g = i10;
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public final int c() {
        return this.f46261g;
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
