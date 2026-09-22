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
    public final int f44192a;
    public final long f44193b;
    public final v f44194c;
    public final z d;
    public final w e;
    public final i f44195f;
    public final n f44196g;
    public q h;
    public h0 f44197i;
    public h0 f44198j;
    public int f44199k;
    public p0 f44200l;
    public long f44201m;
    public long f44202n;
    public long f44203o;
    public long f44204p;
    public int f44205q;
    public f f44206r;
    public boolean f44207s;
    public boolean f44208t;
    public long f44209u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f44206r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f44204p;
            if (j3 != -1 && j3 != this.f44206r.d()) {
                a aVar = (a) this.f44206r;
                this.f44206r = new a(this.f44204p, aVar.f44185i, aVar.f44186j, aVar.f44187k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f44206r);
                this.f44197i.getClass();
                this.f44206r.l();
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
        this.f44197i = Z1;
        this.f44198j = Z1;
        this.h.f1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f44199k = 0;
        this.f44201m = -9223372036854775807L;
        this.f44202n = 0L;
        this.f44205q = 0;
        this.f44209u = j10;
        if (!(this.f44206r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8083b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f44192a = i10;
        this.f44193b = j3;
        this.f44194c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f44201m = -9223372036854775807L;
        this.f44195f = new i(8);
        n nVar = new n();
        this.f44196g = nVar;
        this.f44198j = nVar;
        this.f44204p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
