package x2;

import a8.ja;
import a8.xa;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.sm0;
public class a1 implements f3.i0 {
    public boolean B;
    public e2.u C;
    public e2.u D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final sm0 f59473a;
    public final q2.n d;
    public final q2.k f59476e;
    public Object f59477f;
    public e2.u f59478g;
    public q2.h h;
    public int f59486p;
    public int f59487q;
    public int f59488r;
    public int f59489s;
    public boolean f59494y;
    public final m5.b f59474b = new Object();
    public int f59479i = 1000;
    public long[] f59480j = new long[1000];
    public long[] f59481k = new long[1000];
    public long[] f59484n = new long[1000];
    public int[] f59483m = new int[1000];
    public int[] f59482l = new int[1000];
    public f3.h0[] f59485o = new f3.h0[1000];
    public final xa f59475c = new xa(new ug.x(29));
    public long f59490t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f59492w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f59495z = true;
    public boolean F = true;
    public long f59491u = Long.MIN_VALUE;
    public int f59493x = -1;

    public a1(h6.m mVar, q2.n nVar, q2.k kVar) {
        this.d = nVar;
        this.f59476e = kVar;
        this.f59473a = new sm0(mVar);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        e2.u uVar;
        int v = v();
        int i7 = this.f59493x;
        boolean z12 = true;
        if (i7 != -1 && v >= i7) {
            return true;
        }
        if (this.f59489s != this.f59486p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f59494y && ((uVar = this.D) == null || uVar == this.f59478g)) {
                z12 = false;
            }
            return z12;
        } else if (((y0) this.f59475c.k(v)).f59726a != this.f59478g) {
            return true;
        } else {
            return B(w(this.f59489s));
        }
    }

    public final boolean B(int i7) {
        q2.h hVar = this.h;
        if (hVar != null && hVar.e() != 4) {
            if ((this.f59483m[i7] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        q2.h hVar = this.h;
        if (hVar != null && hVar.e() == 1) {
            q2.g g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void D(e2.u uVar, k8.a aVar) {
        boolean z10;
        e2.r rVar;
        e2.u uVar2;
        e2.u uVar3 = this.f59478g;
        if (uVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uVar3 == null) {
            rVar = null;
        } else {
            rVar = uVar3.f10454w;
        }
        this.f59478g = uVar;
        e2.r rVar2 = uVar.f10454w;
        q2.n nVar = this.d;
        if (nVar != null) {
            int E1 = nVar.E1(uVar);
            e2.t a10 = uVar.a();
            a10.S = E1;
            uVar2 = new e2.u(a10);
        } else {
            uVar2 = uVar;
        }
        aVar.f17789c = uVar2;
        aVar.f17788b = this.h;
        if (nVar != null) {
            if (z10 || !Objects.equals(rVar, rVar2)) {
                q2.h hVar = this.h;
                q2.k kVar = this.f59476e;
                q2.h A = nVar.A(kVar, uVar);
                this.h = A;
                aVar.f17788b = A;
                if (hVar != null) {
                    hVar.c(kVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z10;
        long j3;
        try {
            int w10 = w(this.f59489s);
            if (this.f59489s != this.f59486p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f59480j[w10];
            } else {
                j3 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j3;
    }

    public final int F(k8.a r12, k2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.a1.F(k8.a, k2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        sm0 sm0Var = this.f59473a;
        a4.c cVar = (a4.c) sm0Var.f39343e;
        if (((b3.a) cVar.f160c) != null) {
            h6.m mVar = (h6.m) sm0Var.f39342c;
            synchronized (mVar) {
                ((l2.h) mVar.d).f19026c.b(cVar);
                a4.c cVar2 = cVar;
                while (cVar2 != null) {
                    b3.a aVar = (b3.a) cVar2.f160c;
                    aVar.getClass();
                    mVar.E(aVar);
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((b3.a) cVar2.f160c) == null) {
                        cVar2 = null;
                    }
                }
            }
            cVar.f160c = null;
            cVar.d = null;
        }
        a4.c cVar3 = (a4.c) sm0Var.f39343e;
        int i7 = sm0Var.f39340a;
        if (((b3.a) cVar3.f160c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.p(z11);
        cVar3.f158a = 0L;
        cVar3.f159b = i7;
        a4.c cVar4 = (a4.c) sm0Var.f39343e;
        sm0Var.f39344f = cVar4;
        sm0Var.f39345g = cVar4;
        sm0Var.f39341b = 0L;
        ((h6.m) sm0Var.f39342c).G();
        this.f59486p = 0;
        this.f59487q = 0;
        this.f59488r = 0;
        this.f59489s = 0;
        this.f59493x = -1;
        this.f59495z = true;
        this.f59490t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f59492w = Long.MIN_VALUE;
        this.f59494y = false;
        xa xaVar = this.f59475c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((ug.x) xaVar.d).accept(sparseArray.valueAt(i10));
        }
        xaVar.f713b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f59489s = 0;
        sm0 sm0Var = this.f59473a;
        sm0Var.f39344f = (a4.c) sm0Var.f39343e;
    }

    public final synchronized boolean I(int i7) {
        H();
        int i10 = this.f59487q;
        if (i7 >= i10 && i7 <= this.f59486p + i10) {
            int i11 = this.f59493x;
            if (i11 != -1 && i7 >= i11) {
                return false;
            }
            this.f59490t = Long.MIN_VALUE;
            this.f59489s = i7 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j3, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        a1 a1Var;
        long j10;
        int q10;
        try {
            try {
                H();
                int w10 = w(this.f59489s);
                long j11 = this.f59491u;
                if (j11 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f59492w, j11);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f59492w;
                }
                int i7 = this.f59489s;
                int i10 = this.f59486p;
                if (i7 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f59484n[w10] || (j3 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i7, j3, z10);
                    a1Var = this;
                    j10 = j3;
                } else {
                    int i11 = i10 - i7;
                    a1Var = this;
                    j10 = j3;
                    q10 = a1Var.q(w10, i11, j10, true);
                }
                if (q10 == -1) {
                    return false;
                }
                a1Var.f59490t = j10;
                a1Var.f59489s += q10;
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

    public final synchronized void K(long j3) {
        Throwable th2;
        a1 a1Var;
        long j10;
        int i7;
        try {
            try {
                if (j3 == this.f59491u) {
                    return;
                }
                int i10 = -1;
                if (j3 == Long.MIN_VALUE) {
                    try {
                        this.f59493x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j3 <= this.f59492w) {
                    a1Var = this;
                    j10 = j3;
                    i7 = a1Var.p(this.f59488r, this.f59486p, j10, false);
                } else {
                    a1Var = this;
                    j10 = j3;
                    i7 = -1;
                }
                if (i7 != -1) {
                    i10 = a1Var.f59487q + i7;
                }
                a1Var.f59493x = i10;
                a1Var.f59491u = j10;
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

    public final synchronized void L(int i7) {
        boolean z10;
        if (i7 >= 0) {
            try {
                if (this.f59489s + i7 <= this.f59486p) {
                    z10 = true;
                    ja.f(z10);
                    this.f59489s += i7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        ja.f(z10);
        this.f59489s += i7;
    }

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        while (true) {
            sm0 sm0Var = this.f59473a;
            if (i7 > 0) {
                int c10 = sm0Var.c(i7);
                a4.c cVar = (a4.c) sm0Var.f39345g;
                b3.a aVar = (b3.a) cVar.f160c;
                xVar.k(((int) (sm0Var.f39341b - cVar.f158a)) + aVar.f2868b, c10, aVar.f2867a);
                i7 -= c10;
                long j3 = sm0Var.f39341b + c10;
                sm0Var.f39341b = j3;
                a4.c cVar2 = (a4.c) sm0Var.f39345g;
                if (j3 == cVar2.f159b) {
                    sm0Var.f39345g = (a4.c) cVar2.d;
                }
            } else {
                sm0Var.getClass();
                return;
            }
        }
    }

    @Override
    public final void b(int i7, h2.x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, f3.h0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: x2.a1.c(long, int, int, int, f3.h0):void");
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        sm0 sm0Var = this.f59473a;
        int c10 = sm0Var.c(i7);
        a4.c cVar = (a4.c) sm0Var.f39345g;
        b3.a aVar = (b3.a) cVar.f160c;
        int read = nVar.read(aVar.f2867a, ((int) (sm0Var.f39341b - cVar.f158a)) + aVar.f2868b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = sm0Var.f39341b + read;
        sm0Var.f39341b = j3;
        a4.c cVar2 = (a4.c) sm0Var.f39345g;
        if (j3 == cVar2.f159b) {
            sm0Var.f39345g = (a4.c) cVar2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.u uVar) {
        boolean z10;
        String str;
        boolean z11;
        e2.u r10 = r(uVar);
        boolean z12 = false;
        this.B = false;
        this.C = uVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (((SparseArray) this.f59475c.f714c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f59475c.f714c;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).f59726a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f59475c.f714c;
                            this.D = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f59726a;
                            boolean z13 = this.F;
                            e2.u uVar2 = this.D;
                            str = uVar2.f10451s;
                            String str2 = uVar2.f10443k;
                            if (e2.s0.h(str) != 1 && e2.s0.a(str, str2)) {
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
                    e2.u uVar22 = this.D;
                    str = uVar22.f10451s;
                    String str22 = uVar22.f10443k;
                    if (e2.s0.h(str) != 1) {
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
        ?? r62 = this.f59477f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, f3.h0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.a1.h(long, int, long, int, f3.h0):void");
    }

    public final int i(long j3) {
        int i7 = this.f59486p;
        int w10 = w(i7 - 1);
        while (i7 > this.f59489s && this.f59484n[w10] >= j3) {
            i7--;
            w10--;
            if (w10 == -1) {
                w10 = this.f59479i - 1;
            }
        }
        return i7;
    }

    public final long j(int i7) {
        int i10;
        this.v = Math.max(this.v, u(i7));
        this.f59486p -= i7;
        int i11 = this.f59487q + i7;
        this.f59487q = i11;
        int i12 = this.f59488r + i7;
        this.f59488r = i12;
        int i13 = this.f59479i;
        if (i12 >= i13) {
            this.f59488r = i12 - i13;
        }
        int i14 = this.f59489s - i7;
        this.f59489s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f59489s = 0;
        }
        xa xaVar = this.f59475c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((ug.x) xaVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = xaVar.f713b;
            if (i17 > 0) {
                xaVar.f713b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f59486p == 0) {
            int i18 = this.f59488r;
            if (i18 == 0) {
                i18 = this.f59479i;
            }
            return this.f59481k[i18 - 1] + this.f59482l[i10];
        }
        return this.f59481k[this.f59488r];
    }

    public final void k(long j3, boolean z10) {
        Throwable th2;
        sm0 sm0Var = this.f59473a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.f59486p;
                    long j10 = -1;
                    if (i7 != 0) {
                        long[] jArr = this.f59484n;
                        int i10 = this.f59488r;
                        if (j3 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.f59489s;
                                    if (i11 != i7) {
                                        i7 = i11 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q10 = q(i10, i7, j3, false);
                            if (q10 != -1) {
                                j10 = j(q10);
                            }
                            sm0Var.b(j10);
                        }
                    }
                    sm0Var.b(j10);
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
        long j3;
        sm0 sm0Var = this.f59473a;
        synchronized (this) {
            int i7 = this.f59486p;
            if (i7 == 0) {
                j3 = -1;
            } else {
                j3 = j(i7);
            }
        }
        sm0Var.b(j3);
    }

    public final void m(long j3) {
        boolean z10;
        if (this.f59486p == 0) {
            return;
        }
        if (j3 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        o(this.f59487q + i(j3));
    }

    public final long n(int i7) {
        boolean z10;
        int w10;
        int i10 = this.f59487q;
        int i11 = this.f59486p;
        int i12 = (i10 + i11) - i7;
        boolean z11 = false;
        if (i12 >= 0 && i12 <= i11 - this.f59489s) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        int i13 = this.f59486p - i12;
        this.f59486p = i13;
        this.f59492w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.f59494y) {
            z11 = true;
        }
        this.f59494y = z11;
        int i14 = this.f59493x;
        int i15 = -1;
        if (i14 != -1 && i7 < i14) {
            this.f59493x = -1;
        }
        xa xaVar = this.f59475c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((ug.x) xaVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i15 = Math.min(xaVar.f713b, sparseArray.size() - 1);
        }
        xaVar.f713b = i15;
        int i16 = this.f59486p;
        if (i16 != 0) {
            return this.f59481k[w(i16 - 1)] + this.f59482l[w10];
        }
        return 0L;
    }

    public final void o(int i7) {
        boolean z10;
        sm0 sm0Var = this.f59473a;
        long n10 = n(i7);
        int i10 = sm0Var.f39340a;
        if (n10 <= sm0Var.f39341b) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        sm0Var.f39341b = n10;
        if (n10 != 0) {
            a4.c cVar = (a4.c) sm0Var.f39343e;
            if (n10 != cVar.f158a) {
                while (sm0Var.f39341b > cVar.f159b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                if (((b3.a) cVar2.f160c) != null) {
                    h6.m mVar = (h6.m) sm0Var.f39342c;
                    synchronized (mVar) {
                        ((l2.h) mVar.d).f19026c.b(cVar2);
                        a4.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            b3.a aVar = (b3.a) cVar3.f160c;
                            aVar.getClass();
                            mVar.E(aVar);
                            cVar3 = (a4.c) cVar3.d;
                            if (cVar3 == null || ((b3.a) cVar3.f160c) == null) {
                                cVar3 = null;
                            }
                        }
                    }
                    cVar2.f160c = null;
                    cVar2.d = null;
                }
                a4.c cVar4 = new a4.c(cVar.f159b, i10);
                cVar.d = cVar4;
                if (sm0Var.f39341b == cVar.f159b) {
                    cVar = cVar4;
                }
                sm0Var.f39345g = cVar;
                if (((a4.c) sm0Var.f39344f) == cVar2) {
                    sm0Var.f39344f = cVar4;
                    return;
                }
                return;
            }
        }
        sm0Var.a((a4.c) sm0Var.f39343e);
        a4.c cVar5 = new a4.c(sm0Var.f39341b, i10);
        sm0Var.f39343e = cVar5;
        sm0Var.f39344f = cVar5;
        sm0Var.f39345g = cVar5;
    }

    public final int p(int i7, int i10, long j3, boolean z10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f59484n[i7] >= j3) {
                return i11;
            }
            i7++;
            if (i7 == this.f59479i) {
                i7 = 0;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    public final int q(int i7, int i10, long j3, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = (this.f59484n[i7] > j3 ? 1 : (this.f59484n[i7] == j3 ? 0 : -1));
            if (i13 > 0) {
                break;
            }
            if (!z10 || (this.f59483m[i7] & 1) != 0) {
                if (i13 == 0) {
                    return i12;
                }
                i11 = i12;
            }
            i7++;
            if (i7 == this.f59479i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public e2.u r(e2.u uVar) {
        if (this.H != 0 && uVar.f10455x != Long.MAX_VALUE) {
            e2.t a10 = uVar.a();
            a10.f10403w = uVar.f10455x + this.H;
            return new e2.u(a10);
        }
        return uVar;
    }

    public final synchronized long s() {
        return this.f59492w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f59489s));
    }

    public final long u(int i7) {
        long j3 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = Math.max(j3, this.f59484n[w10]);
            if ((this.f59483m[w10] & 1) != 0) {
                return j3;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.f59479i - 1;
            }
        }
        return j3;
    }

    public final int v() {
        return this.f59487q + this.f59489s;
    }

    public final int w(int i7) {
        int i10 = this.f59488r + i7;
        int i11 = this.f59479i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int x(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int w10 = w(this.f59489s);
                int i7 = this.f59489s;
                int i10 = this.f59486p;
                if (i7 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f59484n[w10]) {
                    return 0;
                }
                if (j3 > this.f59492w && z10) {
                    return i10 - i7;
                }
                int q10 = q(w10, i10 - i7, j3, true);
                if (q10 == -1) {
                    return 0;
                }
                return q10;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized e2.u y() {
        e2.u uVar;
        if (this.A) {
            uVar = null;
        } else {
            uVar = this.D;
        }
        return uVar;
    }

    public final synchronized boolean z() {
        boolean z10;
        if (this.f59493x != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override
    public final void d(long j3) {
    }
}
