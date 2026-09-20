package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45518a;
    public final long f45519b;
    public final long f45520c;
    public final i d;
    public int e;
    public long f45521f;
    public long h;
    public long f45522n;
    public long f45523r;
    public long f45524s;
    public long v;
    public long f45525w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45519b = j3;
        this.f45520c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45521f = j12;
            this.e = 4;
        }
        this.f45518a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45522n = d0.i(j3, 0L, this.f45521f - 1);
        this.e = 2;
        this.f45523r = this.f45519b;
        this.f45524s = this.f45520c;
        this.v = 0L;
        this.f45525w = this.f45521f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45521f != 0) {
            return new a(this);
        }
        return null;
    }
}
