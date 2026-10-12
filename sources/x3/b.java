package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50786a;
    public final long f50787b;
    public final long f50788c;
    public final i d;
    public int f50789e;
    public long f50790f;
    public long h;
    public long f50791n;
    public long f50792r;
    public long f50793s;
    public long v;
    public long f50794w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50787b = j3;
        this.f50788c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50789e = 0;
        } else {
            this.f50790f = j12;
            this.f50789e = 4;
        }
        this.f50786a = new f();
    }

    @Override
    public final b0 A1() {
        if (this.f50790f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void A2(long j3) {
        this.f50791n = d0.i(j3, 0L, this.f50790f - 1);
        this.f50789e = 2;
        this.f50792r = this.f50787b;
        this.f50793s = this.f50788c;
        this.v = 0L;
        this.f50794w = this.f50790f;
    }

    @Override
    public final long L0(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.L0(c3.p):long");
    }
}
