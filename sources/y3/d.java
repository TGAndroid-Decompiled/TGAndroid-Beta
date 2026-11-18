package y3;

import e2.q0;
import f3.i0;
import f3.k;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.w;
import f3.z;
import h2.x;
import h9.g0;
import h9.t1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f60715a;
    public final long f60716b;
    public final x f60717c;
    public final z d;
    public final w f60718e;
    public final ob.c f60719f;
    public final n f60720g;
    public q h;
    public i0 f60721i;
    public i0 f60722j;
    public int f60723k;
    public q0 f60724l;
    public q0 f60725m;
    public long f60726n;
    public long f60727o;
    public long f60728p;
    public long f60729q;
    public int f60730r;
    public h f60731s;
    public boolean f60732t;
    public boolean f60733u;
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
        i0 d2 = qVar.d2(0, 1);
        this.f60721i = d2;
        this.f60722j = d2;
        this.h.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f60723k = 0;
        this.f60726n = -9223372036854775807L;
        this.f60727o = 0L;
        this.f60730r = 0;
        this.f60729q = -1L;
        this.v = j10;
        if (!(this.f60731s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14006b;
        return t1.f14074e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f60717c;
        pVar.b(0, 4, xVar.f13836a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.f11236e, zVar.f11234b, z10, true);
    }

    public final void h() {
        h hVar = this.f60731s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f60729q;
            if (j3 != -1 && j3 != this.f60731s.b()) {
                a aVar = (a) this.f60731s;
                this.f60731s = new a(this.f60729q, aVar.f60707i, aVar.f60708j, aVar.f60709k, aVar.f60710l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.j(this.f60731s);
                i0 i0Var = this.f60721i;
                i0Var.getClass();
                i0Var.d(this.f60731s.h());
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
        pVar.n();
        if (pVar.getPosition() == 0) {
            q0 M = this.f60719f.M(pVar, null, 131072);
            this.f60724l = M;
            if (M != null) {
                this.f60718e.b(M);
            }
            i7 = (int) pVar.l();
            if (!z10) {
                pVar.r(i7);
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
                x xVar = this.f60717c;
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
                        pVar.n();
                        pVar.m(i7 + i13);
                    } else {
                        pVar.r(1);
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
            pVar.r(i7 + i12);
        } else {
            pVar.n();
        }
        this.f60723k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f60715a = i7;
        this.f60716b = j3;
        this.f60717c = new x(10);
        this.d = new Object();
        this.f60718e = new w();
        this.f60726n = -9223372036854775807L;
        this.f60719f = new ob.c(19);
        n nVar = new n();
        this.f60720g = nVar;
        this.f60722j = nVar;
        this.f60729q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
