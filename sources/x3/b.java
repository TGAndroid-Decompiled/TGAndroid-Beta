package x3;

import c3.b0;
import e2.l0;
import v7.t6;
public final class b implements g {
    public final f f52960a;
    public final long f52961b;
    public final long f52962c;
    public final i d;
    public int e;
    public long f52963f;
    public long h;
    public long f52964n;
    public long f52965r;
    public long f52966s;
    public long f52967w;
    public long f52968x;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z11);
        this.d = iVar;
        this.f52961b = j10;
        this.f52962c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.e = 0;
        } else {
            this.f52963f = j13;
            this.e = 4;
        }
        this.f52960a = new f();
    }

    @Override
    public final b0 E() {
        if (this.f52963f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void b0(long j10) {
        this.f52964n = l0.j(j10, 0L, this.f52963f - 1);
        this.e = 2;
        this.f52965r = this.f52961b;
        this.f52966s = this.f52962c;
        this.f52967w = 0L;
        this.f52968x = this.f52963f;
    }

    @Override
    public final long w(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.w(c3.p):long");
    }
}
