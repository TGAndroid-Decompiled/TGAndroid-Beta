package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45546a;
    public final long f45547b;
    public final long f45548c;
    public final i d;
    public int e;
    public long f45549f;
    public long h;
    public long f45550n;
    public long f45551r;
    public long f45552s;
    public long v;
    public long f45553w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45547b = j3;
        this.f45548c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45549f = j12;
            this.e = 4;
        }
        this.f45546a = new f();
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45549f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void y(long j3) {
        this.f45550n = d0.i(j3, 0L, this.f45549f - 1);
        this.e = 2;
        this.f45551r = this.f45547b;
        this.f45552s = this.f45548c;
        this.v = 0L;
        this.f45553w = this.f45549f;
    }
}
