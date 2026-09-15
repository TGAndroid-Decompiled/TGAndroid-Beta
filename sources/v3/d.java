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
    public final int f43872a;
    public final long f43873b;
    public final v f43874c;
    public final z d;
    public final w e;
    public final i f43875f;
    public final n f43876g;
    public q h;
    public h0 f43877i;
    public h0 f43878j;
    public int f43879k;
    public p0 f43880l;
    public long f43881m;
    public long f43882n;
    public long f43883o;
    public long f43884p;
    public int f43885q;
    public f f43886r;
    public boolean f43887s;
    public boolean f43888t;
    public long f43889u;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return e(pVar, true);
    }

    public final void b() {
        f fVar = this.f43886r;
        if ((fVar instanceof a) && ((k) fVar).f()) {
            long j3 = this.f43884p;
            if (j3 != -1 && j3 != this.f43886r.d()) {
                a aVar = (a) this.f43886r;
                this.f43886r = new a(this.f43884p, aVar.f43865i, aVar.f43866j, aVar.f43867k, aVar.h);
                q qVar = this.h;
                qVar.getClass();
                qVar.X1(this.f43886r);
                this.f43877i.getClass();
                this.f43886r.l();
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
        this.f43877i = Z1;
        this.f43878j = Z1;
        this.h.e1();
    }

    @Override
    public final void h(long j3, long j10) {
        this.f43879k = 0;
        this.f43881m = -9223372036854775807L;
        this.f43882n = 0L;
        this.f43885q = 0;
        this.f43889u = j10;
        if (!(this.f43886r instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8079b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r54, c3.s r55) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.m(c3.p, c3.s):int");
    }

    public d(int i10, long j3) {
        this.f43872a = i10;
        this.f43873b = j3;
        this.f43874c = new v(10);
        this.d = new Object();
        this.e = new w();
        this.f43881m = -9223372036854775807L;
        this.f43875f = new i(8);
        n nVar = new n();
        this.f43876g = nVar;
        this.f43878j = nVar;
        this.f43884p = -1L;
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
