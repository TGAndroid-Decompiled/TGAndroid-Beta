package v3;

import d5.f0;
import m3.t;
public final class b implements g {
    public final f f48313a;
    public final long f48314b;
    public final long f48315c;
    public final i d;
    public int f48316e;
    public long f48317f;
    public long h;
    public long f48318n;
    public long f48319r;
    public long f48320s;
    public long v;
    public long f48321w;

    public b(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.f(z11);
        this.d = iVar;
        this.f48314b = j10;
        this.f48315c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f48316e = 0;
        } else {
            this.f48317f = j13;
            this.f48316e = 4;
        }
        this.f48313a = new f();
    }

    @Override
    public final t D() {
        if (this.f48317f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void O(long j10) {
        this.f48318n = f0.i(j10, 0L, this.f48317f - 1);
        this.f48316e = 2;
        this.f48319r = this.f48314b;
        this.f48320s = this.f48315c;
        this.v = 0L;
        this.f48321w = this.f48317f;
    }

    @Override
    public final long b(m3.l r28) {
        throw new UnsupportedOperationException("Method not decompiled: v3.b.b(m3.l):long");
    }
}
