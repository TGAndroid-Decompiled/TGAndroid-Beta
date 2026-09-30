package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45502a;
    public final long f45503b;
    public final long f45504c;
    public final i d;
    public int e;
    public long f45505f;
    public long h;
    public long f45506n;
    public long f45507r;
    public long f45508s;
    public long v;
    public long f45509w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45503b = j3;
        this.f45504c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45505f = j12;
            this.e = 4;
        }
        this.f45502a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45506n = d0.i(j3, 0L, this.f45505f - 1);
        this.e = 2;
        this.f45507r = this.f45503b;
        this.f45508s = this.f45504c;
        this.v = 0L;
        this.f45509w = this.f45505f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45505f != 0) {
            return new a(this);
        }
        return null;
    }
}
