package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45539a;
    public final long f45540b;
    public final long f45541c;
    public final i d;
    public int e;
    public long f45542f;
    public long h;
    public long f45543n;
    public long f45544r;
    public long f45545s;
    public long v;
    public long f45546w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45540b = j3;
        this.f45541c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45542f = j12;
            this.e = 4;
        }
        this.f45539a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45543n = d0.i(j3, 0L, this.f45542f - 1);
        this.e = 2;
        this.f45544r = this.f45540b;
        this.f45545s = this.f45541c;
        this.v = 0L;
        this.f45546w = this.f45542f;
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 l() {
        if (this.f45542f != 0) {
            return new a(this);
        }
        return null;
    }
}
