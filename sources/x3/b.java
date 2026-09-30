package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45608a;
    public final long f45609b;
    public final long f45610c;
    public final i d;
    public int e;
    public long f45611f;
    public long h;
    public long f45612n;
    public long f45613r;
    public long f45614s;
    public long v;
    public long f45615w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45609b = j3;
        this.f45610c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45611f = j12;
            this.e = 4;
        }
        this.f45608a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45612n = d0.i(j3, 0L, this.f45611f - 1);
        this.e = 2;
        this.f45613r = this.f45609b;
        this.f45614s = this.f45610c;
        this.v = 0L;
        this.f45615w = this.f45611f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45611f != 0) {
            return new a(this);
        }
        return null;
    }
}
