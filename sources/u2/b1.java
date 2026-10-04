package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.ap0;
public class b1 implements c3.h0 {
    public b2.s A;
    public b2.s B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final ap0 f47214a;
    public final n2.n d;
    public final n2.k f47217e;
    public Object f47218f;
    public b2.s f47219g;
    public n2.h h;
    public int f47227p;
    public int f47228q;
    public int f47229r;
    public int f47230s;
    public boolean f47233w;
    public boolean f47236z;
    public final ii.b0 f47215b = new Object();
    public int f47220i = 1000;
    public long[] f47221j = new long[1000];
    public long[] f47222k = new long[1000];
    public long[] f47225n = new long[1000];
    public int[] f47224m = new int[1000];
    public int[] f47223l = new int[1000];
    public c3.g0[] f47226o = new c3.g0[1000];
    public final a5.a f47216c = new a5.a(new l0(1));
    public long f47231t = Long.MIN_VALUE;
    public long f47232u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f47235y = true;
    public boolean f47234x = true;
    public boolean D = true;

    public b1(y2.d dVar, n2.n nVar, n2.k kVar) {
        this.d = nVar;
        this.f47217e = kVar;
        this.f47214a = new ap0(dVar);
    }

    public final void A(b2.s sVar, n4.y yVar) {
        boolean z10;
        b2.o oVar;
        b2.s sVar2;
        b2.s sVar3 = this.f47219g;
        if (sVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (sVar3 == null) {
            oVar = null;
        } else {
            oVar = sVar3.v;
        }
        this.f47219g = sVar;
        b2.o oVar2 = sVar.v;
        n2.n nVar = this.d;
        if (nVar != null) {
            int L0 = nVar.L0(sVar);
            b2.r a2 = sVar.a();
            a2.R = L0;
            sVar2 = new b2.s(a2);
        } else {
            sVar2 = sVar;
        }
        yVar.f16640c = sVar2;
        yVar.f16639b = this.h;
        if (nVar != null) {
            if (z10 || !Objects.equals(oVar, oVar2)) {
                n2.h hVar = this.h;
                n2.k kVar = this.f47217e;
                n2.h Y0 = nVar.Y0(kVar, sVar);
                this.h = Y0;
                yVar.f16639b = Y0;
                if (hVar != null) {
                    hVar.a(kVar);
                }
            }
        }
    }

    public final synchronized long B() {
        boolean z10;
        long j3;
        try {
            int u10 = u(this.f47230s);
            if (this.f47230s != this.f47227p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f47221j[u10];
            } else {
                j3 = this.C;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j3;
    }

    public final int C(n4.y yVar, h2.h hVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ii.b0 b0Var = this.f47215b;
        synchronized (this) {
            try {
                hVar.d = false;
                if (this.f47230s != this.f47227p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f47233w) {
                        b2.s sVar = this.B;
                        if (sVar == null || (!z11 && sVar == this.f47219g)) {
                        }
                        A(sVar, yVar);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.f10980e = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    b2.s sVar2 = ((z0) this.f47216c.m(t())).f47450a;
                    if (!z11 && sVar2 == this.f47219g) {
                        int u10 = u(this.f47230s);
                        if (!y(u10)) {
                            hVar.d = true;
                        } else {
                            hVar.setFlags(this.f47224m[u10]);
                            if (this.f47230s == this.f47227p - 1 && (z10 || this.f47233w)) {
                                hVar.addFlag(536870912);
                            }
                            hVar.f10980e = this.f47225n[u10];
                            b0Var.f12233a = this.f47223l[u10];
                            b0Var.f12234b = this.f47222k[u10];
                            b0Var.f12235c = this.f47226o[u10];
                            i11 = -4;
                        }
                    }
                    A(sVar2, yVar);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !hVar.isEndOfStream()) {
            if ((i10 & 1) != 0) {
                z13 = true;
            }
            if ((i10 & 4) == 0) {
                if (z13) {
                    ap0 ap0Var = this.f47214a;
                    ap0.f((y0) ap0Var.f24627f, hVar, this.f47215b, (e2.v) ap0Var.d);
                } else {
                    ap0 ap0Var2 = this.f47214a;
                    ap0Var2.f24627f = ap0.f((y0) ap0Var2.f24627f, hVar, this.f47215b, (e2.v) ap0Var2.d);
                }
            }
            if (!z13) {
                this.f47230s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        boolean z11;
        ap0 ap0Var = this.f47214a;
        ap0Var.a((y0) ap0Var.f24626e);
        y0 y0Var = (y0) ap0Var.f24626e;
        int i10 = ap0Var.f24623a;
        if (((y2.a) y0Var.f47448c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.g(z11);
        y0Var.f47446a = 0L;
        y0Var.f47447b = i10;
        y0 y0Var2 = (y0) ap0Var.f24626e;
        ap0Var.f24627f = y0Var2;
        ap0Var.f24628g = y0Var2;
        ap0Var.f24624b = 0L;
        ((y2.d) ap0Var.f24625c).b();
        this.f47227p = 0;
        this.f47228q = 0;
        this.f47229r = 0;
        this.f47230s = 0;
        this.f47234x = true;
        this.f47231t = Long.MIN_VALUE;
        this.f47232u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f47233w = false;
        a5.a aVar = this.f47216c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((l0) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.f299b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f47235y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f47230s = 0;
        ap0 ap0Var = this.f47214a;
        ap0Var.f24627f = (y0) ap0Var.f24626e;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.f47228q;
        if (i10 >= i11 && i10 <= this.f47227p + i11) {
            this.f47231t = Long.MIN_VALUE;
            this.f47230s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j3, boolean z10) {
        Throwable th2;
        boolean z11;
        b1 b1Var;
        long j10;
        int o9;
        try {
            try {
                E();
                int u10 = u(this.f47230s);
                int i10 = this.f47230s;
                int i11 = this.f47227p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f47225n[u10] || (j3 > this.v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.f47225n[u10] >= j3) {
                                    i12 = i13;
                                    break;
                                }
                                u10++;
                                if (u10 == this.f47220i) {
                                    u10 = 0;
                                }
                                i13++;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        } else if (!z10) {
                            i12 = -1;
                        }
                    }
                    j10 = j3;
                    o9 = i12;
                    b1Var = this;
                } else {
                    int i14 = i11 - i10;
                    b1Var = this;
                    j10 = j3;
                    o9 = b1Var.o(j10, u10, i14, true);
                }
                if (o9 == -1) {
                    return false;
                }
                b1Var.f47231t = j10;
                b1Var.f47230s += o9;
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

    public final synchronized void H(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f47230s + i10 <= this.f47227p) {
                    z10 = true;
                    e2.d.b(z10);
                    this.f47230s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        e2.d.b(z10);
        this.f47230s += i10;
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(b2.s sVar) {
        boolean z10;
        b2.s p5 = p(sVar);
        boolean z11 = false;
        this.f47236z = false;
        this.A = sVar;
        synchronized (this) {
            try {
                this.f47235y = false;
                if (!Objects.equals(p5, this.B)) {
                    if (((SparseArray) this.f47216c.f300c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f47216c.f300c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).f47450a.equals(p5)) {
                            SparseArray sparseArray2 = (SparseArray) this.f47216c.f300c;
                            this.B = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f47450a;
                            boolean z12 = this.D;
                            b2.s sVar2 = this.B;
                            this.D = z12 & b2.r0.a(sVar2.f3564r, sVar2.f3557k);
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = p5;
                    boolean z122 = this.D;
                    b2.s sVar22 = this.B;
                    this.D = z122 & b2.r0.a(sVar22.f3564r, sVar22.f3557k);
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f47218f;
        if (r52 != 0 && z11) {
            r52.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.g0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.c(long, int, int, int, c3.g0):void");
    }

    @Override
    public final void d(int i10, e2.v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        ap0 ap0Var = this.f47214a;
        int c10 = ap0Var.c(i10);
        y0 y0Var = (y0) ap0Var.f24628g;
        y2.a aVar = (y2.a) y0Var.f47448c;
        int read = kVar.read(aVar.f50359a, ((int) (ap0Var.f24624b - y0Var.f47446a)) + aVar.f50360b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = ap0Var.f24624b + read;
        ap0Var.f24624b = j3;
        y0 y0Var2 = (y0) ap0Var.f24628g;
        if (j3 == y0Var2.f47447b) {
            ap0Var.f24628g = (y0) y0Var2.d;
        }
        return read;
    }

    @Override
    public final void f(e2.v vVar, int i10, int i11) {
        while (true) {
            ap0 ap0Var = this.f47214a;
            if (i10 > 0) {
                int c10 = ap0Var.c(i10);
                y0 y0Var = (y0) ap0Var.f24628g;
                y2.a aVar = (y2.a) y0Var.f47448c;
                vVar.h(((int) (ap0Var.f24624b - y0Var.f47446a)) + aVar.f50360b, c10, aVar.f50359a);
                i10 -= c10;
                long j3 = ap0Var.f24624b + c10;
                ap0Var.f24624b = j3;
                y0 y0Var2 = (y0) ap0Var.f24628g;
                if (j3 == y0Var2.f47447b) {
                    ap0Var.f24628g = (y0) y0Var2.d;
                }
            } else {
                ap0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void g(long r9, int r11, long r12, int r14, c3.g0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.g(long, int, long, int, c3.g0):void");
    }

    public final int h(long j3) {
        int i10 = this.f47227p;
        int u10 = u(i10 - 1);
        while (i10 > this.f47230s && this.f47225n[u10] >= j3) {
            i10--;
            u10--;
            if (u10 == -1) {
                u10 = this.f47220i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        int i11;
        this.f47232u = Math.max(this.f47232u, s(i10));
        this.f47227p -= i10;
        int i12 = this.f47228q + i10;
        this.f47228q = i12;
        int i13 = this.f47229r + i10;
        this.f47229r = i13;
        int i14 = this.f47220i;
        if (i13 >= i14) {
            this.f47229r = i13 - i14;
        }
        int i15 = this.f47230s - i10;
        this.f47230s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f47230s = 0;
        }
        a5.a aVar = this.f47216c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((l0) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f299b;
            if (i18 > 0) {
                aVar.f299b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f47227p == 0) {
            int i19 = this.f47229r;
            if (i19 == 0) {
                i19 = this.f47220i;
            }
            return this.f47222k[i19 - 1] + this.f47223l[i11];
        }
        return this.f47222k[this.f47229r];
    }

    public final void j(long j3, boolean z10) {
        Throwable th2;
        ap0 ap0Var = this.f47214a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f47227p;
                    long j10 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f47225n;
                        int i11 = this.f47229r;
                        if (j3 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f47230s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int o9 = o(j3, i11, i10, false);
                            if (o9 != -1) {
                                j10 = i(o9);
                            }
                            ap0Var.b(j10);
                        }
                    }
                    ap0Var.b(j10);
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

    public final void k() {
        long i10;
        ap0 ap0Var = this.f47214a;
        synchronized (this) {
            int i11 = this.f47227p;
            if (i11 == 0) {
                i10 = -1;
            } else {
                i10 = i(i11);
            }
        }
        ap0Var.b(i10);
    }

    public final void l(long j3) {
        boolean z10;
        if (this.f47227p == 0) {
            return;
        }
        if (j3 > r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        n(this.f47228q + h(j3));
    }

    public final long m(int i10) {
        boolean z10;
        int i11;
        int u10;
        int i12 = this.f47228q;
        int i13 = this.f47227p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f47230s) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i15 = this.f47227p - i14;
        this.f47227p = i15;
        this.v = Math.max(this.f47232u, s(i15));
        if (i14 == 0 && this.f47233w) {
            z11 = true;
        }
        this.f47233w = z11;
        a5.a aVar = this.f47216c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((l0) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(aVar.f299b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        aVar.f299b = i11;
        int i16 = this.f47227p;
        if (i16 != 0) {
            return this.f47222k[u(i16 - 1)] + this.f47223l[u10];
        }
        return 0L;
    }

    public final void n(int i10) {
        boolean z10;
        long m10 = m(i10);
        ap0 ap0Var = this.f47214a;
        int i11 = ap0Var.f24623a;
        if (m10 <= ap0Var.f24624b) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ap0Var.f24624b = m10;
        if (m10 != 0) {
            y0 y0Var = (y0) ap0Var.f24626e;
            if (m10 != y0Var.f47446a) {
                while (ap0Var.f24624b > y0Var.f47447b) {
                    y0Var = (y0) y0Var.d;
                }
                y0 y0Var2 = (y0) y0Var.d;
                y0Var2.getClass();
                ap0Var.a(y0Var2);
                y0 y0Var3 = new y0(y0Var.f47447b, i11);
                y0Var.d = y0Var3;
                if (ap0Var.f24624b == y0Var.f47447b) {
                    y0Var = y0Var3;
                }
                ap0Var.f24628g = y0Var;
                if (((y0) ap0Var.f24627f) == y0Var2) {
                    ap0Var.f24627f = y0Var3;
                    return;
                }
                return;
            }
        }
        ap0Var.a((y0) ap0Var.f24626e);
        y0 y0Var4 = new y0(ap0Var.f24624b, i11);
        ap0Var.f24626e = y0Var4;
        ap0Var.f24627f = y0Var4;
        ap0Var.f24628g = y0Var4;
    }

    public final int o(long j3, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f47225n[i10] > j3 ? 1 : (this.f47225n[i10] == j3 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f47224m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47220i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.s p(b2.s sVar) {
        if (this.F != 0 && sVar.f3568w != Long.MAX_VALUE) {
            b2.r a2 = sVar.a();
            a2.v = sVar.f3568w + this.F;
            return new b2.s(a2);
        }
        return sVar;
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.f47232u, s(this.f47230s));
    }

    public final long s(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int u10 = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f47225n[u10]);
            if ((this.f47224m[u10] & 1) != 0) {
                return j3;
            }
            u10--;
            if (u10 == -1) {
                u10 = this.f47220i - 1;
            }
        }
        return j3;
    }

    public final int t() {
        return this.f47228q + this.f47230s;
    }

    public final int u(int i10) {
        int i11 = this.f47229r + i10;
        int i12 = this.f47220i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int v(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int u10 = u(this.f47230s);
                int i10 = this.f47230s;
                int i11 = this.f47227p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f47225n[u10]) {
                    return 0;
                }
                if (j3 > this.v && z10) {
                    return i11 - i10;
                }
                int o9 = o(j3, u10, i11 - i10, true);
                if (o9 == -1) {
                    return 0;
                }
                return o9;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized b2.s w() {
        b2.s sVar;
        if (this.f47235y) {
            sVar = null;
        } else {
            sVar = this.B;
        }
        return sVar;
    }

    public final synchronized boolean x(boolean z10) {
        boolean z11;
        b2.s sVar;
        boolean z12 = false;
        if (this.f47230s != this.f47227p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f47233w || ((sVar = this.B) != null && sVar != this.f47219g)) {
                z12 = true;
            }
            return z12;
        } else if (((z0) this.f47216c.m(t())).f47450a != this.f47219g) {
            return true;
        } else {
            return y(u(this.f47230s));
        }
    }

    public final boolean y(int i10) {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() != 4) {
            if ((this.f47224m[i10] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void z() {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() == 1) {
            n2.g g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }
}
