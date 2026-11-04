package z3;

import b8.zb;
import e3.b0;
import g2.n0;
public final class b implements g {
    public final f f59651a;
    public final long f59652b;
    public final long f59653c;
    public final i d;
    public int f59654e;
    public long f59655f;
    public long h;
    public long f59656n;
    public long f59657r;
    public long f59658s;
    public long f59659w;
    public long f59660x;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        this.d = iVar;
        this.f59652b = j10;
        this.f59653c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f59654e = 0;
        } else {
            this.f59655f = j13;
            this.f59654e = 4;
        }
        this.f59651a = new f();
    }

    @Override
    public final long D(e3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.D(e3.p):long");
    }

    @Override
    public final b0 O() {
        if (this.f59655f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void u0(long j10) {
        this.f59656n = n0.j(j10, 0L, this.f59655f - 1);
        this.f59654e = 2;
        this.f59657r = this.f59652b;
        this.f59658s = this.f59653c;
        this.f59659w = 0L;
        this.f59660x = this.f59655f;
    }
}
