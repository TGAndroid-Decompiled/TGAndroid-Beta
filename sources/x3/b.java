package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f45250a;
    public final long f45251b;
    public final long f45252c;
    public final i d;
    public int e;
    public long f45253f;
    public long h;
    public long f45254n;
    public long f45255r;
    public long f45256s;
    public long v;
    public long f45257w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f45251b = j3;
        this.f45252c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.e = 0;
        } else {
            this.f45253f = j12;
            this.e = 4;
        }
        this.f45250a = new f();
    }

    @Override
    public final void B(long j3) {
        this.f45254n = d0.i(j3, 0L, this.f45253f - 1);
        this.e = 2;
        this.f45255r = this.f45251b;
        this.f45256s = this.f45252c;
        this.v = 0L;
        this.f45257w = this.f45253f;
    }

    @Override
    public final long b(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.b(c3.p):long");
    }

    @Override
    public final b0 g() {
        if (this.f45253f != 0) {
            return new a(this);
        }
        return null;
    }
}
