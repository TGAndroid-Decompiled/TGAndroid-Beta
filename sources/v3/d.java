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
    public final int f47926a;
    public final long f47927b;
    public final x f47928c;
    public final a0 d;
    public final w e;
    public final y f47929f;
    public final n f47930g;
    public q h;
    public j0 f47931i;
    public j0 f47932j;
    public int f47933k;
    public t0 f47934l;
    public t0 f47935m;
    public long f47936n;
    public long f47937o;
    public long f47938p;
    public long f47939q;
    public int f47940r;
    public h f47941s;
    public boolean f47942t;
    public boolean f47943u;
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
        this.f47931i = j02;
        this.f47932j = j02;
        this.h.H();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f47933k = 0;
        this.f47936n = -9223372036854775807L;
        this.f47937o = 0L;
        this.f47940r = 0;
        this.f47939q = -1L;
        this.v = j11;
        if (!(this.f47941s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r52, c3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.f(c3.p, c3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f47928c;
        pVar.b(0, 4, xVar.f8291a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.e, a0Var.f4562b, z10, true);
    }

    public final void h() {
        h hVar = this.f47941s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f47939q;
            if (j10 != -1 && j10 != this.f47941s.b()) {
                a aVar = (a) this.f47941s;
                this.f47941s = new a(this.f47939q, aVar.f47918i, aVar.f47919j, aVar.f47920k, aVar.f47921l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.g0(this.f47941s);
                j0 j0Var = this.f47931i;
                j0Var.getClass();
                j0Var.e(this.f47941s.h());
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
            t0 b10 = this.f47929f.b(pVar, null, 131072);
            this.f47934l = b10;
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
                x xVar = this.f47928c;
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
        this.f47933k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f47926a = i10;
        this.f47927b = j10;
        this.f47928c = new x(10);
        this.d = new Object();
        this.e = new w();
        this.f47936n = -9223372036854775807L;
        this.f47929f = new y(0);
        n nVar = new n();
        this.f47930g = nVar;
        this.f47932j = nVar;
        this.f47939q = -1L;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
