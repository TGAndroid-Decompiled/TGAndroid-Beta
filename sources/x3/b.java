package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f48803a;
    public final long f48804b;
    public final long f48805c;
    public final i d;
    public int f48806e;
    public long f48807f;
    public long h;
    public long f48808n;
    public long f48809r;
    public long f48810s;
    public long v;
    public long f48811w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f48804b = j3;
        this.f48805c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f48806e = 0;
        } else {
            this.f48807f = j12;
            this.f48806e = 4;
        }
        this.f48803a = new f();
    }

    @Override
    public final long a(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.a(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f48807f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f48808n = d0.i(j3, 0L, this.f48807f - 1);
        this.f48806e = 2;
        this.f48809r = this.f48804b;
        this.f48810s = this.f48805c;
        this.v = 0L;
        this.f48811w = this.f48807f;
    }
}
