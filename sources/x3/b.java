package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50593a;
    public final long f50594b;
    public final long f50595c;
    public final i d;
    public int f50596e;
    public long f50597f;
    public long h;
    public long f50598n;
    public long f50599r;
    public long f50600s;
    public long v;
    public long f50601w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50594b = j3;
        this.f50595c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50596e = 0;
        } else {
            this.f50597f = j12;
            this.f50596e = 4;
        }
        this.f50593a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f50597f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void l(long j3) {
        this.f50598n = d0.i(j3, 0L, this.f50597f - 1);
        this.f50596e = 2;
        this.f50599r = this.f50594b;
        this.f50600s = this.f50595c;
        this.v = 0L;
        this.f50601w = this.f50597f;
    }
}
