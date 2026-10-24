package x3;

import c3.e0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49633a;
    public final long f49634b;
    public final long f49635c;
    public final i d;
    public int e;
    public long f49636f;
    public long h;
    public long f49637n;
    public long f49638r;
    public long f49639s;
    public long v;
    public long f49640w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49634b = j10;
        this.f49635c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49636f = j13;
            this.e = 4;
        }
        this.f49633a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49637n = m0.j(j10, 0L, this.f49636f - 1);
        this.e = 2;
        this.f49638r = this.f49634b;
        this.f49639s = this.f49635c;
        this.v = 0L;
        this.f49640w = this.f49636f;
    }

    @Override
    public final long k(c3.r r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.r):long");
    }

    @Override
    public final e0 x() {
        if (this.f49636f != 0) {
            return new a(this);
        }
        return null;
    }
}
