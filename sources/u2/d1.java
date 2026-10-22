package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.fp0;
import v7.u6;
public class d1 implements c3.j0 {
    public boolean B;
    public b2.w C;
    public b2.w D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final fp0 f47282a;
    public final n2.n d;
    public final n2.k e;
    public Object f47285f;
    public b2.w f47286g;
    public n2.h h;
    public int f47294p;
    public int f47295q;
    public int f47296r;
    public int f47297s;
    public boolean f47302y;
    public final j5.c f47283b = new Object();
    public int f47287i = 1000;
    public long[] f47288j = new long[1000];
    public long[] f47289k = new long[1000];
    public long[] f47292n = new long[1000];
    public int[] f47291m = new int[1000];
    public int[] f47290l = new int[1000];
    public c3.i0[] f47293o = new c3.i0[1000];
    public final a5.a f47284c = new a5.a(new sg.y(9));
    public long f47298t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f47300w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f47303z = true;
    public boolean F = true;
    public long f47299u = Long.MIN_VALUE;
    public int f47301x = -1;

    public d1(androidx.biometric.e eVar, n2.n nVar, n2.k kVar) {
        this.d = nVar;
        this.e = kVar;
        this.f47282a = new fp0(eVar);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        b2.w wVar;
        int v = v();
        int i10 = this.f47301x;
        boolean z12 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.f47297s != this.f47294p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f47302y && ((wVar = this.D) == null || wVar == this.f47286g)) {
                z12 = false;
            }
            return z12;
        } else if (((b1) this.f47284c.o(v)).f47269a != this.f47286g) {
            return true;
        } else {
            return B(w(this.f47297s));
        }
    }

    public final boolean B(int i10) {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() != 4) {
            if ((this.f47291m[i10] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() == 1) {
            n2.g g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void D(b2.w wVar, qf.b bVar) {
        boolean z10;
        b2.s sVar;
        b2.w wVar2;
        b2.w wVar3 = this.f47286g;
        if (wVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (wVar3 == null) {
            sVar = null;
        } else {
            sVar = wVar3.f4131w;
        }
        this.f47286g = wVar;
        b2.s sVar2 = wVar.f4131w;
        n2.n nVar = this.d;
        if (nVar != null) {
            int I0 = nVar.I0(wVar);
            b2.v a2 = wVar.a();
            a2.S = I0;
            wVar2 = new b2.w(a2);
        } else {
            wVar2 = wVar;
        }
        bVar.f44451c = wVar2;
        bVar.f44450b = this.h;
        if (nVar != null) {
            if (z10 || !Objects.equals(sVar, sVar2)) {
                n2.h hVar = this.h;
                n2.k kVar = this.e;
                n2.h U0 = nVar.U0(kVar, wVar);
                this.h = U0;
                bVar.f44450b = U0;
                if (hVar != null) {
                    hVar.a(kVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z10;
        long j10;
        try {
            int w9 = w(this.f47297s);
            if (this.f47297s != this.f47294p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f47288j[w9];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(qf.b r12, h2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d1.F(qf.b, h2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        fp0 fp0Var = this.f47282a;
        a1 a1Var = (a1) fp0Var.e;
        if (((y2.a) a1Var.f47260c) != null) {
            androidx.biometric.e eVar = (androidx.biometric.e) fp0Var.f26339c;
            synchronized (eVar) {
                ((i2.j) eVar.d).f12434c.b(a1Var);
                a1 a1Var2 = a1Var;
                while (a1Var2 != null) {
                    y2.a aVar = (y2.a) a1Var2.f47260c;
                    aVar.getClass();
                    eVar.t(aVar);
                    a1Var2 = (a1) a1Var2.d;
                    if (a1Var2 == null || ((y2.a) a1Var2.f47260c) == null) {
                        a1Var2 = null;
                    }
                }
            }
            a1Var.f47260c = null;
            a1Var.d = null;
        }
        a1 a1Var3 = (a1) fp0Var.e;
        int i10 = fp0Var.f26337a;
        if (((y2.a) a1Var3.f47260c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.p(z11);
        a1Var3.f47258a = 0L;
        a1Var3.f47259b = i10;
        a1 a1Var4 = (a1) fp0Var.e;
        fp0Var.f26340f = a1Var4;
        fp0Var.f26341g = a1Var4;
        fp0Var.f26338b = 0L;
        ((androidx.biometric.e) fp0Var.f26339c).w();
        this.f47294p = 0;
        this.f47295q = 0;
        this.f47296r = 0;
        this.f47297s = 0;
        this.f47301x = -1;
        this.f47303z = true;
        this.f47298t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f47300w = Long.MIN_VALUE;
        this.f47302y = false;
        a5.a aVar2 = this.f47284c;
        SparseArray sparseArray = (SparseArray) aVar2.f282c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((sg.y) aVar2.d).accept(sparseArray.valueAt(i11));
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
        this.f47297s = 0;
        fp0 fp0Var = this.f47282a;
        fp0Var.f26340f = (a1) fp0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.f47295q;
        if (i10 >= i11 && i10 <= this.f47294p + i11) {
            int i12 = this.f47301x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.f47298t = Long.MIN_VALUE;
            this.f47297s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        d1 d1Var;
        long j11;
        int q6;
        try {
            try {
                H();
                int w9 = w(this.f47297s);
                long j12 = this.f47299u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f47300w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f47300w;
                }
                int i10 = this.f47297s;
                int i11 = this.f47294p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47292n[w9] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q6 = p(j10, w9, i11 - i10, z10);
                    d1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    d1Var = this;
                    j11 = j10;
                    q6 = d1Var.q(j11, w9, i12, true);
                }
                if (q6 == -1) {
                    return false;
                }
                d1Var.f47298t = j11;
                d1Var.f47297s += q6;
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
        d1 d1Var;
        long j11;
        int i10;
        try {
            try {
                if (j10 == this.f47299u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f47301x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f47300w) {
                    d1Var = this;
                    j11 = j10;
                    i10 = d1Var.p(j11, this.f47296r, this.f47294p, false);
                } else {
                    d1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = d1Var.f47295q + i10;
                }
                d1Var.f47301x = i11;
                d1Var.f47299u = j11;
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
                if (this.f47297s + i10 <= this.f47294p) {
                    z10 = true;
                    u6.g(z10);
                    this.f47297s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        u6.g(z10);
        this.f47297s += i10;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(b2.w wVar) {
        boolean z10;
        String str;
        boolean z11;
        b2.w r10 = r(wVar);
        boolean z12 = false;
        this.B = false;
        this.C = wVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (((SparseArray) this.f47284c.f282c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f47284c.f282c;
                        if (((b1) sparseArray.valueAt(sparseArray.size() - 1)).f47269a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f47284c.f282c;
                            this.D = ((b1) sparseArray2.valueAt(sparseArray2.size() - 1)).f47269a;
                            boolean z13 = this.F;
                            b2.w wVar2 = this.D;
                            str = wVar2.f4128s;
                            String str2 = wVar2.f4120k;
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
                    b2.w wVar22 = this.D;
                    str = wVar22.f4128s;
                    String str22 = wVar22.f4120k;
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
        ?? r62 = this.f47285f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.i0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d1.c(long, int, int, int, c3.i0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        fp0 fp0Var = this.f47282a;
        int c10 = fp0Var.c(i10);
        a1 a1Var = (a1) fp0Var.f26341g;
        y2.a aVar = (y2.a) a1Var.f47260c;
        int read = oVar.read(aVar.f49898a, ((int) (fp0Var.f26338b - a1Var.f47258a)) + aVar.f49899b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = fp0Var.f26338b + read;
        fp0Var.f26338b = j10;
        a1 a1Var2 = (a1) fp0Var.f26341g;
        if (j10 == a1Var2.f47259b) {
            fp0Var.f26341g = (a1) a1Var2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            fp0 fp0Var = this.f47282a;
            if (i10 > 0) {
                int c10 = fp0Var.c(i10);
                a1 a1Var = (a1) fp0Var.f26341g;
                y2.a aVar = (y2.a) a1Var.f47260c;
                xVar.k(((int) (fp0Var.f26338b - a1Var.f47258a)) + aVar.f49899b, c10, aVar.f49898a);
                i10 -= c10;
                long j10 = fp0Var.f26338b + c10;
                fp0Var.f26338b = j10;
                a1 a1Var2 = (a1) fp0Var.f26341g;
                if (j10 == a1Var2.f47259b) {
                    fp0Var.f26341g = (a1) a1Var2.d;
                }
            } else {
                fp0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, c3.i0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d1.h(long, int, long, int, c3.i0):void");
    }

    public final int i(long j10) {
        int i10 = this.f47294p;
        int w9 = w(i10 - 1);
        while (i10 > this.f47297s && this.f47292n[w9] >= j10) {
            i10--;
            w9--;
            if (w9 == -1) {
                w9 = this.f47287i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        int i11;
        this.v = Math.max(this.v, u(i10));
        this.f47294p -= i10;
        int i12 = this.f47295q + i10;
        this.f47295q = i12;
        int i13 = this.f47296r + i10;
        this.f47296r = i13;
        int i14 = this.f47287i;
        if (i13 >= i14) {
            this.f47296r = i13 - i14;
        }
        int i15 = this.f47297s - i10;
        this.f47297s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f47297s = 0;
        }
        a5.a aVar = this.f47284c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((sg.y) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f281b;
            if (i18 > 0) {
                aVar.f281b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f47294p == 0) {
            int i19 = this.f47296r;
            if (i19 == 0) {
                i19 = this.f47287i;
            }
            return this.f47289k[i19 - 1] + this.f47290l[i11];
        }
        return this.f47289k[this.f47296r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        fp0 fp0Var = this.f47282a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f47294p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f47292n;
                        int i11 = this.f47296r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f47297s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q6 = q(j10, i11, i10, false);
                            if (q6 != -1) {
                                j11 = j(q6);
                            }
                            fp0Var.b(j11);
                        }
                    }
                    fp0Var.b(j11);
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
        fp0 fp0Var = this.f47282a;
        synchronized (this) {
            int i10 = this.f47294p;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = j(i10);
            }
        }
        fp0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f47294p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        o(this.f47295q + i(j10));
    }

    public final long n(int i10) {
        boolean z10;
        int w9;
        int i11 = this.f47295q;
        int i12 = this.f47294p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f47297s) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int i14 = this.f47294p - i13;
        this.f47294p = i14;
        this.f47300w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.f47302y) {
            z11 = true;
        }
        this.f47302y = z11;
        int i15 = this.f47301x;
        int i16 = -1;
        if (i15 != -1 && i10 < i15) {
            this.f47301x = -1;
        }
        a5.a aVar = this.f47284c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((sg.y) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i16 = Math.min(aVar.f281b, sparseArray.size() - 1);
        }
        aVar.f281b = i16;
        int i17 = this.f47294p;
        if (i17 != 0) {
            return this.f47289k[w(i17 - 1)] + this.f47290l[w9];
        }
        return 0L;
    }

    public final void o(int i10) {
        boolean z10;
        fp0 fp0Var = this.f47282a;
        long n10 = n(i10);
        int i11 = fp0Var.f26337a;
        if (n10 <= fp0Var.f26338b) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        fp0Var.f26338b = n10;
        if (n10 != 0) {
            a1 a1Var = (a1) fp0Var.e;
            if (n10 != a1Var.f47258a) {
                while (fp0Var.f26338b > a1Var.f47259b) {
                    a1Var = (a1) a1Var.d;
                }
                a1 a1Var2 = (a1) a1Var.d;
                a1Var2.getClass();
                if (((y2.a) a1Var2.f47260c) != null) {
                    androidx.biometric.e eVar = (androidx.biometric.e) fp0Var.f26339c;
                    synchronized (eVar) {
                        ((i2.j) eVar.d).f12434c.b(a1Var2);
                        a1 a1Var3 = a1Var2;
                        while (a1Var3 != null) {
                            y2.a aVar = (y2.a) a1Var3.f47260c;
                            aVar.getClass();
                            eVar.t(aVar);
                            a1Var3 = (a1) a1Var3.d;
                            if (a1Var3 == null || ((y2.a) a1Var3.f47260c) == null) {
                                a1Var3 = null;
                            }
                        }
                    }
                    a1Var2.f47260c = null;
                    a1Var2.d = null;
                }
                a1 a1Var4 = new a1(a1Var.f47259b, i11);
                a1Var.d = a1Var4;
                if (fp0Var.f26338b == a1Var.f47259b) {
                    a1Var = a1Var4;
                }
                fp0Var.f26341g = a1Var;
                if (((a1) fp0Var.f26340f) == a1Var2) {
                    fp0Var.f26340f = a1Var4;
                    return;
                }
                return;
            }
        }
        fp0Var.a((a1) fp0Var.e);
        a1 a1Var5 = new a1(fp0Var.f26338b, i11);
        fp0Var.e = a1Var5;
        fp0Var.f26340f = a1Var5;
        fp0Var.f26341g = a1Var5;
    }

    public final int p(long j10, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f47292n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f47287i) {
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
            int i14 = (this.f47292n[i10] > j10 ? 1 : (this.f47292n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f47291m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47287i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.w r(b2.w wVar) {
        if (this.H != 0 && wVar.f4132x != Long.MAX_VALUE) {
            b2.v a2 = wVar.a();
            a2.f4079w = wVar.f4132x + this.H;
            return new b2.w(a2);
        }
        return wVar;
    }

    public final synchronized long s() {
        return this.f47300w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f47297s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w9 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f47292n[w9]);
            if ((this.f47291m[w9] & 1) != 0) {
                return j10;
            }
            w9--;
            if (w9 == -1) {
                w9 = this.f47287i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f47295q + this.f47297s;
    }

    public final int w(int i10) {
        int i11 = this.f47296r + i10;
        int i12 = this.f47287i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w9 = w(this.f47297s);
                int i10 = this.f47297s;
                int i11 = this.f47294p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47292n[w9]) {
                    return 0;
                }
                if (j10 > this.f47300w && z10) {
                    return i11 - i10;
                }
                int q6 = q(j10, w9, i11 - i10, true);
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

    public final synchronized b2.w y() {
        b2.w wVar;
        if (this.A) {
            wVar = null;
        } else {
            wVar = this.D;
        }
        return wVar;
    }

    public final synchronized boolean z() {
        boolean z10;
        if (this.f47301x != -1) {
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
