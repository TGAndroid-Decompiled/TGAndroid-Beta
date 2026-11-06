package y2;

import e2.u;
public abstract class l extends f {
    public final long f58825s;

    public l(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11) {
        super(hVar, mVar, 1, uVar, i7, obj, j3, j10);
        uVar.getClass();
        this.f58825s = j11;
    }

    public long b() {
        long j3 = this.f58825s;
        if (j3 == -1) {
            return -1L;
        }
        return j3 + 1;
    }

    public abstract boolean c();
}
