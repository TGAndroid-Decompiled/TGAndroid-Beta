package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f48775a;
    public final long f48776b;
    public final long f48777c;
    public final i d;
    public int f48778e;
    public long f48779f;
    public long h;
    public long f48780n;
    public long f48781r;
    public long f48782s;
    public long v;
    public long f48783w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f48776b = j3;
        this.f48777c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f48778e = 0;
        } else {
            this.f48779f = j12;
            this.f48778e = 4;
        }
        this.f48775a = new f();
    }

    @Override
    public final long a(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.a(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f48779f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f48780n = d0.i(j3, 0L, this.f48779f - 1);
        this.f48778e = 2;
        this.f48781r = this.f48776b;
        this.f48782s = this.f48777c;
        this.v = 0L;
        this.f48783w = this.f48779f;
    }
}
