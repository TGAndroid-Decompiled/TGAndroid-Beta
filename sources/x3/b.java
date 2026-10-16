package x3;

import c3.b0;
import e2.m0;
import v7.u6;
public final class b implements g {
    public final f f47795a;
    public final long f47796b;
    public final long f47797c;
    public final i d;
    public int e;
    public long f47798f;
    public long h;
    public long f47799n;
    public long f47800r;
    public long f47801s;
    public long v;
    public long f47802w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.d = iVar;
        this.f47796b = j10;
        this.f47797c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f47798f = j13;
            this.e = 4;
        }
        this.f47795a = new f();
    }

    @Override
    public final void g0(long j10) {
        this.f47799n = m0.j(j10, 0L, this.f47798f - 1);
        this.e = 2;
        this.f47800r = this.f47796b;
        this.f47801s = this.f47797c;
        this.v = 0L;
        this.f47802w = this.f47798f;
    }

    @Override
    public final long l(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.l(c3.p):long");
    }

    @Override
    public final b0 y() {
        if (this.f47798f != 0) {
            return new a(this);
        }
        return null;
    }
}
