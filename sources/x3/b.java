package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f48804a;
    public final long f48805b;
    public final long f48806c;
    public final i d;
    public int f48807e;
    public long f48808f;
    public long h;
    public long f48809n;
    public long f48810r;
    public long f48811s;
    public long v;
    public long f48812w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f48805b = j3;
        this.f48806c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f48807e = 0;
        } else {
            this.f48808f = j12;
            this.f48807e = 4;
        }
        this.f48804a = new f();
    }

    @Override
    public final long a(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.a(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f48808f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f48809n = d0.i(j3, 0L, this.f48808f - 1);
        this.f48807e = 2;
        this.f48810r = this.f48805b;
        this.f48811s = this.f48806c;
        this.v = 0L;
        this.f48812w = this.f48808f;
    }
}
