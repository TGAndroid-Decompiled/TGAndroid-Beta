package v3;

import b2.t0;
import c3.a0;
import c3.c0;
import c3.k;
import c3.l0;
import c3.p;
import c3.q;
import c3.r;
import c3.s;
import c3.y;
import e2.x;
import e9.n0;
import e9.x1;
import java.io.EOFException;
import java.util.List;
public final class d implements q {
    public final int f48364a;
    public final long f48365b;
    public final x f48366c;
    public final c0 d;
    public final y e;
    public final a0 f48367f;
    public final p f48368g;
    public s h;
    public l0 f48369i;
    public l0 f48370j;
    public int f48371k;
    public t0 f48372l;
    public t0 f48373m;
    public long f48374n;
    public long f48375o;
    public long f48376p;
    public long f48377q;
    public int f48378r;
    public h f48379s;
    public boolean f48380t;
    public boolean f48381u;
    public long v;

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    @Override
    public final boolean a(r rVar) {
        return j(rVar, true);
    }

    @Override
    public final void c(s sVar) {
        this.h = sVar;
        l0 j02 = sVar.j0(0, 1);
        this.f48369i = j02;
        this.f48370j = j02;
        this.h.C();
    }

    @Override
    public final void d(long j10, long j11) {
        this.f48371k = 0;
        this.f48374n = -9223372036854775807L;
        this.f48375o = 0L;
        this.f48378r = 0;
        this.f48377q = -1L;
        this.v = j11;
        if (!(this.f48379s instanceof b)) {
            return;
        }
        throw null;
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r52, c3.u r53) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.f(c3.r, c3.u):int");
    }

    public final a g(r rVar, boolean z10) {
        x xVar = this.f48366c;
        rVar.a(0, 4, xVar.f8298a);
        xVar.N(0);
        int m10 = xVar.m();
        c0 c0Var = this.d;
        c0Var.a(m10);
        return new a(rVar.getLength(), rVar.getPosition(), c0Var.e, c0Var.f4596b, z10, true);
    }

    public final void h() {
        h hVar = this.f48379s;
        if ((hVar instanceof a) && ((k) hVar).d()) {
            long j10 = this.f48377q;
            if (j10 != -1 && j10 != this.f48379s.a()) {
                a aVar = (a) this.f48379s;
                this.f48379s = new a(this.f48377q, aVar.f48356i, aVar.f48357j, aVar.f48358k, aVar.f48359l, false);
                s sVar = this.h;
                sVar.getClass();
                sVar.g0(this.f48379s);
                l0 l0Var = this.f48369i;
                l0Var.getClass();
                l0Var.e(this.f48379s.h());
            }
        }
    }

    public final boolean i(c3.r r9) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.i(c3.r):boolean");
    }

    public final boolean j(r rVar, boolean z10) {
        int i10;
        int i11;
        int h;
        rVar.q();
        if (rVar.getPosition() == 0) {
            t0 b10 = this.f48367f.b(rVar, null, 131072);
            this.f48372l = b10;
            if (b10 != null) {
                this.e.b(b10);
            }
            i10 = (int) rVar.k();
            if (!z10) {
                rVar.r(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (i(rVar)) {
                if (i12 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                x xVar = this.f48366c;
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
                        rVar.q();
                        rVar.l(i10 + i14);
                    } else {
                        rVar.r(1);
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
                    rVar.l(h - 4);
                }
            }
        }
        if (z10) {
            rVar.r(i10 + i13);
        } else {
            rVar.q();
        }
        this.f48371k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f48364a = i10;
        this.f48365b = j10;
        this.f48366c = new x(10);
        this.d = new Object();
        this.e = new y();
        this.f48374n = -9223372036854775807L;
        this.f48367f = new a0(0);
        p pVar = new p();
        this.f48368g = pVar;
        this.f48370j = pVar;
        this.f48377q = -1L;
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
