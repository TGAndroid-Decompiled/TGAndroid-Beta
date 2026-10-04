package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f49255a;
    public final long f49256b;
    public final long f49257c;
    public final i d;
    public int f49258e;
    public long f49259f;
    public long h;
    public long f49260n;
    public long f49261r;
    public long f49262s;
    public long v;
    public long f49263w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f49256b = j3;
        this.f49257c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f49258e = 0;
        } else {
            this.f49259f = j12;
            this.f49258e = 4;
        }
        this.f49255a = new f();
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f49259f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void y(long j3) {
        this.f49260n = d0.i(j3, 0L, this.f49259f - 1);
        this.f49258e = 2;
        this.f49261r = this.f49256b;
        this.f49262s = this.f49257c;
        this.v = 0L;
        this.f49263w = this.f49259f;
    }
}
