package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49183a;
    public final long f49184b;
    public final long f49185c;
    public final i d;
    public int e;
    public long f49186f;
    public long h;
    public long f49187n;
    public long f49188r;
    public long f49189s;
    public long v;
    public long f49190w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49184b = j10;
        this.f49185c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49186f = j13;
            this.e = 4;
        }
        this.f49183a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49187n = m0.j(j10, 0L, this.f49186f - 1);
        this.e = 2;
        this.f49188r = this.f49184b;
        this.f49189s = this.f49185c;
        this.v = 0L;
        this.f49190w = this.f49186f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49186f != 0) {
            return new a(this);
        }
        return null;
    }
}
