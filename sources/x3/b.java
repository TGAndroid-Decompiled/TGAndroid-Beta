package x3;

import f5.d0;
import o3.t;
public final class b implements g {
    public final f f50051a;
    public final long f50052b;
    public final long f50053c;
    public final i d;
    public int f50054e;
    public long f50055f;
    public long h;
    public long f50056n;
    public long f50057r;
    public long f50058s;
    public long v;
    public long f50059w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.f(z11);
        this.d = iVar;
        this.f50052b = j10;
        this.f50053c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f50054e = 0;
        } else {
            this.f50055f = j13;
            this.f50054e = 4;
        }
        this.f50051a = new f();
    }

    @Override
    public final long i(o3.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.i(o3.l):long");
    }

    @Override
    public final t v() {
        if (this.f50055f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void z(long j10) {
        this.f50056n = d0.i(j10, 0L, this.f50055f - 1);
        this.f50054e = 2;
        this.f50057r = this.f50052b;
        this.f50058s = this.f50053c;
        this.v = 0L;
        this.f50059w = this.f50055f;
    }
}
