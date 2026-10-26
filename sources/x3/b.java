package x3;

import a8.yb;
import c3.b0;
import e2.n0;
public final class b implements g {
    public final f f51365a;
    public final long f51366b;
    public final long f51367c;
    public final i d;
    public int e;
    public long f51368f;
    public long h;
    public long f51369n;
    public long f51370r;
    public long f51371s;
    public long v;
    public long f51372w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        this.d = iVar;
        this.f51366b = j10;
        this.f51367c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f51368f = j13;
            this.e = 4;
        }
        this.f51365a = new f();
    }

    @Override
    public final void N0(long j10) {
        this.f51369n = n0.j(j10, 0L, this.f51368f - 1);
        this.e = 2;
        this.f51370r = this.f51366b;
        this.f51371s = this.f51367c;
        this.v = 0L;
        this.f51372w = this.f51368f;
    }

    @Override
    public final b0 U() {
        if (this.f51368f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final long w(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.w(c3.p):long");
    }
}
