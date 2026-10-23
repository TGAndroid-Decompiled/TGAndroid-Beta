package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.jp0;
import v7.u6;
public class e1 implements c3.l0 {
    public boolean B;
    public b2.w C;
    public b2.w D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final jp0 f47737a;
    public final n2.n d;
    public final n2.k e;
    public Object f47740f;
    public b2.w f47741g;
    public n2.h h;
    public int f47749p;
    public int f47750q;
    public int f47751r;
    public int f47752s;
    public boolean f47757y;
    public final j5.c f47738b = new Object();
    public int f47742i = 1000;
    public long[] f47743j = new long[1000];
    public long[] f47744k = new long[1000];
    public long[] f47747n = new long[1000];
    public int[] f47746m = new int[1000];
    public int[] f47745l = new int[1000];
    public c3.k0[] f47748o = new c3.k0[1000];
    public final a5.a f47739c = new a5.a(new s0.b(21));
    public long f47753t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f47755w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f47758z = true;
    public boolean F = true;
    public long f47754u = Long.MIN_VALUE;
    public int f47756x = -1;

    public e1(androidx.biometric.e eVar, n2.n nVar, n2.k kVar) {
        this.d = nVar;
        this.e = kVar;
        this.f47737a = new jp0(eVar);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        b2.w wVar;
        int v = v();
        int i10 = this.f47756x;
        boolean z12 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.f47752s != this.f47749p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f47757y && ((wVar = this.D) == null || wVar == this.f47741g)) {
                z12 = false;
            }
            return z12;
        } else if (((c1) this.f47739c.o(v)).f47722a != this.f47741g) {
            return true;
        } else {
            return B(w(this.f47752s));
        }
    }

    public final boolean B(int i10) {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() != 4) {
            if ((this.f47746m[i10] & 1073741824) != 0 || !this.h.d()) {
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
        b2.w wVar3 = this.f47741g;
        if (wVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (wVar3 == null) {
            sVar = null;
        } else {
            sVar = wVar3.f4138w;
        }
        this.f47741g = wVar;
        b2.s sVar2 = wVar.f4138w;
        n2.n nVar = this.d;
        if (nVar != null) {
            int I0 = nVar.I0(wVar);
            b2.v a2 = wVar.a();
            a2.S = I0;
            wVar2 = new b2.w(a2);
        } else {
            wVar2 = wVar;
        }
        bVar.f44865c = wVar2;
        bVar.f44864b = this.h;
        if (nVar != null) {
            if (z10 || !Objects.equals(sVar, sVar2)) {
                n2.h hVar = this.h;
                n2.k kVar = this.e;
                n2.h U0 = nVar.U0(kVar, wVar);
                this.h = U0;
                bVar.f44864b = U0;
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
            int w9 = w(this.f47752s);
            if (this.f47752s != this.f47749p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f47743j[w9];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(qf.b r12, h2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e1.F(qf.b, h2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        jp0 jp0Var = this.f47737a;
        b1 b1Var = (b1) jp0Var.e;
        if (((y2.a) b1Var.f47710c) != null) {
            androidx.biometric.e eVar = (androidx.biometric.e) jp0Var.f27737c;
            synchronized (eVar) {
                ((i2.i) eVar.d).f12463c.b(b1Var);
                b1 b1Var2 = b1Var;
                while (b1Var2 != null) {
                    y2.a aVar = (y2.a) b1Var2.f47710c;
                    aVar.getClass();
                    eVar.t(aVar);
                    b1Var2 = (b1) b1Var2.d;
                    if (b1Var2 == null || ((y2.a) b1Var2.f47710c) == null) {
                        b1Var2 = null;
                    }
                }
            }
            b1Var.f47710c = null;
            b1Var.d = null;
        }
        b1 b1Var3 = (b1) jp0Var.e;
        int i10 = jp0Var.f27735a;
        if (((y2.a) b1Var3.f47710c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.p(z11);
        b1Var3.f47708a = 0L;
        b1Var3.f47709b = i10;
        b1 b1Var4 = (b1) jp0Var.e;
        jp0Var.f27738f = b1Var4;
        jp0Var.f27739g = b1Var4;
        jp0Var.f27736b = 0L;
        ((androidx.biometric.e) jp0Var.f27737c).w();
        this.f47749p = 0;
        this.f47750q = 0;
        this.f47751r = 0;
        this.f47752s = 0;
        this.f47756x = -1;
        this.f47758z = true;
        this.f47753t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f47755w = Long.MIN_VALUE;
        this.f47757y = false;
        a5.a aVar2 = this.f47739c;
        SparseArray sparseArray = (SparseArray) aVar2.f282c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((s0.b) aVar2.d).accept(sparseArray.valueAt(i11));
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
        this.f47752s = 0;
        jp0 jp0Var = this.f47737a;
        jp0Var.f27738f = (b1) jp0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.f47750q;
        if (i10 >= i11 && i10 <= this.f47749p + i11) {
            int i12 = this.f47756x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.f47753t = Long.MIN_VALUE;
            this.f47752s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        e1 e1Var;
        long j11;
        int q6;
        try {
            try {
                H();
                int w9 = w(this.f47752s);
                long j12 = this.f47754u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f47755w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f47755w;
                }
                int i10 = this.f47752s;
                int i11 = this.f47749p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47747n[w9] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q6 = p(j10, w9, i11 - i10, z10);
                    e1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    e1Var = this;
                    j11 = j10;
                    q6 = e1Var.q(j11, w9, i12, true);
                }
                if (q6 == -1) {
                    return false;
                }
                e1Var.f47753t = j11;
                e1Var.f47752s += q6;
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
        e1 e1Var;
        long j11;
        int i10;
        try {
            try {
                if (j10 == this.f47754u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f47756x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f47755w) {
                    e1Var = this;
                    j11 = j10;
                    i10 = e1Var.p(j11, this.f47751r, this.f47749p, false);
                } else {
                    e1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = e1Var.f47750q + i10;
                }
                e1Var.f47756x = i11;
                e1Var.f47754u = j11;
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
                if (this.f47752s + i10 <= this.f47749p) {
                    z10 = true;
                    u6.g(z10);
                    this.f47752s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        u6.g(z10);
        this.f47752s += i10;
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
                    if (((SparseArray) this.f47739c.f282c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f47739c.f282c;
                        if (((c1) sparseArray.valueAt(sparseArray.size() - 1)).f47722a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f47739c.f282c;
                            this.D = ((c1) sparseArray2.valueAt(sparseArray2.size() - 1)).f47722a;
                            boolean z13 = this.F;
                            b2.w wVar2 = this.D;
                            str = wVar2.f4135s;
                            String str2 = wVar2.f4127k;
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
                    str = wVar22.f4135s;
                    String str22 = wVar22.f4127k;
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
        ?? r62 = this.f47740f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.k0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e1.c(long, int, int, int, c3.k0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        jp0 jp0Var = this.f47737a;
        int c10 = jp0Var.c(i10);
        b1 b1Var = (b1) jp0Var.f27739g;
        y2.a aVar = (y2.a) b1Var.f47710c;
        int read = oVar.read(aVar.f50339a, ((int) (jp0Var.f27736b - b1Var.f47708a)) + aVar.f50340b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = jp0Var.f27736b + read;
        jp0Var.f27736b = j10;
        b1 b1Var2 = (b1) jp0Var.f27739g;
        if (j10 == b1Var2.f47709b) {
            jp0Var.f27739g = (b1) b1Var2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            jp0 jp0Var = this.f47737a;
            if (i10 > 0) {
                int c10 = jp0Var.c(i10);
                b1 b1Var = (b1) jp0Var.f27739g;
                y2.a aVar = (y2.a) b1Var.f47710c;
                xVar.k(((int) (jp0Var.f27736b - b1Var.f47708a)) + aVar.f50340b, c10, aVar.f50339a);
                i10 -= c10;
                long j10 = jp0Var.f27736b + c10;
                jp0Var.f27736b = j10;
                b1 b1Var2 = (b1) jp0Var.f27739g;
                if (j10 == b1Var2.f47709b) {
                    jp0Var.f27739g = (b1) b1Var2.d;
                }
            } else {
                jp0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, c3.k0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e1.h(long, int, long, int, c3.k0):void");
    }

    public final int i(long j10) {
        int i10 = this.f47749p;
        int w9 = w(i10 - 1);
        while (i10 > this.f47752s && this.f47747n[w9] >= j10) {
            i10--;
            w9--;
            if (w9 == -1) {
                w9 = this.f47742i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        int i11;
        this.v = Math.max(this.v, u(i10));
        this.f47749p -= i10;
        int i12 = this.f47750q + i10;
        this.f47750q = i12;
        int i13 = this.f47751r + i10;
        this.f47751r = i13;
        int i14 = this.f47742i;
        if (i13 >= i14) {
            this.f47751r = i13 - i14;
        }
        int i15 = this.f47752s - i10;
        this.f47752s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f47752s = 0;
        }
        a5.a aVar = this.f47739c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((s0.b) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f281b;
            if (i18 > 0) {
                aVar.f281b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f47749p == 0) {
            int i19 = this.f47751r;
            if (i19 == 0) {
                i19 = this.f47742i;
            }
            return this.f47744k[i19 - 1] + this.f47745l[i11];
        }
        return this.f47744k[this.f47751r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        jp0 jp0Var = this.f47737a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f47749p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f47747n;
                        int i11 = this.f47751r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f47752s;
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
                            jp0Var.b(j11);
                        }
                    }
                    jp0Var.b(j11);
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
        jp0 jp0Var = this.f47737a;
        synchronized (this) {
            int i10 = this.f47749p;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = j(i10);
            }
        }
        jp0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f47749p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        o(this.f47750q + i(j10));
    }

    public final long n(int i10) {
        boolean z10;
        int w9;
        int i11 = this.f47750q;
        int i12 = this.f47749p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f47752s) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int i14 = this.f47749p - i13;
        this.f47749p = i14;
        this.f47755w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.f47757y) {
            z11 = true;
        }
        this.f47757y = z11;
        int i15 = this.f47756x;
        int i16 = -1;
        if (i15 != -1 && i10 < i15) {
            this.f47756x = -1;
        }
        a5.a aVar = this.f47739c;
        SparseArray sparseArray = (SparseArray) aVar.f282c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((s0.b) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i16 = Math.min(aVar.f281b, sparseArray.size() - 1);
        }
        aVar.f281b = i16;
        int i17 = this.f47749p;
        if (i17 != 0) {
            return this.f47744k[w(i17 - 1)] + this.f47745l[w9];
        }
        return 0L;
    }

    public final void o(int i10) {
        boolean z10;
        jp0 jp0Var = this.f47737a;
        long n10 = n(i10);
        int i11 = jp0Var.f27735a;
        if (n10 <= jp0Var.f27736b) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        jp0Var.f27736b = n10;
        if (n10 != 0) {
            b1 b1Var = (b1) jp0Var.e;
            if (n10 != b1Var.f47708a) {
                while (jp0Var.f27736b > b1Var.f47709b) {
                    b1Var = (b1) b1Var.d;
                }
                b1 b1Var2 = (b1) b1Var.d;
                b1Var2.getClass();
                if (((y2.a) b1Var2.f47710c) != null) {
                    androidx.biometric.e eVar = (androidx.biometric.e) jp0Var.f27737c;
                    synchronized (eVar) {
                        ((i2.i) eVar.d).f12463c.b(b1Var2);
                        b1 b1Var3 = b1Var2;
                        while (b1Var3 != null) {
                            y2.a aVar = (y2.a) b1Var3.f47710c;
                            aVar.getClass();
                            eVar.t(aVar);
                            b1Var3 = (b1) b1Var3.d;
                            if (b1Var3 == null || ((y2.a) b1Var3.f47710c) == null) {
                                b1Var3 = null;
                            }
                        }
                    }
                    b1Var2.f47710c = null;
                    b1Var2.d = null;
                }
                b1 b1Var4 = new b1(b1Var.f47709b, i11);
                b1Var.d = b1Var4;
                if (jp0Var.f27736b == b1Var.f47709b) {
                    b1Var = b1Var4;
                }
                jp0Var.f27739g = b1Var;
                if (((b1) jp0Var.f27738f) == b1Var2) {
                    jp0Var.f27738f = b1Var4;
                    return;
                }
                return;
            }
        }
        jp0Var.a((b1) jp0Var.e);
        b1 b1Var5 = new b1(jp0Var.f27736b, i11);
        jp0Var.e = b1Var5;
        jp0Var.f27738f = b1Var5;
        jp0Var.f27739g = b1Var5;
    }

    public final int p(long j10, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f47747n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f47742i) {
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
            int i14 = (this.f47747n[i10] > j10 ? 1 : (this.f47747n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f47746m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47742i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.w r(b2.w wVar) {
        if (this.H != 0 && wVar.f4139x != Long.MAX_VALUE) {
            b2.v a2 = wVar.a();
            a2.f4086w = wVar.f4139x + this.H;
            return new b2.w(a2);
        }
        return wVar;
    }

    public final synchronized long s() {
        return this.f47755w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f47752s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w9 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f47747n[w9]);
            if ((this.f47746m[w9] & 1) != 0) {
                return j10;
            }
            w9--;
            if (w9 == -1) {
                w9 = this.f47742i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f47750q + this.f47752s;
    }

    public final int w(int i10) {
        int i11 = this.f47751r + i10;
        int i12 = this.f47742i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w9 = w(this.f47752s);
                int i10 = this.f47752s;
                int i11 = this.f47749p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47747n[w9]) {
                    return 0;
                }
                if (j10 > this.f47755w && z10) {
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
        if (this.f47756x != -1) {
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
