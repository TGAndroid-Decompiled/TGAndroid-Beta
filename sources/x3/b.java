package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50671a;
    public final long f50672b;
    public final long f50673c;
    public final i d;
    public int f50674e;
    public long f50675f;
    public long h;
    public long f50676n;
    public long f50677r;
    public long f50678s;
    public long v;
    public long f50679w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50672b = j3;
        this.f50673c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50674e = 0;
        } else {
            this.f50675f = j12;
            this.f50674e = 4;
        }
        this.f50671a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f50675f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f50676n = d0.i(j3, 0L, this.f50675f - 1);
        this.f50674e = 2;
        this.f50677r = this.f50672b;
        this.f50678s = this.f50673c;
        this.v = 0L;
        this.f50679w = this.f50675f;
    }
}
