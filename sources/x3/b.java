package x3;

import c3.b0;
import e2.d0;
public final class b implements g {
    public final f f50547a;
    public final long f50548b;
    public final long f50549c;
    public final i d;
    public int f50550e;
    public long f50551f;
    public long h;
    public long f50552n;
    public long f50553r;
    public long f50554s;
    public long v;
    public long f50555w;

    public b(i iVar, long j3, long j10, long j11, long j12, boolean z10) {
        boolean z11;
        if (j3 >= 0 && j10 > j3) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.d = iVar;
        this.f50548b = j3;
        this.f50549c = j10;
        if (j11 != j10 - j3 && !z10) {
            this.f50550e = 0;
        } else {
            this.f50551f = j12;
            this.f50550e = 4;
        }
        this.f50547a = new f();
    }

    @Override
    public final long c(c3.p r28) {
        throw new UnsupportedOperationException("Method not decompiled: x3.b.c(c3.p):long");
    }

    @Override
    public final b0 d() {
        if (this.f50551f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void l(long j3) {
        this.f50552n = d0.i(j3, 0L, this.f50551f - 1);
        this.f50550e = 2;
        this.f50553r = this.f50548b;
        this.f50554s = this.f50549c;
        this.v = 0L;
        this.f50555w = this.f50551f;
    }
}
