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
    public final int f47819a;
    public final long f47820b;
    public final v f47821c;
    public final z d;
    public final w f47822e;
    public final i f47823f;
    public final n f47824g;
    public q h;
    public h0 f47825i;
    public h0 f47826j;
    public int f47827k;
    public p0 f47828l;
    public long f47829m;
    public long f47830n;
    public long f47831o;
    public long f47832p;
    public int f47833q;
    public f f47834r;
    public boolean f47835s;
    public boolean f47836t;
    public long f47837u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public final void a() {
        f fVar = this.f47834r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f47832p;
            if (j3 != -1 && j3 != this.f47834r.d()) {
                a aVar = (a) this.f47834r;
                this.f47834r = new a(this.f47832p, aVar.f47812i, aVar.f47813j, aVar.f47814k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f47834r);
                this.f47825i.getClass();
                this.f47834r.l();
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
        this.f47825i = Z1;
        this.f47826j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f47827k = 0;
        this.f47829m = -9223372036854775807L;
        this.f47830n = 0L;
        this.f47833q = 0;
        this.f47837u = j10;
        if (!(this.f47834r instanceof b)) {
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
        this.f47819a = i10;
        this.f47820b = j3;
        this.f47821c = new v(10);
        this.d = new Object();
        this.f47822e = new w();
        this.f47829m = -9223372036854775807L;
        this.f47823f = new i(8);
        n nVar = new n();
        this.f47824g = nVar;
        this.f47826j = nVar;
        this.f47832p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
