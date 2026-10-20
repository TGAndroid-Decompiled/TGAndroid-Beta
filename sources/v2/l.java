package v2;

import b2.w;
public abstract class l extends f {
    public final long f47913s;

    public l(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, mVar, 1, wVar, i10, obj, j10, j11);
        wVar.getClass();
        this.f47913s = j12;
    }

    public long b() {
        long j10 = this.f47913s;
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 1;
    }

    public abstract boolean c();
}
