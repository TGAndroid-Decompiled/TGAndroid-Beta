package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50549a;
    public final long f50550b;
    public final long f50551c;
    public final i d;
    public int f50552e;
    public long f50553f;
    public long h;
    public long f50554n;
    public long f50555r;
    public long f50556s;
    public long v;
    public long f50557w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50550b = j3;
        this.f50551c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50552e = 0;
        } else {
            this.f50553f = j12;
            this.f50552e = 4;
        }
        this.f50549a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f50553f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void l(long j3) {
        this.f50554n = d0.i(j3, 0L, this.f50553f - 1);
        this.f50552e = 2;
        this.f50555r = this.f50550b;
        this.f50556s = this.f50551c;
        this.v = 0L;
        this.f50557w = this.f50553f;
    }
}
