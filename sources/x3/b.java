package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45499a;
    public final long f45500b;
    public final long f45501c;
    public final i d;
    public int e;
    public long f45502f;
    public long h;
    public long f45503n;
    public long f45504r;
    public long f45505s;
    public long v;
    public long f45506w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45500b = j3;
        this.f45501c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45502f = j12;
            this.e = 4;
        }
        this.f45499a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45503n = d0.i(j3, 0L, this.f45502f - 1);
        this.e = 2;
        this.f45504r = this.f45500b;
        this.f45505s = this.f45501c;
        this.v = 0L;
        this.f45506w = this.f45502f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45502f != 0) {
            return new a(this);
        }
        return null;
    }
}
