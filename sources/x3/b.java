package x3;

import c3.c0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49192a;
    public final long f49193b;
    public final long f49194c;
    public final i d;
    public int e;
    public long f49195f;
    public long h;
    public long f49196n;
    public long f49197r;
    public long f49198s;
    public long v;
    public long f49199w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49193b = j10;
        this.f49194c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49195f = j13;
            this.e = 4;
        }
        this.f49192a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49196n = m0.j(j10, 0L, this.f49195f - 1);
        this.e = 2;
        this.f49197r = this.f49193b;
        this.f49198s = this.f49194c;
        this.v = 0L;
        this.f49199w = this.f49195f;
    }

    @Override
    public final long k(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.p):long");
    }

    @Override
    public final c0 x() {
        if (this.f49195f != 0) {
            return new a(this);
        }
        return null;
    }
}
