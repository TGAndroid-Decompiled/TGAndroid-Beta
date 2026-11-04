package x3;

import d2.s0;
import e3.i0;
import e3.k;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.w;
import e3.z;
import g2.y;
import g9.g0;
import g9.s1;
import java.io.EOFException;
import java.util.List;
public final class d implements o {
    public final int f58183a;
    public final long f58184b;
    public final y f58185c;
    public final z d;
    public final w f58186e;
    public final bb.c f58187f;
    public final n f58188g;
    public q h;
    public i0 f58189i;
    public i0 f58190j;
    public int f58191k;
    public s0 f58192l;
    public s0 f58193m;
    public long f58194n;
    public long f58195o;
    public long f58196p;
    public long f58197q;
    public int f58198r;
    public h f58199s;
    public boolean f58200t;
    public boolean f58201u;
    public long v;

    public d(int i3) {
        this(i3, -9223372036854775807L);
    }

    @Override
    public final boolean b(p pVar) {
        return j(pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.h = qVar;
        i0 i02 = qVar.i0(0, 1);
        this.f58189i = i02;
        this.f58190j = i02;
        this.h.L();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f58191k = 0;
        this.f58194n = -9223372036854775807L;
        this.f58195o = 0L;
        this.f58198r = 0;
        this.f58197q = -1L;
        this.v = j11;
        if (!(this.f58199s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        g0 g0Var = g9.i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r52, e3.s r53) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.f(e3.p, e3.s):int");
    }

    public final a g(p pVar, boolean z10) {
        y yVar = this.f58185c;
        pVar.c(0, 4, yVar.f11923a);
        yVar.N(0);
        int m10 = yVar.m();
        z zVar = this.d;
        zVar.a(m10);
        return new a(pVar.getLength(), pVar.getPosition(), zVar.f9543e, zVar.f9541b, z10, true);
    }

    public final void h() {
        h hVar = this.f58199s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f58197q;
            if (j10 != -1 && j10 != this.f58199s.a()) {
                a aVar = (a) this.f58199s;
                this.f58199s = new a(this.f58197q, aVar.f58175i, aVar.f58176j, aVar.f58177k, aVar.f58178l, false);
                q qVar = this.h;
                qVar.getClass();
                qVar.f(this.f58199s);
                i0 i0Var = this.f58189i;
                i0Var.getClass();
                i0Var.b(this.f58199s.h());
            }
        }
    }

    public final boolean i(e3.p r9) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.i(e3.p):boolean");
    }

    public final boolean j(p pVar, boolean z10) {
        int i3;
        int i10;
        int h;
        pVar.o();
        if (pVar.getPosition() == 0) {
            s0 h7 = this.f58187f.h(pVar, null, 131072);
            this.f58192l = h7;
            if (h7 != null) {
                this.f58186e.b(h7);
            }
            i3 = (int) pVar.k();
            if (!z10) {
                pVar.u(i3);
            }
            i10 = 0;
        } else {
            i3 = 0;
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
                y yVar = this.f58185c;
                yVar.N(0);
                int m10 = yVar.m();
                if ((i10 != 0 && ((-128000) & m10) != (i10 & (-128000))) || (h = e3.b.h(m10)) == -1) {
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
                        pVar.n(i3 + i13);
                    } else {
                        pVar.u(1);
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
                    pVar.n(h - 4);
                }
            }
        }
        if (z10) {
            pVar.u(i3 + i12);
        } else {
            pVar.o();
        }
        this.f58191k = i10;
        return true;
    }

    public d(int i3, long j10) {
        this.f58183a = i3;
        this.f58184b = j10;
        this.f58185c = new y(10);
        this.d = new Object();
        this.f58186e = new w();
        this.f58194n = -9223372036854775807L;
        this.f58187f = new bb.c(19);
        n nVar = new n();
        this.f58188g = nVar;
        this.f58190j = nVar;
        this.f58197q = -1L;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
