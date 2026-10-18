package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49182a;
    public final long f49183b;
    public final long f49184c;
    public final i d;
    public int e;
    public long f49185f;
    public long h;
    public long f49186n;
    public long f49187r;
    public long f49188s;
    public long v;
    public long f49189w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49183b = j10;
        this.f49184c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49185f = j13;
            this.e = 4;
        }
        this.f49182a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49186n = m0.j(j10, 0L, this.f49185f - 1);
        this.e = 2;
        this.f49187r = this.f49183b;
        this.f49188s = this.f49184c;
        this.v = 0L;
        this.f49189w = this.f49185f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49185f != 0) {
            return new a(this);
        }
        return null;
    }
}
