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
    public final int f47826a;
    public final long f47827b;
    public final v f47828c;
    public final z d;
    public final w f47829e;
    public final i f47830f;
    public final n f47831g;
    public q h;
    public h0 f47832i;
    public h0 f47833j;
    public int f47834k;
    public p0 f47835l;
    public long f47836m;
    public long f47837n;
    public long f47838o;
    public long f47839p;
    public int f47840q;
    public f f47841r;
    public boolean f47842s;
    public boolean f47843t;
    public long f47844u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47841r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47839p;
            if (j3 != -1 && j3 != this.f47841r.d()) {
                a aVar = (a) this.f47841r;
                this.f47841r = new a(this.f47839p, aVar.f47819i, aVar.f47820j, aVar.f47821k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f47841r);
                this.f47832i.getClass();
                this.f47841r.l();
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
        h0 Z1 = qVar.Z1(0, 1);
        this.f47832i = Z1;
        this.f47833j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47834k = 0;
        this.f47836m = -9223372036854775807L;
        this.f47837n = 0L;
        this.f47840q = 0;
        this.f47844u = j10;
        if (!(this.f47841r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8758b;
        return a1.f8721e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f47826a = i10;
        this.f47827b = j3;
        this.f47828c = new v(10);
        this.d = new Object();
        this.f47829e = new w();
        this.f47836m = -9223372036854775807L;
        this.f47830f = new i(8);
        n nVar = new n();
        this.f47831g = nVar;
        this.f47833j = nVar;
        this.f47839p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
