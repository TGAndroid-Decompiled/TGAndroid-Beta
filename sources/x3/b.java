package x3;

import a8.yb;
import c3.b0;
import e2.n0;
public final class b implements g {
    public final f f51423a;
    public final long f51424b;
    public final long f51425c;
    public final i d;
    public int e;
    public long f51426f;
    public long h;
    public long f51427n;
    public long f51428r;
    public long f51429s;
    public long v;
    public long f51430w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        this.d = iVar;
        this.f51424b = j10;
        this.f51425c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f51426f = j13;
            this.e = 4;
        }
        this.f51423a = new f();
    }

    @Override
    public final void N0(long j10) {
        this.f51427n = n0.j(j10, 0L, this.f51426f - 1);
        this.e = 2;
        this.f51428r = this.f51424b;
        this.f51429s = this.f51425c;
        this.v = 0L;
        this.f51430w = this.f51426f;
    }

    @Override
    public final b0 U() {
        if (this.f51426f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final long w(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.w(c3.p):long");
    }
}
