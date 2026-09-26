package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45500a;
    public final long f45501b;
    public final long f45502c;
    public final i d;
    public int e;
    public long f45503f;
    public long h;
    public long f45504n;
    public long f45505r;
    public long f45506s;
    public long v;
    public long f45507w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45501b = j3;
        this.f45502c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45503f = j12;
            this.e = 4;
        }
        this.f45500a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45504n = d0.i(j3, 0L, this.f45503f - 1);
        this.e = 2;
        this.f45505r = this.f45501b;
        this.f45506s = this.f45502c;
        this.v = 0L;
        this.f45507w = this.f45503f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45503f != 0) {
            return new a(this);
        }
        return null;
    }
}
