package x3;

import c3.e0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f49634a;
    public final long f49635b;
    public final long f49636c;
    public final i d;
    public int e;
    public long f49637f;
    public long h;
    public long f49638n;
    public long f49639r;
    public long f49640s;
    public long v;
    public long f49641w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f49635b = j10;
        this.f49636c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f49637f = j13;
            this.e = 4;
        }
        this.f49634a = new f();
    }

    @Override
    public final void X(long j10) {
        this.f49638n = m0.j(j10, 0L, this.f49637f - 1);
        this.e = 2;
        this.f49639r = this.f49635b;
        this.f49640s = this.f49636c;
        this.v = 0L;
        this.f49641w = this.f49637f;
    }

    @Override
    public final long k(c3.r r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.k(c3.r):long");
    }

    @Override
    public final e0 x() {
        if (this.f49637f != 0) {
            return new a(this);
        }
        return null;
    }
}
