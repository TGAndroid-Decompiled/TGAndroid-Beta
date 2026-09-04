package v2;

import b2.s;
public abstract class k extends e {
    public final long f47323s;

    public k(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11) {
        super(hVar, mVar, 1, sVar, i10, obj, j3, j10);
        sVar.getClass();
        this.f47323s = j11;
    }

    public long b() {
        long j3 = this.f47323s;
        if (j3 == -1) {
            return -1L;
        }
        return j3 + 1;
    }

    public abstract boolean c();
}
