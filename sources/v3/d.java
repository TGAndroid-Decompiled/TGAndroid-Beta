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
    public final int f47360a;
    public final long f47361b;
    public final v f47362c;
    public final z d;
    public final w f47363e;
    public final m f47364f;
    public final n f47365g;
    public q h;
    public h0 f47366i;
    public h0 f47367j;
    public int f47368k;
    public p0 f47369l;
    public long f47370m;
    public long f47371n;
    public long f47372o;
    public long f47373p;
    public int f47374q;
    public f f47375r;
    public boolean f47376s;
    public boolean f47377t;
    public long f47378u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47375r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47373p;
            if (j3 != -1 && j3 != this.f47375r.d()) {
                a aVar = (a) this.f47375r;
                this.f47375r = new a(this.f47373p, aVar.f47353i, aVar.f47354j, aVar.f47355k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.P1(this.f47375r);
                this.f47366i.getClass();
                this.f47375r.l();
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
        this.f47366i = R1;
        this.f47367j = R1;
        this.h.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47368k = 0;
        this.f47370m = -9223372036854775807L;
        this.f47371n = 0L;
        this.f47374q = 0;
        this.f47378u = j10;
        if (!(this.f47375r instanceof b)) {
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
        this.f47360a = i10;
        this.f47361b = j3;
        this.f47362c = new v(10);
        this.d = new Object();
        this.f47363e = new w();
        this.f47370m = -9223372036854775807L;
        this.f47364f = new m(7);
        n nVar = new n();
        this.f47365g = nVar;
        this.f47367j = nVar;
        this.f47373p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
