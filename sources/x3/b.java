package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f48774a;
    public final long f48775b;
    public final long f48776c;
    public final i d;
    public int f48777e;
    public long f48778f;
    public long h;
    public long f48779n;
    public long f48780r;
    public long f48781s;
    public long v;
    public long f48782w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f48775b = j3;
        this.f48776c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f48777e = 0;
        } else {
            this.f48778f = j12;
            this.f48777e = 4;
        }
        this.f48774a = new f();
    }

    @Override
    public final long a(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.a(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f48778f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f48779n = d0.i(j3, 0L, this.f48778f - 1);
        this.f48777e = 2;
        this.f48780r = this.f48775b;
        this.f48781s = this.f48776c;
        this.v = 0L;
        this.f48782w = this.f48778f;
    }
}
