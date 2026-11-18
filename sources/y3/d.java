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
    public final int f60716a;
    public final long f60717b;
    public final x f60718c;
    public final z d;
    public final w f60719e;
    public final ob.c f60720f;
    public final n f60721g;
    public q h;
    public i0 f60722i;
    public i0 f60723j;
    public int f60724k;
    public q0 f60725l;
    public q0 f60726m;
    public long f60727n;
    public long f60728o;
    public long f60729p;
    public long f60730q;
    public int f60731r;
    public h f60732s;
    public boolean f60733t;
    public boolean f60734u;
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
        this.f60722i = d2;
        this.f60723j = d2;
        this.h.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f60724k = 0;
        this.f60727n = -9223372036854775807L;
        this.f60728o = 0L;
        this.f60731r = 0;
        this.f60730q = -1L;
        this.v = j10;
        if (!(this.f60732s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14003b;
        return t1.f14071e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        x xVar = this.f60718c;
        pVar.b(0, 4, xVar.f13833a);
        xVar.N(0);
        int m10 = xVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.f11233e, zVar.f11231b, z10, true);
    }

    public final void h() {
        h hVar = this.f60732s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f60730q;
            if (j3 != -1 && j3 != this.f60732s.b()) {
                a aVar = (a) this.f60732s;
                this.f60732s = new a(this.f60730q, aVar.f60708i, aVar.f60709j, aVar.f60710k, aVar.f60711l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.j(this.f60732s);
                i0 i0Var = this.f60722i;
                i0Var.getClass();
                i0Var.d(this.f60732s.h());
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
            q0 M = this.f60720f.M(pVar, null, 131072);
            this.f60725l = M;
            if (M != null) {
                this.f60719e.b(M);
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
                x xVar = this.f60718c;
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
        this.f60724k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f60716a = i7;
        this.f60717b = j3;
        this.f60718c = new x(10);
        this.d = new Object();
        this.f60719e = new w();
        this.f60727n = -9223372036854775807L;
        this.f60720f = new ob.c(19);
        n nVar = new n();
        this.f60721g = nVar;
        this.f60723j = nVar;
        this.f60730q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
