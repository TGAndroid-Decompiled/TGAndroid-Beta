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
    public final int f47331a;
    public final long f47332b;
    public final v f47333c;
    public final z d;
    public final w f47334e;
    public final m f47335f;
    public final n f47336g;
    public q h;
    public h0 f47337i;
    public h0 f47338j;
    public int f47339k;
    public p0 f47340l;
    public long f47341m;
    public long f47342n;
    public long f47343o;
    public long f47344p;
    public int f47345q;
    public f f47346r;
    public boolean f47347s;
    public boolean f47348t;
    public long f47349u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47346r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47344p;
            if (j3 != -1 && j3 != this.f47346r.d()) {
                a aVar = (a) this.f47346r;
                this.f47346r = new a(this.f47344p, aVar.f47324i, aVar.f47325j, aVar.f47326k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.P1(this.f47346r);
                this.f47337i.getClass();
                this.f47346r.l();
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
        this.f47337i = R1;
        this.f47338j = R1;
        this.h.Z0();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47339k = 0;
        this.f47341m = -9223372036854775807L;
        this.f47342n = 0L;
        this.f47345q = 0;
        this.f47349u = j10;
        if (!(this.f47346r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8957b;
        return a1.f8920e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f47331a = i10;
        this.f47332b = j3;
        this.f47333c = new v(10);
        this.d = new Object();
        this.f47334e = new w();
        this.f47341m = -9223372036854775807L;
        this.f47335f = new m(7);
        n nVar = new n();
        this.f47336g = nVar;
        this.f47338j = nVar;
        this.f47344p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
