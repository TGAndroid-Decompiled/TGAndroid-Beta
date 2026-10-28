package v3;

import b2.u0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.w;
import c3.z;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f50072a;
    public final long f50073b;
    public final x f50074c;
    public final z d;
    public final w e;
    public final b6.i f50075f;
    public final n f50076g;
    public q h;
    public j0 f50077i;
    public j0 f50078j;
    public int f50079k;
    public u0 f50080l;
    public u0 f50081m;
    public long f50082n;
    public long f50083o;
    public long f50084p;
    public long f50085q;
    public int f50086r;
    public h f50087s;
    public boolean f50088t;
    public boolean f50089u;
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
        j0 F1 = qVar.F1(0, 1);
        this.f50077i = F1;
        this.f50078j = F1;
        this.h.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f50079k = 0;
        this.f50082n = -9223372036854775807L;
        this.f50083o = 0L;
        this.f50086r = 0;
        this.f50085q = -1L;
        this.v = j11;
        if (!(this.f50087s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10286b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r52, c3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.f(c3.p, c3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f50074c;
        pVar.b(0, 4, xVar.f9731a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.e, zVar.f6125b, z10, true);
    }

    public final void h() {
        h hVar = this.f50087s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f50085q;
            if (j10 != -1 && j10 != this.f50087s.b()) {
                a aVar = (a) this.f50087s;
                this.f50087s = new a(this.f50085q, aVar.f50064i, aVar.f50065j, aVar.f50066k, aVar.f50067l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.D1(this.f50087s);
                j0 j0Var = this.f50077i;
                j0Var.getClass();
                j0Var.e(this.f50087s.h());
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
        pVar.p();
        if (pVar.getPosition() == 0) {
            u0 c02 = this.f50075f.c0(pVar, null, 131072);
            this.f50080l = c02;
            if (c02 != null) {
                this.e.b(c02);
            }
            i10 = (int) pVar.i();
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
                x xVar = this.f50074c;
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
                        pVar.p();
                        pVar.j(i10 + i14);
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
                    pVar.j(h - 4);
                }
            }
        }
        if (z10) {
            pVar.r(i10 + i13);
        } else {
            pVar.p();
        }
        this.f50079k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f50072a = i10;
        this.f50073b = j10;
        this.f50074c = new x(10);
        this.d = new Object();
        this.e = new w();
        this.f50082n = -9223372036854775807L;
        this.f50075f = new b6.i(8);
        n nVar = new n();
        this.f50076g = nVar;
        this.f50078j = nVar;
        this.f50085q = -1L;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
