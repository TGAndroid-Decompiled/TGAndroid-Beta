package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45501a;
    public final long f45502b;
    public final long f45503c;
    public final i d;
    public int e;
    public long f45504f;
    public long h;
    public long f45505n;
    public long f45506r;
    public long f45507s;
    public long v;
    public long f45508w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45502b = j3;
        this.f45503c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45504f = j12;
            this.e = 4;
        }
        this.f45501a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45505n = d0.i(j3, 0L, this.f45504f - 1);
        this.e = 2;
        this.f45506r = this.f45502b;
        this.f45507s = this.f45503c;
        this.v = 0L;
        this.f45508w = this.f45504f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45504f != 0) {
            return new a(this);
        }
        return null;
    }
}
