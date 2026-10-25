package v2;

import b2.x;
public abstract class l extends f {
    public final long f50025s;

    public l(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, mVar, 1, xVar, i10, obj, j10, j11);
        xVar.getClass();
        this.f50025s = j12;
    }

    public long a() {
        long j10 = this.f50025s;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean c();
}
