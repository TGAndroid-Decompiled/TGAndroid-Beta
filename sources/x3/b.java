package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f49256a;
    public final long f49257b;
    public final long f49258c;
    public final i d;
    public int f49259e;
    public long f49260f;
    public long h;
    public long f49261n;
    public long f49262r;
    public long f49263s;
    public long v;
    public long f49264w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f49257b = j3;
        this.f49258c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f49259e = 0;
        } else {
            this.f49260f = j12;
            this.f49259e = 4;
        }
        this.f49256a = new f();
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f49260f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void y(long j3) {
        this.f49261n = d0.i(j3, 0L, this.f49260f - 1);
        this.f49259e = 2;
        this.f49262r = this.f49257b;
        this.f49263s = this.f49258c;
        this.v = 0L;
        this.f49264w = this.f49260f;
    }
}
