package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50637a;
    public final long f50638b;
    public final long f50639c;
    public final i d;
    public int f50640e;
    public long f50641f;
    public long h;
    public long f50642n;
    public long f50643r;
    public long f50644s;
    public long v;
    public long f50645w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50638b = j3;
        this.f50639c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50640e = 0;
        } else {
            this.f50641f = j12;
            this.f50640e = 4;
        }
        this.f50637a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f50641f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void h(long j3) {
        this.f50642n = d0.i(j3, 0L, this.f50641f - 1);
        this.f50640e = 2;
        this.f50643r = this.f50638b;
        this.f50644s = this.f50639c;
        this.v = 0L;
        this.f50645w = this.f50641f;
    }
}
