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
    public final int f43868a;
    public final long f43869b;
    public final v f43870c;
    public final z d;
    public final w e;
    public final i f43871f;
    public final n f43872g;
    public q h;
    public h0 f43873i;
    public h0 f43874j;
    public int f43875k;
    public p0 f43876l;
    public long f43877m;
    public long f43878n;
    public long f43879o;
    public long f43880p;
    public int f43881q;
    public f f43882r;
    public boolean f43883s;
    public boolean f43884t;
    public long f43885u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f43882r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f43880p;
            if (j3 != -1 && j3 != this.f43882r.d()) {
                a aVar = (a) this.f43882r;
                this.f43882r = new a(this.f43880p, aVar.f43861i, aVar.f43862j, aVar.f43863k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f43882r);
                this.f43873i.getClass();
                this.f43882r.l();
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
        this.f43873i = Z1;
        this.f43874j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f43875k = 0;
        this.f43877m = -9223372036854775807L;
        this.f43878n = 0L;
        this.f43881q = 0;
        this.f43885u = j10;
        if (!(this.f43882r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8081b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f43868a = i10;
        this.f43869b = j3;
        this.f43870c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f43877m = -9223372036854775807L;
        this.f43871f = new i(8);
        n nVar = new n();
        this.f43872g = nVar;
        this.f43874j = nVar;
        this.f43880p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
