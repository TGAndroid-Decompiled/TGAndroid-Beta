package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f49271a;
    public final long f49272b;
    public final long f49273c;
    public final i d;
    public int f49274e;
    public long f49275f;
    public long h;
    public long f49276n;
    public long f49277r;
    public long f49278s;
    public long v;
    public long f49279w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f49272b = j3;
        this.f49273c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f49274e = 0;
        } else {
            this.f49275f = j12;
            this.f49274e = 4;
        }
        this.f49271a = new f();
    }

    @Override
    public final void C(long j3) {
        this.f49276n = d0.i(j3, 0L, this.f49275f - 1);
        this.f49274e = 2;
        this.f49277r = this.f49272b;
        this.f49278s = this.f49273c;
        this.v = 0L;
        this.f49279w = this.f49275f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f49275f != 0) {
            return new a(this);
        }
        return null;
    }
}
