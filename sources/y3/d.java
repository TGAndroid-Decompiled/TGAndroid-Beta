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
    public final int f60757a;
    public final long f60758b;
    public final x f60759c;
    public final z d;
    public final w f60760e;
    public final ob.c f60761f;
    public final n f60762g;
    public q h;
    public i0 f60763i;
    public i0 f60764j;
    public int f60765k;
    public q0 f60766l;
    public q0 f60767m;
    public long f60768n;
    public long f60769o;
    public long f60770p;
    public long f60771q;
    public int f60772r;
    public h f60773s;
    public boolean f60774t;
    public boolean f60775u;
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
        this.f60763i = d2;
        this.f60764j = d2;
        this.h.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f60765k = 0;
        this.f60768n = -9223372036854775807L;
        this.f60769o = 0L;
        this.f60772r = 0;
        this.f60771q = -1L;
        this.v = j10;
        if (!(this.f60773s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14032b;
        return t1.f14100e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f60759c;
        pVar.b(0, 4, xVar.f13862a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.f11262e, zVar.f11260b, z10, true);
    }

    public final void h() {
        h hVar = this.f60773s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f60771q;
            if (j3 != -1 && j3 != this.f60773s.b()) {
                a aVar = (a) this.f60773s;
                this.f60773s = new a(this.f60771q, aVar.f60749i, aVar.f60750j, aVar.f60751k, aVar.f60752l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.j(this.f60773s);
                i0 i0Var = this.f60763i;
                i0Var.getClass();
                i0Var.d(this.f60773s.h());
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
            q0 M = this.f60761f.M(pVar, null, 131072);
            this.f60766l = M;
            if (M != null) {
                this.f60760e.b(M);
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
                x xVar = this.f60759c;
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
        this.f60765k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f60757a = i7;
        this.f60758b = j3;
        this.f60759c = new x(10);
        this.d = new Object();
        this.f60760e = new w();
        this.f60768n = -9223372036854775807L;
        this.f60761f = new ob.c(19);
        n nVar = new n();
        this.f60762g = nVar;
        this.f60764j = nVar;
        this.f60771q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
