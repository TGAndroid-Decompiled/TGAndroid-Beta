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
    public final int f49081a;
    public final long f49082b;
    public final v f49083c;
    public final z d;
    public final w f49084e;
    public final i f49085f;
    public final n f49086g;
    public q h;
    public h0 f49087i;
    public h0 f49088j;
    public int f49089k;
    public p0 f49090l;
    public long f49091m;
    public long f49092n;
    public long f49093o;
    public long f49094p;
    public int f49095q;
    public f f49096r;
    public boolean f49097s;
    public boolean f49098t;
    public long f49099u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f49096r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f49094p;
            if (j3 != -1 && j3 != this.f49096r.d()) {
                a aVar = (a) this.f49096r;
                this.f49096r = new a(this.f49094p, aVar.f49074i, aVar.f49075j, aVar.f49076k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.d2(this.f49096r);
                this.f49087i.getClass();
                this.f49096r.l();
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
        h0 f22 = qVar.f2(0, 1);
        this.f49087i = f22;
        this.f49088j = f22;
        this.h.k1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f49089k = 0;
        this.f49091m = -9223372036854775807L;
        this.f49092n = 0L;
        this.f49095q = 0;
        this.f49099u = j10;
        if (!(this.f49096r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f49081a = i10;
        this.f49082b = j3;
        this.f49083c = new v(10);
        this.d = new Object();
        this.f49084e = new w();
        this.f49091m = -9223372036854775807L;
        this.f49085f = new i(8);
        n nVar = new n();
        this.f49086g = nVar;
        this.f49088j = nVar;
        this.f49094p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
