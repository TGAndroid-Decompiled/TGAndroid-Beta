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
import h9.t1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f58834a;
    public final long f58835b;
    public final x f58836c;
    public final a0 d;
    public final w f58837e;
    public final y f58838f;
    public final n f58839g;
    public q h;
    public j0 f58840i;
    public j0 f58841j;
    public int f58842k;
    public q0 f58843l;
    public q0 f58844m;
    public long f58845n;
    public long f58846o;
    public long f58847p;
    public long f58848q;
    public int f58849r;
    public h f58850s;
    public boolean f58851t;
    public boolean f58852u;
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
        j0 O1 = qVar.O1(0, 1);
        this.f58840i = O1;
        this.f58841j = O1;
        this.h.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f58842k = 0;
        this.f58845n = -9223372036854775807L;
        this.f58846o = 0L;
        this.f58849r = 0;
        this.f58848q = -1L;
        this.v = j10;
        if (!(this.f58850s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final int f(f3.p r52, f3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.f(f3.p, f3.s):int");
    }

    public final a g(p pVar, boolean z9) {
        x xVar = this.f58836c;
        pVar.b(0, 4, xVar.f14162a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.f10967e, a0Var.f10965b, z9, true);
    }

    public final void h() {
        h hVar = this.f58850s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f58848q;
            if (j3 != -1 && j3 != this.f58850s.b()) {
                a aVar = (a) this.f58850s;
                this.f58850s = new a(this.f58848q, aVar.f58826i, aVar.f58827j, aVar.f58828k, aVar.f58829l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.f(this.f58850s);
                j0 j0Var = this.f58840i;
                j0Var.getClass();
                j0Var.d(this.f58850s.h());
            }
        }
    }

    public final boolean i(f3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: y3.d.i(f3.p):boolean");
    }

    public final boolean j(p pVar, boolean z9) {
        int i7;
        int i10;
        int h;
        pVar.q();
        if (pVar.getPosition() == 0) {
            q0 a10 = this.f58838f.a(pVar, null, 131072);
            this.f58843l = a10;
            if (a10 != null) {
                this.f58837e.b(a10);
            }
            i7 = (int) pVar.l();
            if (!z9) {
                pVar.s(i7);
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
                x xVar = this.f58836c;
                xVar.N(0);
                int m10 = xVar.m();
                if ((i10 != 0 && ((-128000) & m10) != (i10 & (-128000))) || (h = f3.b.h(m10)) == -1) {
                    int i13 = i12 + 1;
                    if (i12 == 131072) {
                        if (z9) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z9) {
                        pVar.q();
                        pVar.m(i7 + i13);
                    } else {
                        pVar.s(1);
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
        if (z9) {
            pVar.s(i7 + i12);
        } else {
            pVar.q();
        }
        this.f58842k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f58834a = i7;
        this.f58835b = j3;
        this.f58836c = new x(10);
        this.d = new Object();
        this.f58837e = new w();
        this.f58845n = -9223372036854775807L;
        this.f58838f = new y(0);
        n nVar = new n();
        this.f58839g = nVar;
        this.f58841j = nVar;
        this.f58848q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
