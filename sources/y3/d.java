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
    public final int f58840a;
    public final long f58841b;
    public final x f58842c;
    public final a0 d;
    public final w f58843e;
    public final y f58844f;
    public final n f58845g;
    public q h;
    public j0 f58846i;
    public j0 f58847j;
    public int f58848k;
    public q0 f58849l;
    public q0 f58850m;
    public long f58851n;
    public long f58852o;
    public long f58853p;
    public long f58854q;
    public int f58855r;
    public h f58856s;
    public boolean f58857t;
    public boolean f58858u;
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
        this.f58846i = O1;
        this.f58847j = O1;
        this.h.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        this.f58848k = 0;
        this.f58851n = -9223372036854775807L;
        this.f58852o = 0L;
        this.f58855r = 0;
        this.f58854q = -1L;
        this.v = j10;
        if (!(this.f58856s instanceof b)) {
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
        x xVar = this.f58842c;
        pVar.b(0, 4, xVar.f14162a);
        xVar.N(0);
        int m10 = xVar.m();
        a0 a0Var = this.d;
        a0Var.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), a0Var.f10967e, a0Var.f10965b, z9, true);
    }

    public final void h() {
        h hVar = this.f58856s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j3 = this.f58854q;
            if (j3 != -1 && j3 != this.f58856s.b()) {
                a aVar = (a) this.f58856s;
                this.f58856s = new a(this.f58854q, aVar.f58832i, aVar.f58833j, aVar.f58834k, aVar.f58835l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.f(this.f58856s);
                j0 j0Var = this.f58846i;
                j0Var.getClass();
                j0Var.d(this.f58856s.h());
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
            q0 a10 = this.f58844f.a(pVar, null, 131072);
            this.f58849l = a10;
            if (a10 != null) {
                this.f58843e.b(a10);
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
                x xVar = this.f58842c;
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
        this.f58848k = i10;
        return true;
    }

    public d(int i7, long j3) {
        this.f58840a = i7;
        this.f58841b = j3;
        this.f58842c = new x(10);
        this.d = new Object();
        this.f58843e = new w();
        this.f58851n = -9223372036854775807L;
        this.f58844f = new y(0);
        n nVar = new n();
        this.f58845g = nVar;
        this.f58847j = nVar;
        this.f58854q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
