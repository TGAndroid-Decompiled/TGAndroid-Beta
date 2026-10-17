package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49204a;
    public final long f49205b;
    public final long f49206c;
    public final i d;
    public int e;
    public long f49207f;
    public long h;
    public long f49208n;
    public long f49209r;
    public long f49210s;
    public long v;
    public long f49211w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49205b = j10;
        this.f49206c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49207f = j13;
            this.e = 4;
        }
        this.f49204a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49208n = m0.j(j10, 0L, this.f49207f - 1);
        this.e = 2;
        this.f49209r = this.f49205b;
        this.f49210s = this.f49206c;
        this.v = 0L;
        this.f49211w = this.f49207f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49207f != 0) {
            return new a(this);
        }
        return null;
    }
}
