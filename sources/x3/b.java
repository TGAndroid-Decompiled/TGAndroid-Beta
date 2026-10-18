package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49229a;
    public final long f49230b;
    public final long f49231c;
    public final i d;
    public int e;
    public long f49232f;
    public long h;
    public long f49233n;
    public long f49234r;
    public long f49235s;
    public long v;
    public long f49236w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49230b = j10;
        this.f49231c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49232f = j13;
            this.e = 4;
        }
        this.f49229a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49233n = m0.j(j10, 0L, this.f49232f - 1);
        this.e = 2;
        this.f49234r = this.f49230b;
        this.f49235s = this.f49231c;
        this.v = 0L;
        this.f49236w = this.f49232f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49232f != 0) {
            return new a(this);
        }
        return null;
    }
}
