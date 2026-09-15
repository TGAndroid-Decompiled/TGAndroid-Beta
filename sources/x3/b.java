package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45222a;
    public final long f45223b;
    public final long f45224c;
    public final i d;
    public int e;
    public long f45225f;
    public long h;
    public long f45226n;
    public long f45227r;
    public long f45228s;
    public long v;
    public long f45229w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45223b = j3;
        this.f45224c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45225f = j12;
            this.e = 4;
        }
        this.f45222a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45226n = d0.i(j3, 0L, this.f45225f - 1);
        this.e = 2;
        this.f45227r = this.f45223b;
        this.f45228s = this.f45224c;
        this.v = 0L;
        this.f45229w = this.f45225f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45225f != 0) {
            return new a(this);
        }
        return null;
    }
}
