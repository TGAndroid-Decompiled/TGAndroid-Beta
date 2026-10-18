package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.ep0;
import v7.u6;
public class b1 implements c3.j0 {
    public boolean B;
    public b2.w C;
    public b2.w D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final ep0 f47309a;
    public final n2.n d;
    public final n2.k e;
    public Object f47312f;
    public b2.w f47313g;
    public n2.h h;
    public int f47321p;
    public int f47322q;
    public int f47323r;
    public int f47324s;
    public boolean f47329y;
    public final j5.c f47310b = new Object();
    public int f47314i = 1000;
    public long[] f47315j = new long[1000];
    public long[] f47316k = new long[1000];
    public long[] f47319n = new long[1000];
    public int[] f47318m = new int[1000];
    public int[] f47317l = new int[1000];
    public c3.i0[] f47320o = new c3.i0[1000];
    public final a5.a f47311c = new a5.a(new si.a(8));
    public long f47325t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f47327w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f47330z = true;
    public boolean F = true;
    public long f47326u = Long.MIN_VALUE;
    public int f47328x = -1;

    public b1(androidx.biometric.e eVar, n2.n nVar, n2.k kVar) {
        this.d = nVar;
        this.e = kVar;
        this.f47309a = new ep0(eVar);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        b2.w wVar;
        int v = v();
        int i10 = this.f47328x;
        boolean z12 = true;
        if (i10 != -1 && v >= i10) {
            return true;
        }
        if (this.f47324s != this.f47321p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f47329y && ((wVar = this.D) == null || wVar == this.f47313g)) {
                z12 = false;
            }
            return z12;
        } else if (((z0) this.f47311c.o(v)).f47540a != this.f47313g) {
            return true;
        } else {
            return B(w(this.f47324s));
        }
    }

    public final boolean B(int i10) {
        n2.h hVar = this.h;
        if (hVar != null && hVar.e() != 4) {
            if ((this.f47318m[i10] & 1073741824) != 0 || !this.h.d()) {
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
        b2.w wVar3 = this.f47313g;
        if (wVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (wVar3 == null) {
            sVar = null;
        } else {
            sVar = wVar3.f4135w;
        }
        this.f47313g = wVar;
        b2.s sVar2 = wVar.f4135w;
        n2.n nVar = this.d;
        if (nVar != null) {
            int I0 = nVar.I0(wVar);
            b2.v a2 = wVar.a();
            a2.S = I0;
            wVar2 = new b2.w(a2);
        } else {
            wVar2 = wVar;
        }
        bVar.f44486c = wVar2;
        bVar.f44485b = this.h;
        if (nVar != null) {
            if (z10 || !Objects.equals(sVar, sVar2)) {
                n2.h hVar = this.h;
                n2.k kVar = this.e;
                n2.h U0 = nVar.U0(kVar, wVar);
                this.h = U0;
                bVar.f44485b = U0;
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
            int w9 = w(this.f47324s);
            if (this.f47324s != this.f47321p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f47315j[w9];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(qf.b r12, h2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.F(qf.b, h2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        ep0 ep0Var = this.f47309a;
        y0 y0Var = (y0) ep0Var.e;
        if (((y2.a) y0Var.f47539c) != null) {
            androidx.biometric.e eVar = (androidx.biometric.e) ep0Var.f25981c;
            synchronized (eVar) {
                ((i2.i) eVar.d).f12433c.b(y0Var);
                y0 y0Var2 = y0Var;
                while (y0Var2 != null) {
                    y2.a aVar = (y2.a) y0Var2.f47539c;
                    aVar.getClass();
                    eVar.u(aVar);
                    y0Var2 = (y0) y0Var2.d;
                    if (y0Var2 == null || ((y2.a) y0Var2.f47539c) == null) {
                        y0Var2 = null;
                    }
                }
            }
            y0Var.f47539c = null;
            y0Var.d = null;
        }
        y0 y0Var3 = (y0) ep0Var.e;
        int i10 = ep0Var.f25979a;
        if (((y2.a) y0Var3.f47539c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.p(z11);
        y0Var3.f47537a = 0L;
        y0Var3.f47538b = i10;
        y0 y0Var4 = (y0) ep0Var.e;
        ep0Var.f25982f = y0Var4;
        ep0Var.f25983g = y0Var4;
        ep0Var.f25980b = 0L;
        ((androidx.biometric.e) ep0Var.f25981c).w();
        this.f47321p = 0;
        this.f47322q = 0;
        this.f47323r = 0;
        this.f47324s = 0;
        this.f47328x = -1;
        this.f47330z = true;
        this.f47325t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f47327w = Long.MIN_VALUE;
        this.f47329y = false;
        a5.a aVar2 = this.f47311c;
        SparseArray sparseArray = (SparseArray) aVar2.f281c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((si.a) aVar2.d).accept(sparseArray.valueAt(i11));
        }
        aVar2.f280b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f47324s = 0;
        ep0 ep0Var = this.f47309a;
        ep0Var.f25982f = (y0) ep0Var.e;
    }

    public final synchronized boolean I(int i10) {
        H();
        int i11 = this.f47322q;
        if (i10 >= i11 && i10 <= this.f47321p + i11) {
            int i12 = this.f47328x;
            if (i12 != -1 && i10 >= i12) {
                return false;
            }
            this.f47325t = Long.MIN_VALUE;
            this.f47324s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j10, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        b1 b1Var;
        long j11;
        int q6;
        try {
            try {
                H();
                int w9 = w(this.f47324s);
                long j12 = this.f47326u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f47327w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f47327w;
                }
                int i10 = this.f47324s;
                int i11 = this.f47321p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47319n[w9] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q6 = p(j10, w9, i11 - i10, z10);
                    b1Var = this;
                    j11 = j10;
                } else {
                    int i12 = i11 - i10;
                    b1Var = this;
                    j11 = j10;
                    q6 = b1Var.q(j11, w9, i12, true);
                }
                if (q6 == -1) {
                    return false;
                }
                b1Var.f47325t = j11;
                b1Var.f47324s += q6;
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
        b1 b1Var;
        long j11;
        int i10;
        try {
            try {
                if (j10 == this.f47326u) {
                    return;
                }
                int i11 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f47328x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f47327w) {
                    b1Var = this;
                    j11 = j10;
                    i10 = b1Var.p(j11, this.f47323r, this.f47321p, false);
                } else {
                    b1Var = this;
                    j11 = j10;
                    i10 = -1;
                }
                if (i10 != -1) {
                    i11 = b1Var.f47322q + i10;
                }
                b1Var.f47328x = i11;
                b1Var.f47326u = j11;
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
                if (this.f47324s + i10 <= this.f47321p) {
                    z10 = true;
                    u6.g(z10);
                    this.f47324s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        u6.g(z10);
        this.f47324s += i10;
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
                    if (((SparseArray) this.f47311c.f281c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f47311c.f281c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).f47540a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f47311c.f281c;
                            this.D = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f47540a;
                            boolean z13 = this.F;
                            b2.w wVar2 = this.D;
                            str = wVar2.f4132s;
                            String str2 = wVar2.f4124k;
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
                    str = wVar22.f4132s;
                    String str22 = wVar22.f4124k;
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
        ?? r62 = this.f47312f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.i0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.c(long, int, int, int, c3.i0):void");
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        ep0 ep0Var = this.f47309a;
        int c10 = ep0Var.c(i10);
        y0 y0Var = (y0) ep0Var.f25983g;
        y2.a aVar = (y2.a) y0Var.f47539c;
        int read = oVar.read(aVar.f49936a, ((int) (ep0Var.f25980b - y0Var.f47537a)) + aVar.f49937b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = ep0Var.f25980b + read;
        ep0Var.f25980b = j10;
        y0 y0Var2 = (y0) ep0Var.f25983g;
        if (j10 == y0Var2.f47538b) {
            ep0Var.f25983g = (y0) y0Var2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        while (true) {
            ep0 ep0Var = this.f47309a;
            if (i10 > 0) {
                int c10 = ep0Var.c(i10);
                y0 y0Var = (y0) ep0Var.f25983g;
                y2.a aVar = (y2.a) y0Var.f47539c;
                xVar.k(((int) (ep0Var.f25980b - y0Var.f47537a)) + aVar.f49937b, c10, aVar.f49936a);
                i10 -= c10;
                long j10 = ep0Var.f25980b + c10;
                ep0Var.f25980b = j10;
                y0 y0Var2 = (y0) ep0Var.f25983g;
                if (j10 == y0Var2.f47538b) {
                    ep0Var.f25983g = (y0) y0Var2.d;
                }
            } else {
                ep0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, c3.i0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.h(long, int, long, int, c3.i0):void");
    }

    public final int i(long j10) {
        int i10 = this.f47321p;
        int w9 = w(i10 - 1);
        while (i10 > this.f47324s && this.f47319n[w9] >= j10) {
            i10--;
            w9--;
            if (w9 == -1) {
                w9 = this.f47314i - 1;
            }
        }
        return i10;
    }

    public final long j(int i10) {
        int i11;
        this.v = Math.max(this.v, u(i10));
        this.f47321p -= i10;
        int i12 = this.f47322q + i10;
        this.f47322q = i12;
        int i13 = this.f47323r + i10;
        this.f47323r = i13;
        int i14 = this.f47314i;
        if (i13 >= i14) {
            this.f47323r = i13 - i14;
        }
        int i15 = this.f47324s - i10;
        this.f47324s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f47324s = 0;
        }
        a5.a aVar = this.f47311c;
        SparseArray sparseArray = (SparseArray) aVar.f281c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((si.a) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f280b;
            if (i18 > 0) {
                aVar.f280b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f47321p == 0) {
            int i19 = this.f47323r;
            if (i19 == 0) {
                i19 = this.f47314i;
            }
            return this.f47316k[i19 - 1] + this.f47317l[i11];
        }
        return this.f47316k[this.f47323r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        ep0 ep0Var = this.f47309a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f47321p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f47319n;
                        int i11 = this.f47323r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f47324s;
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
                            ep0Var.b(j11);
                        }
                    }
                    ep0Var.b(j11);
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
        ep0 ep0Var = this.f47309a;
        synchronized (this) {
            int i10 = this.f47321p;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = j(i10);
            }
        }
        ep0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f47321p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        o(this.f47322q + i(j10));
    }

    public final long n(int i10) {
        boolean z10;
        int w9;
        int i11 = this.f47322q;
        int i12 = this.f47321p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f47324s) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int i14 = this.f47321p - i13;
        this.f47321p = i14;
        this.f47327w = Math.max(this.v, u(i14));
        if (i13 == 0 && this.f47329y) {
            z11 = true;
        }
        this.f47329y = z11;
        int i15 = this.f47328x;
        int i16 = -1;
        if (i15 != -1 && i10 < i15) {
            this.f47328x = -1;
        }
        a5.a aVar = this.f47311c;
        SparseArray sparseArray = (SparseArray) aVar.f281c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((si.a) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i16 = Math.min(aVar.f280b, sparseArray.size() - 1);
        }
        aVar.f280b = i16;
        int i17 = this.f47321p;
        if (i17 != 0) {
            return this.f47316k[w(i17 - 1)] + this.f47317l[w9];
        }
        return 0L;
    }

    public final void o(int i10) {
        boolean z10;
        ep0 ep0Var = this.f47309a;
        long n10 = n(i10);
        int i11 = ep0Var.f25979a;
        if (n10 <= ep0Var.f25980b) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        ep0Var.f25980b = n10;
        if (n10 != 0) {
            y0 y0Var = (y0) ep0Var.e;
            if (n10 != y0Var.f47537a) {
                while (ep0Var.f25980b > y0Var.f47538b) {
                    y0Var = (y0) y0Var.d;
                }
                y0 y0Var2 = (y0) y0Var.d;
                y0Var2.getClass();
                if (((y2.a) y0Var2.f47539c) != null) {
                    androidx.biometric.e eVar = (androidx.biometric.e) ep0Var.f25981c;
                    synchronized (eVar) {
                        ((i2.i) eVar.d).f12433c.b(y0Var2);
                        y0 y0Var3 = y0Var2;
                        while (y0Var3 != null) {
                            y2.a aVar = (y2.a) y0Var3.f47539c;
                            aVar.getClass();
                            eVar.u(aVar);
                            y0Var3 = (y0) y0Var3.d;
                            if (y0Var3 == null || ((y2.a) y0Var3.f47539c) == null) {
                                y0Var3 = null;
                            }
                        }
                    }
                    y0Var2.f47539c = null;
                    y0Var2.d = null;
                }
                y0 y0Var4 = new y0(y0Var.f47538b, i11);
                y0Var.d = y0Var4;
                if (ep0Var.f25980b == y0Var.f47538b) {
                    y0Var = y0Var4;
                }
                ep0Var.f25983g = y0Var;
                if (((y0) ep0Var.f25982f) == y0Var2) {
                    ep0Var.f25982f = y0Var4;
                    return;
                }
                return;
            }
        }
        ep0Var.a((y0) ep0Var.e);
        y0 y0Var5 = new y0(ep0Var.f25980b, i11);
        ep0Var.e = y0Var5;
        ep0Var.f25982f = y0Var5;
        ep0Var.f25983g = y0Var5;
    }

    public final int p(long j10, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f47319n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f47314i) {
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
            int i14 = (this.f47319n[i10] > j10 ? 1 : (this.f47319n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f47318m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47314i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.w r(b2.w wVar) {
        if (this.H != 0 && wVar.f4136x != Long.MAX_VALUE) {
            b2.v a2 = wVar.a();
            a2.f4083w = wVar.f4136x + this.H;
            return new b2.w(a2);
        }
        return wVar;
    }

    public final synchronized long s() {
        return this.f47327w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f47324s));
    }

    public final long u(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int w9 = w(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f47319n[w9]);
            if ((this.f47318m[w9] & 1) != 0) {
                return j10;
            }
            w9--;
            if (w9 == -1) {
                w9 = this.f47314i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f47322q + this.f47324s;
    }

    public final int w(int i10) {
        int i11 = this.f47323r + i10;
        int i12 = this.f47314i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w9 = w(this.f47324s);
                int i10 = this.f47324s;
                int i11 = this.f47321p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f47319n[w9]) {
                    return 0;
                }
                if (j10 > this.f47327w && z10) {
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
        if (this.f47328x != -1) {
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
