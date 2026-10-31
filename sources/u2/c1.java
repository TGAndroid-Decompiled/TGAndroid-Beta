package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.pn0;
import v7.t6;
public class c1 implements c3.k0 {
    public boolean B;
    public b2.x C;
    public b2.x D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final pn0 f49840a;
    public final n2.m d;
    public final n2.j e;
    public Object f49843f;
    public b2.x f49844g;
    public n2.g h;
    public int f49852p;
    public int f49853q;
    public int f49854r;
    public int f49855s;
    public boolean f49860y;
    public final bi.d0 f49841b = new Object();
    public int f49845i = 1000;
    public long[] f49846j = new long[1000];
    public long[] f49847k = new long[1000];
    public long[] f49850n = new long[1000];
    public int[] f49849m = new int[1000];
    public int[] f49848l = new int[1000];
    public c3.j0[] f49851o = new c3.j0[1000];
    public final a5.a f49842c = new a5.a(new th.m1(3));
    public long f49856t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f49858w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f49861z = true;
    public boolean F = true;
    public long f49857u = Long.MIN_VALUE;
    public int f49859x = -1;

    public c1(android.support.v4.media.session.a0 a0Var, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.e = jVar;
        this.f49840a = new pn0(a0Var);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        b2.x xVar;
        int v = v();
        int i10 = this.f49859x;
        boolean z12 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.f49855s != this.f49852p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f49860y && ((xVar = this.D) == null || xVar == this.f49844g)) {
                z12 = false;
            }
            return z12;
        } else if (((a1) this.f49842c.n(v)).f49822a != this.f49844g) {
            return true;
        } else {
            return B(w(this.f49855s));
        }
    }

    public final boolean B(int i10) {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f49849m[i10] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() == 1) {
            n2.f g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void D(b2.x xVar, hf.b bVar) {
        boolean z10;
        b2.t tVar;
        b2.x xVar2;
        b2.x xVar3 = this.f49844g;
        if (xVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (xVar3 == null) {
            tVar = null;
        } else {
            tVar = xVar3.f2426w;
        }
        this.f49844g = xVar;
        b2.t tVar2 = xVar.f2426w;
        n2.m mVar = this.d;
        if (mVar != null) {
            int t02 = mVar.t0(xVar);
            b2.w a2 = xVar.a();
            a2.S = t02;
            xVar2 = new b2.x(a2);
        } else {
            xVar2 = xVar;
        }
        bVar.f7658c = xVar2;
        bVar.f7657b = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(tVar, tVar2)) {
                n2.g gVar = this.h;
                n2.j jVar = this.e;
                n2.g B0 = mVar.B0(jVar, xVar);
                this.h = B0;
                bVar.f7657b = B0;
                if (gVar != null) {
                    gVar.a(jVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z10;
        long j10;
        try {
            int w9 = w(this.f49855s);
            if (this.f49855s != this.f49852p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f49846j[w9];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(hf.b r12, h2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.F(hf.b, h2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        pn0 pn0Var = this.f49840a;
        z0 z0Var = (z0) pn0Var.e;
        if (((y2.a) z0Var.f50073c) != null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) pn0Var.f29389c;
            synchronized (a0Var) {
                ((i2.h) a0Var.d).f7873c.b(z0Var);
                z0 z0Var2 = z0Var;
                while (z0Var2 != null) {
                    y2.a aVar = (y2.a) z0Var2.f50073c;
                    aVar.getClass();
                    a0Var.v(aVar);
                    z0Var2 = (z0) z0Var2.d;
                    if (z0Var2 == null || ((y2.a) z0Var2.f50073c) == null) {
                        z0Var2 = null;
                    }
                }
            }
            z0Var.f50073c = null;
            z0Var.d = null;
        }
        z0 z0Var3 = (z0) pn0Var.e;
        int i10 = pn0Var.f29387a;
        if (((y2.a) z0Var3.f50073c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.p(z11);
        z0Var3.f50071a = 0L;
        z0Var3.f50072b = i10;
        z0 z0Var4 = (z0) pn0Var.e;
        pn0Var.f29390f = z0Var4;
        pn0Var.f29391g = z0Var4;
        pn0Var.f29388b = 0L;
        ((android.support.v4.media.session.a0) pn0Var.f29389c).G();
        this.f49852p = 0;
        this.f49853q = 0;
        this.f49854r = 0;
        this.f49855s = 0;
        this.f49859x = -1;
        this.f49861z = true;
        this.f49856t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f49858w = Long.MIN_VALUE;
        this.f49860y = false;
        a5.a aVar2 = this.f49842c;
        SparseArray sparseArray = (SparseArray) aVar2.f282c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((th.m1) aVar2.d).accept(sparseArray.valueAt(i11));
        }
        aVar2.f281b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f49855s = 0;
        pn0 pn0Var = this.f49840a;
        pn0Var.f29390f = (z0) pn0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.f49853q;
        if (i10 >= i11 && i10 <= this.f49852p + i11) {
            int i12 = this.f49859x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.f49856t = Long.MIN_VALUE;
            this.f49855s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        c1 c1Var;
        long j11;
        int q6;
        try {
            try {
                H();
                int w9 = w(this.f49855s);
                long j12 = this.f49857u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f49858w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f49858w;
                }
                int i10 = this.f49855s;
                int i11 = this.f49852p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f49850n[w9] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q6 = p(w9, i11 - i10, j10, z10);
                    c1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    c1Var = this;
                    j11 = j10;
                    q6 = c1Var.q(w9, i12, j11, true);
                }
                if (q6 == -1) {
                    return false;
                }
                c1Var.f49856t = j11;
                c1Var.f49855s += q6;
                return true;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized void K(long j10) {
        Throwable th2;
        c1 c1Var;
        long j11;
        int i10;
        try {
            try {
                if (j10 == this.f49857u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f49859x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f49858w) {
                    c1Var = this;
                    j11 = j10;
                    i10 = c1Var.p(this.f49854r, this.f49852p, j11, false);
                } else {
                    c1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = c1Var.f49853q + i10;
                }
                c1Var.f49859x = i11;
                c1Var.f49857u = j11;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final synchronized void L(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f49855s + i10 <= this.f49852p) {
                    z10 = true;
                    t6.f(z10);
                    this.f49855s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        t6.f(z10);
        this.f49855s += i10;
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(b2.x xVar) {
        boolean z10;
        String str;
        boolean z11;
        b2.x r10 = r(xVar);
        boolean z12 = false;
        this.B = false;
        this.C = xVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (((SparseArray) this.f49842c.f282c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f49842c.f282c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).f49822a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f49842c.f282c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).f49822a;
                            boolean z13 = this.F;
                            b2.x xVar2 = this.D;
                            str = xVar2.f2423s;
                            String str2 = xVar2.f2415k;
                            if (b2.v0.h(str) != 1 && b2.v0.a(str, str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.F = z13 & z11;
                            this.G = false;
                            z12 = true;
                        }
                    }
                    this.D = r10;
                    boolean z132 = this.F;
                    b2.x xVar22 = this.D;
                    str = xVar22.f2423s;
                    String str22 = xVar22.f2415k;
                    if (b2.v0.h(str) != 1) {
                    }
                    z11 = false;
                    this.F = z132 & z11;
                    this.G = false;
                    z12 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r62 = this.f49843f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.j0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.c(long, int, int, int, c3.j0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        c3.i0.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        pn0 pn0Var = this.f49840a;
        int c10 = pn0Var.c(i10);
        z0 z0Var = (z0) pn0Var.f29391g;
        y2.a aVar = (y2.a) z0Var.f50073c;
        int read = pVar.read(aVar.f54128a, ((int) (pn0Var.f29388b - z0Var.f50071a)) + aVar.f54129b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = pn0Var.f29388b + read;
        pn0Var.f29388b = j10;
        z0 z0Var2 = (z0) pn0Var.f29391g;
        if (j10 == z0Var2.f50072b) {
            pn0Var.f29391g = (z0) z0Var2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            pn0 pn0Var = this.f49840a;
            if (i10 > 0) {
                int c10 = pn0Var.c(i10);
                z0 z0Var = (z0) pn0Var.f29391g;
                y2.a aVar = (y2.a) z0Var.f50073c;
                xVar.k(((int) (pn0Var.f29388b - z0Var.f50071a)) + aVar.f54129b, c10, aVar.f54128a);
                i10 -= c10;
                long j10 = pn0Var.f29388b + c10;
                pn0Var.f29388b = j10;
                z0 z0Var2 = (z0) pn0Var.f29391g;
                if (j10 == z0Var2.f50072b) {
                    pn0Var.f29391g = (z0) z0Var2.d;
                }
            } else {
                pn0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, c3.j0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.h(long, int, long, int, c3.j0):void");
    }

    public final int i(long j10) {
        int i10 = this.f49852p;
        int w9 = w(i10 - 1);
        while (i10 > this.f49855s && this.f49850n[w9] >= j10) {
            i10--;
            w9--;
            if (w9 == -1) {
                w9 = this.f49845i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        int i11;
        this.v = Math.max(this.v, u(i10));
        this.f49852p -= i10;
        int i12 = this.f49853q + i10;
        this.f49853q = i12;
        int i13 = this.f49854r + i10;
        this.f49854r = i13;
        int i14 = this.f49845i;
        if (i13 >= i14) {
            this.f49854r = i13 - i14;
        }
        int i15 = this.f49855s - i10;
        this.f49855s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f49855s = 0;
        }
        a5.a aVar = this.f49842c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((th.m1) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f281b;
            if (i18 > 0) {
                aVar.f281b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f49852p == 0) {
            int i19 = this.f49854r;
            if (i19 == 0) {
                i19 = this.f49845i;
            }
            return this.f49847k[i19 - 1] + this.f49848l[i11];
        }
        return this.f49847k[this.f49854r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        pn0 pn0Var = this.f49840a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f49852p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f49850n;
                        int i11 = this.f49854r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f49855s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q6 = q(i11, i10, j10, false);
                            if (q6 != -1) {
                                j11 = j(q6);
                            }
                            pn0Var.b(j11);
                        }
                    }
                    pn0Var.b(j11);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void l() {
        long j10;
        pn0 pn0Var = this.f49840a;
        synchronized (this) {
            int i10 = this.f49852p;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = j(i10);
            }
        }
        pn0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f49852p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        o(this.f49853q + i(j10));
    }

    public final long n(int i10) {
        boolean z10;
        int w9;
        int i11 = this.f49853q;
        int i12 = this.f49852p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f49855s) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int i14 = this.f49852p - i13;
        this.f49852p = i14;
        this.f49858w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.f49860y) {
            z11 = true;
        }
        this.f49860y = z11;
        int i15 = this.f49859x;
        int i16 = -1;
        if (i15 != -1 && i10 < i15) {
            this.f49859x = -1;
        }
        a5.a aVar = this.f49842c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((th.m1) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i16 = Math.min(aVar.f281b, sparseArray.size() - 1);
        }
        aVar.f281b = i16;
        int i17 = this.f49852p;
        if (i17 != 0) {
            return this.f49847k[w(i17 - 1)] + this.f49848l[w9];
        }
        return 0L;
    }

    public final void o(int i10) {
        boolean z10;
        pn0 pn0Var = this.f49840a;
        long n10 = n(i10);
        int i11 = pn0Var.f29387a;
        if (n10 <= pn0Var.f29388b) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        pn0Var.f29388b = n10;
        if (n10 != 0) {
            z0 z0Var = (z0) pn0Var.e;
            if (n10 != z0Var.f50071a) {
                while (pn0Var.f29388b > z0Var.f50072b) {
                    z0Var = (z0) z0Var.d;
                }
                z0 z0Var2 = (z0) z0Var.d;
                z0Var2.getClass();
                if (((y2.a) z0Var2.f50073c) != null) {
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) pn0Var.f29389c;
                    synchronized (a0Var) {
                        ((i2.h) a0Var.d).f7873c.b(z0Var2);
                        z0 z0Var3 = z0Var2;
                        while (z0Var3 != null) {
                            y2.a aVar = (y2.a) z0Var3.f50073c;
                            aVar.getClass();
                            a0Var.v(aVar);
                            z0Var3 = (z0) z0Var3.d;
                            if (z0Var3 == null || ((y2.a) z0Var3.f50073c) == null) {
                                z0Var3 = null;
                            }
                        }
                    }
                    z0Var2.f50073c = null;
                    z0Var2.d = null;
                }
                z0 z0Var4 = new z0(z0Var.f50072b, i11);
                z0Var.d = z0Var4;
                if (pn0Var.f29388b == z0Var.f50072b) {
                    z0Var = z0Var4;
                }
                pn0Var.f29391g = z0Var;
                if (((z0) pn0Var.f29390f) == z0Var2) {
                    pn0Var.f29390f = z0Var4;
                    return;
                }
                return;
            }
        }
        pn0Var.a((z0) pn0Var.e);
        z0 z0Var5 = new z0(pn0Var.f29388b, i11);
        pn0Var.e = z0Var5;
        pn0Var.f29390f = z0Var5;
        pn0Var.f29391g = z0Var5;
    }

    public final int p(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f49850n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f49845i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    public final int q(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f49850n[i10] > j10 ? 1 : (this.f49850n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f49849m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f49845i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.x r(b2.x xVar) {
        if (this.H != 0 && xVar.f2427x != Long.MAX_VALUE) {
            b2.w a2 = xVar.a();
            a2.f2374w = xVar.f2427x + this.H;
            return new b2.x(a2);
        }
        return xVar;
    }

    public final synchronized long s() {
        return this.f49858w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f49855s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w9 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f49850n[w9]);
            if ((this.f49849m[w9] & 1) != 0) {
                return j10;
            }
            w9--;
            if (w9 == -1) {
                w9 = this.f49845i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f49853q + this.f49855s;
    }

    public final int w(int i10) {
        int i11 = this.f49854r + i10;
        int i12 = this.f49845i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w9 = w(this.f49855s);
                int i10 = this.f49855s;
                int i11 = this.f49852p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f49850n[w9]) {
                    return 0;
                }
                if (j10 > this.f49858w && z10) {
                    return i11 - i10;
                }
                int q6 = q(w9, i11 - i10, j10, true);
                if (q6 == -1) {
                    return 0;
                }
                return q6;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b2.x y() {
        b2.x xVar;
        if (this.A) {
            xVar = null;
        } else {
            xVar = this.D;
        }
        return xVar;
    }

    public final synchronized boolean z() {
        boolean z10;
        if (this.f49859x != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override
    public final void e(long j10) {
    }
}
