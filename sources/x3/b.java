package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f49264a;
    public final long f49265b;
    public final long f49266c;
    public final i d;
    public int f49267e;
    public long f49268f;
    public long h;
    public long f49269n;
    public long f49270r;
    public long f49271s;
    public long v;
    public long f49272w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f49265b = j3;
        this.f49266c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f49267e = 0;
        } else {
            this.f49268f = j12;
            this.f49267e = 4;
        }
        this.f49264a = new f();
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f49268f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void y(long j3) {
        this.f49269n = d0.i(j3, 0L, this.f49268f - 1);
        this.f49267e = 2;
        this.f49270r = this.f49265b;
        this.f49271s = this.f49266c;
        this.v = 0L;
        this.f49272w = this.f49268f;
    }
}
