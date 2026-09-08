package v3;

import a6.m;
import b2.p0;
import c3.h0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.w;
import c3.z;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class d implements o {
    public final int f47359a;
    public final long f47360b;
    public final v f47361c;
    public final z d;
    public final w f47362e;
    public final m f47363f;
    public final n f47364g;
    public q h;
    public h0 f47365i;
    public h0 f47366j;
    public int f47367k;
    public p0 f47368l;
    public long f47369m;
    public long f47370n;
    public long f47371o;
    public long f47372p;
    public int f47373q;
    public f f47374r;
    public boolean f47375s;
    public boolean f47376t;
    public long f47377u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47374r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47372p;
            if (j3 != -1 && j3 != this.f47374r.d()) {
                a aVar = (a) this.f47374r;
                this.f47374r = new a(this.f47372p, aVar.f47352i, aVar.f47353j, aVar.f47354k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.P1(this.f47374r);
                this.f47365i.getClass();
                this.f47374r.l();
            }
        }
    }

    @Override
    public final boolean b(p pVar) {
        return e(pVar, true);
    }

    public final boolean d(c3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.d(c3.p):boolean");
    }

    public final boolean e(c3.p r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.e(c3.p, boolean):boolean");
    }

    @Override
    public final void g(q qVar) {
        this.h = qVar;
        h0 R1 = qVar.R1(0, 1);
        this.f47365i = R1;
        this.f47366j = R1;
        this.h.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47367k = 0;
        this.f47369m = -9223372036854775807L;
        this.f47370n = 0L;
        this.f47373q = 0;
        this.f47377u = j10;
        if (!(this.f47374r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f47359a = i10;
        this.f47360b = j3;
        this.f47361c = new v(10);
        this.d = new Object();
        this.f47362e = new w();
        this.f47369m = -9223372036854775807L;
        this.f47363f = new m(7);
        n nVar = new n();
        this.f47364g = nVar;
        this.f47366j = nVar;
        this.f47372p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
