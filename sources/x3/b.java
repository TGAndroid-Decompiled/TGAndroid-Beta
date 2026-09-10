package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f44562a;
    public final long f44563b;
    public final long f44564c;
    public final i d;
    public int e;
    public long f44565f;
    public long h;
    public long f44566n;
    public long f44567r;
    public long f44568s;
    public long v;
    public long f44569w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f44563b = j3;
        this.f44564c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f44565f = j12;
            this.e = 4;
        }
        this.f44562a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 h() {
        if (this.f44565f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void y(long j3) {
        this.f44566n = d0.i(j3, 0L, this.f44565f - 1);
        this.e = 2;
        this.f44567r = this.f44563b;
        this.f44568s = this.f44564c;
        this.v = 0L;
        this.f44569w = this.f44565f;
    }
}
