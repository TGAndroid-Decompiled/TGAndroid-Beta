package v3;

import b2.t0;
import c3.a0;
import c3.j0;
import c3.k;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.w;
import c3.y;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f47962a;
    public final long f47963b;
    public final x f47964c;
    public final a0 d;
    public final w e;
    public final y f47965f;
    public final n f47966g;
    public q h;
    public j0 f47967i;
    public j0 f47968j;
    public int f47969k;
    public t0 f47970l;
    public t0 f47971m;
    public long f47972n;
    public long f47973o;
    public long f47974p;
    public long f47975q;
    public int f47976r;
    public h f47977s;
    public boolean f47978t;
    public boolean f47979u;
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
        j0 j02 = qVar.j0(0, 1);
        this.f47967i = j02;
        this.f47968j = j02;
        this.h.H();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f47969k = 0;
        this.f47972n = -9223372036854775807L;
        this.f47973o = 0L;
        this.f47976r = 0;
        this.f47975q = -1L;
        this.v = j11;
        if (!(this.f47977s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8477b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r52, c3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.f(c3.p, c3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f47964c;
        pVar.b(0, 4, xVar.f8294a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.e, a0Var.f4566b, z10, true);
    }

    public final void h() {
        h hVar = this.f47977s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f47975q;
            if (j10 != -1 && j10 != this.f47977s.b()) {
                a aVar = (a) this.f47977s;
                this.f47977s = new a(this.f47975q, aVar.f47954i, aVar.f47955j, aVar.f47956k, aVar.f47957l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.g0(this.f47977s);
                j0 j0Var = this.f47967i;
                j0Var.getClass();
                j0Var.e(this.f47977s.h());
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
            t0 b10 = this.f47965f.b(pVar, null, 131072);
            this.f47970l = b10;
            if (b10 != null) {
                this.e.b(b10);
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
                x xVar = this.f47964c;
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
        this.f47969k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f47962a = i10;
        this.f47963b = j10;
        this.f47964c = new x(10);
        this.d = new Object();
        this.e = new w();
        this.f47972n = -9223372036854775807L;
        this.f47965f = new y(0);
        n nVar = new n();
        this.f47966g = nVar;
        this.f47968j = nVar;
        this.f47975q = -1L;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
