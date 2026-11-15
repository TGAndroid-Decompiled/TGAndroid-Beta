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
import h9.s1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f60150a;
    public final long f60151b;
    public final x f60152c;
    public final z d;
    public final w f60153e;
    public final d6.i f60154f;
    public final n f60155g;
    public q h;
    public i0 f60156i;
    public i0 f60157j;
    public int f60158k;
    public q0 f60159l;
    public q0 f60160m;
    public long f60161n;
    public long f60162o;
    public long f60163p;
    public long f60164q;
    public int f60165r;
    public h f60166s;
    public boolean f60167t;
    public boolean f60168u;
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
        this.f60156i = d2;
        this.f60157j = d2;
        this.h.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f60158k = 0;
        this.f60161n = -9223372036854775807L;
        this.f60162o = 0L;
        this.f60165r = 0;
        this.f60164q = -1L;
        this.v = j10;
        if (!(this.f60166s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f60152c;
        pVar.c(0, 4, xVar.f13521a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.f10914e, zVar.f10912b, z10, true);
    }

    public final void h() {
        h hVar = this.f60166s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f60164q;
            if (j3 != -1 && j3 != this.f60166s.a()) {
                a aVar = (a) this.f60166s;
                this.f60166s = new a(this.f60164q, aVar.f60142i, aVar.f60143j, aVar.f60144k, aVar.f60145l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.f(this.f60166s);
                i0 i0Var = this.f60156i;
                i0Var.getClass();
                i0Var.d(this.f60166s.h());
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
        pVar.l();
        if (pVar.getPosition() == 0) {
            q0 U = this.f60154f.U(pVar, null, 131072);
            this.f60159l = U;
            if (U != null) {
                this.f60153e.b(U);
            }
            i7 = (int) pVar.j();
            if (!z10) {
                pVar.m(i7);
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
                x xVar = this.f60152c;
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
                        pVar.l();
                        pVar.k(i7 + i13);
                    } else {
                        pVar.m(1);
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
                    pVar.k(h - 4);
                }
            }
        }
        if (z10) {
            pVar.m(i7 + i12);
        } else {
            pVar.l();
        }
        this.f60158k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f60150a = i7;
        this.f60151b = j3;
        this.f60152c = new x(10);
        this.d = new Object();
        this.f60153e = new w();
        this.f60161n = -9223372036854775807L;
        this.f60154f = new d6.i();
        n nVar = new n();
        this.f60155g = nVar;
        this.f60157j = nVar;
        this.f60164q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
