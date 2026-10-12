package v3;

import b2.u0;
import c3.i0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.w;
import c3.z;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f46529a;
    public final long f46530b;
    public final x f46531c;
    public final z d;
    public final w e;
    public final k6.h f46532f;
    public final n f46533g;
    public q h;
    public i0 f46534i;
    public i0 f46535j;
    public int f46536k;
    public u0 f46537l;
    public u0 f46538m;
    public long f46539n;
    public long f46540o;
    public long f46541p;
    public long f46542q;
    public int f46543r;
    public h f46544s;
    public boolean f46545t;
    public boolean f46546u;
    public long v;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(p pVar) {
        return j(pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.h = qVar;
        i0 a02 = qVar.a0(0, 1);
        this.f46534i = a02;
        this.f46535j = a02;
        this.h.D();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f46536k = 0;
        this.f46539n = -9223372036854775807L;
        this.f46540o = 0L;
        this.f46543r = 0;
        this.f46542q = -1L;
        this.v = j11;
        if (!(this.f46544s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r52, c3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.f(c3.p, c3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f46531c;
        pVar.a(0, 4, xVar.f8411a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.e, zVar.f4312b, z10, true);
    }

    public final void h() {
        h hVar = this.f46544s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f46542q;
            if (j10 != -1 && j10 != this.f46544s.a()) {
                a aVar = (a) this.f46544s;
                this.f46544s = new a(this.f46542q, aVar.f46521i, aVar.f46522j, aVar.f46523k, aVar.f46524l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.K(this.f46544s);
                i0 i0Var = this.f46534i;
                i0Var.getClass();
                i0Var.e(this.f46544s.h());
            }
        }
    }

    public final boolean i(c3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.i(c3.p):boolean");
    }

    public final boolean j(p pVar, boolean z10) {
        int i10;
        int i11;
        int h;
        pVar.q();
        if (pVar.getPosition() == 0) {
            u0 r10 = this.f46532f.r(pVar, null, 131072);
            this.f46537l = r10;
            if (r10 != null) {
                this.e.b(r10);
            }
            i10 = (int) pVar.k();
            if (!z10) {
                pVar.r(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (i(pVar)) {
                if (i12 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                x xVar = this.f46531c;
                xVar.N(0);
                int m10 = xVar.m();
                if ((i11 != 0 && ((-128000) & m10) != (i11 & (-128000))) || (h = c3.b.h(m10)) == -1) {
                    int i14 = i13 + 1;
                    if (i13 == 131072) {
                        if (z10) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.q();
                        pVar.l(i10 + i14);
                    } else {
                        pVar.r(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i11 = 0;
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.d.a(m10);
                        i11 = m10;
                    } else if (i12 == 4) {
                        break;
                    }
                    pVar.l(h - 4);
                }
            }
        }
        if (z10) {
            pVar.r(i10 + i13);
        } else {
            pVar.q();
        }
        this.f46536k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f46529a = i10;
        this.f46530b = j10;
        this.f46531c = new x(10);
        this.d = new Object();
        this.e = new w();
        this.f46539n = -9223372036854775807L;
        this.f46532f = new k6.h(10);
        n nVar = new n();
        this.f46533g = nVar;
        this.f46535j = nVar;
        this.f46542q = -1L;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
