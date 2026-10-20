package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49188a;
    public final long f49189b;
    public final long f49190c;
    public final i d;
    public int e;
    public long f49191f;
    public long h;
    public long f49192n;
    public long f49193r;
    public long f49194s;
    public long v;
    public long f49195w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49189b = j10;
        this.f49190c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49191f = j13;
            this.e = 4;
        }
        this.f49188a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49192n = m0.j(j10, 0L, this.f49191f - 1);
        this.e = 2;
        this.f49193r = this.f49189b;
        this.f49194s = this.f49190c;
        this.v = 0L;
        this.f49195w = this.f49191f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49191f != 0) {
            return new a(this);
        }
        return null;
    }
}
