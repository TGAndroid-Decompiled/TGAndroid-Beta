package v3;

import a6.i;
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
    public final int f44200a;
    public final long f44201b;
    public final v f44202c;
    public final z d;
    public final w e;
    public final i f44203f;
    public final n f44204g;
    public q h;
    public h0 f44205i;
    public h0 f44206j;
    public int f44207k;
    public p0 f44208l;
    public long f44209m;
    public long f44210n;
    public long f44211o;
    public long f44212p;
    public int f44213q;
    public f f44214r;
    public boolean f44215s;
    public boolean f44216t;
    public long f44217u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44214r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44212p;
            if (j3 != -1 && j3 != this.f44214r.d()) {
                a aVar = (a) this.f44214r;
                this.f44214r = new a(this.f44212p, aVar.f44193i, aVar.f44194j, aVar.f44195k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44214r);
                this.f44205i.getClass();
                this.f44214r.l();
            }
        }
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
        h0 Z1 = qVar.Z1(0, 1);
        this.f44205i = Z1;
        this.f44206j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44207k = 0;
        this.f44209m = -9223372036854775807L;
        this.f44210n = 0L;
        this.f44213q = 0;
        this.f44217u = j10;
        if (!(this.f44214r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8068b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f44200a = i10;
        this.f44201b = j3;
        this.f44202c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44209m = -9223372036854775807L;
        this.f44203f = new i(8);
        n nVar = new n();
        this.f44204g = nVar;
        this.f44206j = nVar;
        this.f44212p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
