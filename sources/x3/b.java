package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50778a;
    public final long f50779b;
    public final long f50780c;
    public final i d;
    public int f50781e;
    public long f50782f;
    public long h;
    public long f50783n;
    public long f50784r;
    public long f50785s;
    public long v;
    public long f50786w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50779b = j3;
        this.f50780c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50781e = 0;
        } else {
            this.f50782f = j12;
            this.f50781e = 4;
        }
        this.f50778a = new f();
    }

    @Override
    public final b0 A1() {
        if (this.f50782f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void A2(long j3) {
        this.f50783n = d0.i(j3, 0L, this.f50782f - 1);
        this.f50781e = 2;
        this.f50784r = this.f50779b;
        this.f50785s = this.f50780c;
        this.v = 0L;
        this.f50786w = this.f50782f;
    }

    @Override
    public final long L0(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.L0(c3.p):long");
    }
}
