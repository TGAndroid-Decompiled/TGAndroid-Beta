package x3;

import c3.b0;
import e2.l0;
import v7.t6;
public final class b implements g {
    public final f f52978a;
    public final long f52979b;
    public final long f52980c;
    public final i d;
    public int e;
    public long f52981f;
    public long h;
    public long f52982n;
    public long f52983r;
    public long f52984s;
    public long f52985w;
    public long f52986x;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z11);
        this.d = iVar;
        this.f52979b = j10;
        this.f52980c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f52981f = j13;
            this.e = 4;
        }
        this.f52978a = new f();
    }

    @Override
    public final b0 E() {
        if (this.f52981f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void b0(long j10) {
        this.f52982n = l0.j(j10, 0L, this.f52981f - 1);
        this.e = 2;
        this.f52983r = this.f52979b;
        this.f52984s = this.f52980c;
        this.f52985w = 0L;
        this.f52986x = this.f52981f;
    }

    @Override
    public final long w(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.w(c3.p):long");
    }
}
