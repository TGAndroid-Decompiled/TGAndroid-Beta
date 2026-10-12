package x3;

import c3.b0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f47796a;
    public final long f47797b;
    public final long f47798c;
    public final i d;
    public int e;
    public long f47799f;
    public long h;
    public long f47800n;
    public long f47801r;
    public long f47802s;
    public long v;
    public long f47803w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f47797b = j10;
        this.f47798c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f47799f = j13;
            this.e = 4;
        }
        this.f47796a = new f();
    }

    @Override
    public final void W(long j10) {
        this.f47800n = m0.j(j10, 0L, this.f47799f - 1);
        this.e = 2;
        this.f47801r = this.f47797b;
        this.f47802s = this.f47798c;
        this.v = 0L;
        this.f47803w = this.f47799f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final b0 v() {
        if (this.f47799f != 0) {
            return new a(this);
        }
        return null;
    }
}
