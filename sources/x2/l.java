package x2;

import d2.v;
public abstract class l extends f {
    public final long f58174s;

    public l(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, long j10, long j11, long j12) {
        super(hVar, nVar, 1, vVar, i3, obj, j10, j11);
        vVar.getClass();
        this.f58174s = j12;
    }

    public long b() {
        long j10 = this.f58174s;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean c();
}
