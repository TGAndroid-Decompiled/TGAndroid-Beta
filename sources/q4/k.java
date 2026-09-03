package q4;

import g5.p;
import j3.n0;
public abstract class k extends e {
    public final long f42781s;

    public k(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(mVar, pVar, 1, n0Var, i10, obj, j10, j11);
        n0Var.getClass();
        this.f42781s = j12;
    }

    public long c() {
        long j10 = this.f42781s;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean d();
}
