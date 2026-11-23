package y3;

import e2.q0;
import f3.a0;
import f3.j0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.w;
import f3.y;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f60844a;
    public final long f60845b;
    public final x f60846c;
    public final a0 d;
    public final w f60847e;
    public final y f60848f;
    public final n f60849g;
    public q h;
    public j0 f60850i;
    public j0 f60851j;
    public int f60852k;
    public q0 f60853l;
    public q0 f60854m;
    public long f60855n;
    public long f60856o;
    public long f60857p;
    public long f60858q;
    public int f60859r;
    public h f60860s;
    public boolean f60861t;
    public boolean f60862u;
    public long v;

    public d(int i7) {
        this(i7, -9223372036854775807L);
    }

    @Override
    public final boolean b(p pVar) {
        return j(pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.h = qVar;
        j0 d2 = qVar.d2(0, 1);
        this.f60850i = d2;
        this.f60851j = d2;
        this.h.Z0();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f60852k = 0;
        this.f60855n = -9223372036854775807L;
        this.f60856o = 0L;
        this.f60859r = 0;
        this.f60858q = -1L;
        this.v = j10;
        if (!(this.f60860s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f60846c;
        pVar.b(0, 4, xVar.f13828a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.f11092e, a0Var.f11090b, z10, true);
    }

    public final void h() {
        h hVar = this.f60860s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f60858q;
            if (j3 != -1 && j3 != this.f60860s.b()) {
                a aVar = (a) this.f60860s;
                this.f60860s = new a(this.f60858q, aVar.f60836i, aVar.f60837j, aVar.f60838k, aVar.f60839l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.h(this.f60860s);
                j0 j0Var = this.f60850i;
                j0Var.getClass();
                j0Var.d(this.f60860s.h());
            }
        }
    }

    public final boolean i(f3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.i(f3.p):boolean");
    }

    public final boolean j(p pVar, boolean z10) {
        int i7;
        int i10;
        int h;
        pVar.o();
        if (pVar.getPosition() == 0) {
            q0 a10 = this.f60848f.a(pVar, null, 131072);
            this.f60853l = a10;
            if (a10 != null) {
                this.f60847e.b(a10);
            }
            i7 = (int) pVar.l();
            if (!z10) {
                pVar.q(i7);
            }
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (i(pVar)) {
                if (i11 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                x xVar = this.f60846c;
                xVar.N(0);
                int m10 = xVar.m();
                if ((i10 != 0 && ((-128000) & m10) != (i10 & (-128000))) || (h = f3.b.h(m10)) == -1) {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z10) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z10) {
                        pVar.o();
                        pVar.m(i7 + i13);
                    } else {
                        pVar.q(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                } else {
                    i11++;
                    if (i11 == 1) {
                        this.d.a(m10);
                        i10 = m10;
                    } else if (i11 == 4) {
                        break;
                    }
                    pVar.m(h - 4);
                }
            }
        }
        if (z10) {
            pVar.q(i7 + i12);
        } else {
            pVar.o();
        }
        this.f60852k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f60844a = i7;
        this.f60845b = j3;
        this.f60846c = new x(10);
        this.d = new Object();
        this.f60847e = new w();
        this.f60855n = -9223372036854775807L;
        this.f60848f = new y(0);
        n nVar = new n();
        this.f60849g = nVar;
        this.f60851j = nVar;
        this.f60858q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
