package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45172a;
    public final long f45173b;
    public final long f45174c;
    public final i d;
    public int e;
    public long f45175f;
    public long h;
    public long f45176n;
    public long f45177r;
    public long f45178s;
    public long v;
    public long f45179w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45173b = j3;
        this.f45174c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45175f = j12;
            this.e = 4;
        }
        this.f45172a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45176n = d0.i(j3, 0L, this.f45175f - 1);
        this.e = 2;
        this.f45177r = this.f45173b;
        this.f45178s = this.f45174c;
        this.v = 0L;
        this.f45179w = this.f45175f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45175f != 0) {
            return new a(this);
        }
        return null;
    }
}
