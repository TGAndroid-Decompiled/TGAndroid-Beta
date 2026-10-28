package u2;

import a8.ng;
import a8.yb;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.pp0;
public class c1 implements c3.j0 {
    public boolean B;
    public b2.x C;
    public b2.x D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final pp0 f49297a;
    public final n2.m d;
    public final n2.j e;
    public Object f49300f;
    public b2.x f49301g;
    public n2.g h;
    public int f49309p;
    public int f49310q;
    public int f49311r;
    public int f49312s;
    public boolean f49317y;
    public final k5.b f49298b = new Object();
    public int f49302i = 1000;
    public long[] f49303j = new long[1000];
    public long[] f49304k = new long[1000];
    public long[] f49307n = new long[1000];
    public int[] f49306m = new int[1000];
    public int[] f49305l = new int[1000];
    public c3.i0[] f49308o = new c3.i0[1000];
    public final ng f49299c = new ng(new s0.b(19));
    public long f49313t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f49315w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f49318z = true;
    public boolean F = true;
    public long f49314u = Long.MIN_VALUE;
    public int f49316x = -1;

    public c1(a8.h0 h0Var, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.e = jVar;
        this.f49297a = new pp0(h0Var);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        b2.x xVar;
        int v = v();
        int i10 = this.f49316x;
        boolean z12 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.f49312s != this.f49309p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f49317y && ((xVar = this.D) == null || xVar == this.f49301g)) {
                z12 = false;
            }
            return z12;
        } else if (((a1) this.f49299c.n(v)).f49279a != this.f49301g) {
            return true;
        } else {
            return B(w(this.f49312s));
        }
    }

    public final boolean B(int i10) {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f49306m[i10] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() == 1) {
            n2.f g7 = this.h.g();
            g7.getClass();
            throw g7;
        }
    }

    public final void D(b2.x xVar, n4.s sVar) {
        boolean z10;
        b2.t tVar;
        b2.x xVar2;
        b2.x xVar3 = this.f49301g;
        if (xVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (xVar3 == null) {
            tVar = null;
        } else {
            tVar = xVar3.f3589w;
        }
        this.f49301g = xVar;
        b2.t tVar2 = xVar.f3589w;
        n2.m mVar = this.d;
        if (mVar != null) {
            int w10 = mVar.w(xVar);
            b2.w a2 = xVar.a();
            a2.S = w10;
            xVar2 = new b2.x(a2);
        } else {
            xVar2 = xVar;
        }
        sVar.f18696c = xVar2;
        sVar.f18695b = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(tVar, tVar2)) {
                n2.g gVar = this.h;
                n2.j jVar = this.e;
                n2.g z11 = mVar.z(jVar, xVar);
                this.h = z11;
                sVar.f18695b = z11;
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
            int w10 = w(this.f49312s);
            if (this.f49312s != this.f49309p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f49303j[w10];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(n4.s r12, h2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.F(n4.s, h2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        pp0 pp0Var = this.f49297a;
        z0 z0Var = (z0) pp0Var.e;
        if (((y2.a) z0Var.f49529c) != null) {
            a8.h0 h0Var = (a8.h0) pp0Var.f31699c;
            synchronized (h0Var) {
                ((i2.i) h0Var.d).f13560c.b(z0Var);
                z0 z0Var2 = z0Var;
                while (z0Var2 != null) {
                    y2.a aVar = (y2.a) z0Var2.f49529c;
                    aVar.getClass();
                    h0Var.t(aVar);
                    z0Var2 = (z0) z0Var2.d;
                    if (z0Var2 == null || ((y2.a) z0Var2.f49529c) == null) {
                        z0Var2 = null;
                    }
                }
            }
            z0Var.f49529c = null;
            z0Var.d = null;
        }
        z0 z0Var3 = (z0) pp0Var.e;
        int i10 = pp0Var.f31697a;
        if (((y2.a) z0Var3.f49529c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.p(z11);
        z0Var3.f49527a = 0L;
        z0Var3.f49528b = i10;
        z0 z0Var4 = (z0) pp0Var.e;
        pp0Var.f31700f = z0Var4;
        pp0Var.f31701g = z0Var4;
        pp0Var.f31698b = 0L;
        ((a8.h0) pp0Var.f31699c).u();
        this.f49309p = 0;
        this.f49310q = 0;
        this.f49311r = 0;
        this.f49312s = 0;
        this.f49316x = -1;
        this.f49318z = true;
        this.f49313t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f49315w = Long.MIN_VALUE;
        this.f49317y = false;
        ng ngVar = this.f49299c;
        SparseArray sparseArray = (SparseArray) ngVar.f640c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((s0.b) ngVar.d).accept(sparseArray.valueAt(i11));
        }
        ngVar.f639b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f49312s = 0;
        pp0 pp0Var = this.f49297a;
        pp0Var.f31700f = (z0) pp0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.f49310q;
        if (i10 >= i11 && i10 <= this.f49309p + i11) {
            int i12 = this.f49316x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.f49313t = Long.MIN_VALUE;
            this.f49312s = i10 - i11;
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
        int q5;
        try {
            try {
                H();
                int w10 = w(this.f49312s);
                long j12 = this.f49314u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f49315w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f49315w;
                }
                int i10 = this.f49312s;
                int i11 = this.f49309p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f49307n[w10] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q5 = p(j10, w10, i11 - i10, z10);
                    c1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    c1Var = this;
                    j11 = j10;
                    q5 = c1Var.q(j11, w10, i12, true);
                }
                if (q5 == -1) {
                    return false;
                }
                c1Var.f49313t = j11;
                c1Var.f49312s += q5;
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
                if (j10 == this.f49314u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f49316x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f49315w) {
                    c1Var = this;
                    j11 = j10;
                    i10 = c1Var.p(j11, this.f49311r, this.f49309p, false);
                } else {
                    c1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = c1Var.f49310q + i10;
                }
                c1Var.f49316x = i11;
                c1Var.f49314u = j11;
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
                if (this.f49312s + i10 <= this.f49309p) {
                    z10 = true;
                    yb.g(z10);
                    this.f49312s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        yb.g(z10);
        this.f49312s += i10;
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
        b2.x r6 = r(xVar);
        boolean z12 = false;
        this.B = false;
        this.C = xVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r6, this.D)) {
                    if (((SparseArray) this.f49299c.f640c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f49299c.f640c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).f49279a.equals(r6)) {
                            SparseArray sparseArray2 = (SparseArray) this.f49299c.f640c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).f49279a;
                            boolean z13 = this.F;
                            b2.x xVar2 = this.D;
                            str = xVar2.f3586s;
                            String str2 = xVar2.f3578k;
                            if (b2.w0.h(str) != 1 && b2.w0.a(str, str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.F = z13 & z11;
                            this.G = false;
                            z12 = true;
                        }
                    }
                    this.D = r6;
                    boolean z132 = this.F;
                    b2.x xVar22 = this.D;
                    str = xVar22.f3586s;
                    String str22 = xVar22.f3578k;
                    if (b2.w0.h(str) != 1) {
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
        ?? r62 = this.f49300f;
        if (r62 != 0 && z12) {
            r62.d();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.i0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.c(long, int, int, int, c3.i0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        c3.h0.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        pp0 pp0Var = this.f49297a;
        int c10 = pp0Var.c(i10);
        z0 z0Var = (z0) pp0Var.f31701g;
        y2.a aVar = (y2.a) z0Var.f49529c;
        int read = pVar.read(aVar.f51986a, ((int) (pp0Var.f31698b - z0Var.f49527a)) + aVar.f51987b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = pp0Var.f31698b + read;
        pp0Var.f31698b = j10;
        z0 z0Var2 = (z0) pp0Var.f31701g;
        if (j10 == z0Var2.f49528b) {
            pp0Var.f31701g = (z0) z0Var2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            pp0 pp0Var = this.f49297a;
            if (i10 > 0) {
                int c10 = pp0Var.c(i10);
                z0 z0Var = (z0) pp0Var.f31701g;
                y2.a aVar = (y2.a) z0Var.f49529c;
                xVar.k(((int) (pp0Var.f31698b - z0Var.f49527a)) + aVar.f51987b, c10, aVar.f51986a);
                i10 -= c10;
                long j10 = pp0Var.f31698b + c10;
                pp0Var.f31698b = j10;
                z0 z0Var2 = (z0) pp0Var.f31701g;
                if (j10 == z0Var2.f49528b) {
                    pp0Var.f31701g = (z0) z0Var2.d;
                }
            } else {
                pp0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, c3.i0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c1.h(long, int, long, int, c3.i0):void");
    }

    public final int i(long j10) {
        int i10 = this.f49309p;
        int w10 = w(i10 - 1);
        while (i10 > this.f49312s && this.f49307n[w10] >= j10) {
            i10--;
            w10--;
            if (w10 == -1) {
                w10 = this.f49302i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        int i11;
        this.v = Math.max(this.v, u(i10));
        this.f49309p -= i10;
        int i12 = this.f49310q + i10;
        this.f49310q = i12;
        int i13 = this.f49311r + i10;
        this.f49311r = i13;
        int i14 = this.f49302i;
        if (i13 >= i14) {
            this.f49311r = i13 - i14;
        }
        int i15 = this.f49312s - i10;
        this.f49312s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f49312s = 0;
        }
        ng ngVar = this.f49299c;
        SparseArray sparseArray = (SparseArray) ngVar.f640c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((s0.b) ngVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = ngVar.f639b;
            if (i18 > 0) {
                ngVar.f639b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f49309p == 0) {
            int i19 = this.f49311r;
            if (i19 == 0) {
                i19 = this.f49302i;
            }
            return this.f49304k[i19 - 1] + this.f49305l[i11];
        }
        return this.f49304k[this.f49311r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        pp0 pp0Var = this.f49297a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f49309p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f49307n;
                        int i11 = this.f49311r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f49312s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q5 = q(j10, i11, i10, false);
                            if (q5 != -1) {
                                j11 = j(q5);
                            }
                            pp0Var.b(j11);
                        }
                    }
                    pp0Var.b(j11);
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
        pp0 pp0Var = this.f49297a;
        synchronized (this) {
            int i10 = this.f49309p;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = j(i10);
            }
        }
        pp0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f49309p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        o(this.f49310q + i(j10));
    }

    public final long n(int i10) {
        boolean z10;
        int w10;
        int i11 = this.f49310q;
        int i12 = this.f49309p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f49312s) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int i14 = this.f49309p - i13;
        this.f49309p = i14;
        this.f49315w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.f49317y) {
            z11 = true;
        }
        this.f49317y = z11;
        int i15 = this.f49316x;
        int i16 = -1;
        if (i15 != -1 && i10 < i15) {
            this.f49316x = -1;
        }
        ng ngVar = this.f49299c;
        SparseArray sparseArray = (SparseArray) ngVar.f640c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((s0.b) ngVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i16 = Math.min(ngVar.f639b, sparseArray.size() - 1);
        }
        ngVar.f639b = i16;
        int i17 = this.f49309p;
        if (i17 != 0) {
            return this.f49304k[w(i17 - 1)] + this.f49305l[w10];
        }
        return 0L;
    }

    public final void o(int i10) {
        boolean z10;
        pp0 pp0Var = this.f49297a;
        long n10 = n(i10);
        int i11 = pp0Var.f31697a;
        if (n10 <= pp0Var.f31698b) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        pp0Var.f31698b = n10;
        if (n10 != 0) {
            z0 z0Var = (z0) pp0Var.e;
            if (n10 != z0Var.f49527a) {
                while (pp0Var.f31698b > z0Var.f49528b) {
                    z0Var = (z0) z0Var.d;
                }
                z0 z0Var2 = (z0) z0Var.d;
                z0Var2.getClass();
                if (((y2.a) z0Var2.f49529c) != null) {
                    a8.h0 h0Var = (a8.h0) pp0Var.f31699c;
                    synchronized (h0Var) {
                        ((i2.i) h0Var.d).f13560c.b(z0Var2);
                        z0 z0Var3 = z0Var2;
                        while (z0Var3 != null) {
                            y2.a aVar = (y2.a) z0Var3.f49529c;
                            aVar.getClass();
                            h0Var.t(aVar);
                            z0Var3 = (z0) z0Var3.d;
                            if (z0Var3 == null || ((y2.a) z0Var3.f49529c) == null) {
                                z0Var3 = null;
                            }
                        }
                    }
                    z0Var2.f49529c = null;
                    z0Var2.d = null;
                }
                z0 z0Var4 = new z0(z0Var.f49528b, i11);
                z0Var.d = z0Var4;
                if (pp0Var.f31698b == z0Var.f49528b) {
                    z0Var = z0Var4;
                }
                pp0Var.f31701g = z0Var;
                if (((z0) pp0Var.f31700f) == z0Var2) {
                    pp0Var.f31700f = z0Var4;
                    return;
                }
                return;
            }
        }
        pp0Var.a((z0) pp0Var.e);
        z0 z0Var5 = new z0(pp0Var.f31698b, i11);
        pp0Var.e = z0Var5;
        pp0Var.f31700f = z0Var5;
        pp0Var.f31701g = z0Var5;
    }

    public final int p(long j10, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f49307n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f49302i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    public final int q(long j10, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f49307n[i10] > j10 ? 1 : (this.f49307n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f49306m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f49302i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.x r(b2.x xVar) {
        if (this.H != 0 && xVar.f3590x != Long.MAX_VALUE) {
            b2.w a2 = xVar.a();
            a2.f3537w = xVar.f3590x + this.H;
            return new b2.x(a2);
        }
        return xVar;
    }

    public final synchronized long s() {
        return this.f49315w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f49312s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f49307n[w10]);
            if ((this.f49306m[w10] & 1) != 0) {
                return j10;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.f49302i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f49310q + this.f49312s;
    }

    public final int w(int i10) {
        int i11 = this.f49311r + i10;
        int i12 = this.f49302i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w10 = w(this.f49312s);
                int i10 = this.f49312s;
                int i11 = this.f49309p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f49307n[w10]) {
                    return 0;
                }
                if (j10 > this.f49315w && z10) {
                    return i11 - i10;
                }
                int q5 = q(j10, w10, i11 - i10, true);
                if (q5 == -1) {
                    return 0;
                }
                return q5;
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
        if (this.f49316x != -1) {
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
