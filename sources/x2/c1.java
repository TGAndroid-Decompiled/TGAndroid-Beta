package x2;

import a8.ma;
import a8.xa;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.cn0;
public class c1 implements f3.i0 {
    public boolean B;
    public e2.u C;
    public e2.u D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final cn0 f60060a;
    public final q2.m d;
    public final q2.j f60063e;
    public Object f60064f;
    public e2.u f60065g;
    public q2.g h;
    public int f60073p;
    public int f60074q;
    public int f60075r;
    public int f60076s;
    public boolean f60081y;
    public final m5.b f60061b = new Object();
    public int f60066i = 1000;
    public long[] f60067j = new long[1000];
    public long[] f60068k = new long[1000];
    public long[] f60071n = new long[1000];
    public int[] f60070m = new int[1000];
    public int[] f60069l = new int[1000];
    public f3.h0[] f60072o = new f3.h0[1000];
    public final xa f60062c = new xa(new z0(0));
    public long f60077t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f60079w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f60082z = true;
    public boolean F = true;
    public long f60078u = Long.MIN_VALUE;
    public int f60080x = -1;

    public c1(h6.m mVar, q2.m mVar2, q2.j jVar) {
        this.d = mVar2;
        this.f60063e = jVar;
        this.f60060a = new cn0(mVar);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        e2.u uVar;
        int v = v();
        int i7 = this.f60080x;
        boolean z12 = true;
        if (i7 != -1 && v >= i7) {
            return true;
        }
        if (this.f60076s != this.f60073p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f60081y && ((uVar = this.D) == null || uVar == this.f60065g)) {
                z12 = false;
            }
            return z12;
        } else if (((a1) this.f60062c.l(v)).f60041a != this.f60065g) {
            return true;
        } else {
            return B(w(this.f60076s));
        }
    }

    public final boolean B(int i7) {
        q2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f60070m[i7] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        q2.g gVar = this.h;
        if (gVar != null && gVar.e() == 1) {
            q2.f g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }

    public final void D(e2.u uVar, k8.a aVar) {
        boolean z10;
        e2.r rVar;
        e2.u uVar2;
        e2.u uVar3 = this.f60065g;
        if (uVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (uVar3 == null) {
            rVar = null;
        } else {
            rVar = uVar3.f10764w;
        }
        this.f60065g = uVar;
        e2.r rVar2 = uVar.f10764w;
        q2.m mVar = this.d;
        if (mVar != null) {
            int E1 = mVar.E1(uVar);
            e2.t a10 = uVar.a();
            a10.S = E1;
            uVar2 = new e2.u(a10);
        } else {
            uVar2 = uVar;
        }
        aVar.f18178c = uVar2;
        aVar.f18177b = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(rVar, rVar2)) {
                q2.g gVar = this.h;
                q2.j jVar = this.f60063e;
                q2.g r10 = mVar.r(jVar, uVar);
                this.h = r10;
                aVar.f18177b = r10;
                if (gVar != null) {
                    gVar.c(jVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z10;
        long j3;
        try {
            int w10 = w(this.f60076s);
            if (this.f60076s != this.f60073p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f60067j[w10];
            } else {
                j3 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j3;
    }

    public final int F(k8.a r12, k2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.c1.F(k8.a, k2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        cn0 cn0Var = this.f60060a;
        a4.c cVar = (a4.c) cn0Var.f34192e;
        if (((b3.a) cVar.f160c) != null) {
            h6.m mVar = (h6.m) cn0Var.f34191c;
            synchronized (mVar) {
                ((l2.h) mVar.d).f19387c.b(cVar);
                a4.c cVar2 = cVar;
                while (cVar2 != null) {
                    b3.a aVar = (b3.a) cVar2.f160c;
                    aVar.getClass();
                    mVar.H(aVar);
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((b3.a) cVar2.f160c) == null) {
                        cVar2 = null;
                    }
                }
            }
            cVar.f160c = null;
            cVar.d = null;
        }
        a4.c cVar3 = (a4.c) cn0Var.f34192e;
        int i7 = cn0Var.f34189a;
        if (((b3.a) cVar3.f160c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.p(z11);
        cVar3.f158a = 0L;
        cVar3.f159b = i7;
        a4.c cVar4 = (a4.c) cn0Var.f34192e;
        cn0Var.f34193f = cVar4;
        cn0Var.f34194g = cVar4;
        cn0Var.f34190b = 0L;
        ((h6.m) cn0Var.f34191c).J();
        this.f60073p = 0;
        this.f60074q = 0;
        this.f60075r = 0;
        this.f60076s = 0;
        this.f60080x = -1;
        this.f60082z = true;
        this.f60077t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f60079w = Long.MIN_VALUE;
        this.f60081y = false;
        xa xaVar = this.f60062c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((z0) xaVar.d).accept(sparseArray.valueAt(i10));
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
        this.f60076s = 0;
        cn0 cn0Var = this.f60060a;
        cn0Var.f34193f = (a4.c) cn0Var.f34192e;
    }

    public final synchronized boolean I(int i7) {
        H();
        int i10 = this.f60074q;
        if (i7 >= i10 && i7 <= this.f60073p + i10) {
            int i11 = this.f60080x;
            if (i11 != -1 && i7 >= i11) {
                return false;
            }
            this.f60077t = Long.MIN_VALUE;
            this.f60076s = i7 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j3, boolean z10) {
        Throwable th2;
        long min;
        boolean z11;
        c1 c1Var;
        long j10;
        int q10;
        try {
            try {
                H();
                int w10 = w(this.f60076s);
                long j11 = this.f60078u;
                if (j11 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f60079w, j11);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f60079w;
                }
                int i7 = this.f60076s;
                int i10 = this.f60073p;
                if (i7 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f60071n[w10] || (j3 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i7, j3, z10);
                    c1Var = this;
                    j10 = j3;
                } else {
                    int i11 = i10 - i7;
                    c1Var = this;
                    j10 = j3;
                    q10 = c1Var.q(w10, i11, j10, true);
                }
                if (q10 == -1) {
                    return false;
                }
                c1Var.f60077t = j10;
                c1Var.f60076s += q10;
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
        c1 c1Var;
        long j10;
        int i7;
        try {
            try {
                if (j3 == this.f60078u) {
                    return;
                }
                int i10 = -1;
                if (j3 == Long.MIN_VALUE) {
                    try {
                        this.f60080x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j3 <= this.f60079w) {
                    c1Var = this;
                    j10 = j3;
                    i7 = c1Var.p(this.f60075r, this.f60073p, j10, false);
                } else {
                    c1Var = this;
                    j10 = j3;
                    i7 = -1;
                }
                if (i7 != -1) {
                    i10 = c1Var.f60074q + i7;
                }
                c1Var.f60080x = i10;
                c1Var.f60078u = j10;
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
                if (this.f60076s + i7 <= this.f60073p) {
                    z10 = true;
                    ma.f(z10);
                    this.f60076s += i7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        ma.f(z10);
        this.f60076s += i7;
    }

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        while (true) {
            cn0 cn0Var = this.f60060a;
            if (i7 > 0) {
                int c10 = cn0Var.c(i7);
                a4.c cVar = (a4.c) cn0Var.f34194g;
                b3.a aVar = (b3.a) cVar.f160c;
                xVar.k(((int) (cn0Var.f34190b - cVar.f158a)) + aVar.f2833b, c10, aVar.f2832a);
                i7 -= c10;
                long j3 = cn0Var.f34190b + c10;
                cn0Var.f34190b = j3;
                a4.c cVar2 = (a4.c) cn0Var.f34194g;
                if (j3 == cVar2.f159b) {
                    cn0Var.f34194g = (a4.c) cVar2.d;
                }
            } else {
                cn0Var.getClass();
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
        throw new UnsupportedOperationException("Method not decompiled: x2.c1.c(long, int, int, int, f3.h0):void");
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        cn0 cn0Var = this.f60060a;
        int c10 = cn0Var.c(i7);
        a4.c cVar = (a4.c) cn0Var.f34194g;
        b3.a aVar = (b3.a) cVar.f160c;
        int read = nVar.read(aVar.f2832a, ((int) (cn0Var.f34190b - cVar.f158a)) + aVar.f2833b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = cn0Var.f34190b + read;
        cn0Var.f34190b = j3;
        a4.c cVar2 = (a4.c) cn0Var.f34194g;
        if (j3 == cVar2.f159b) {
            cn0Var.f34194g = (a4.c) cVar2.d;
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
                    if (((SparseArray) this.f60062c.f714c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f60062c.f714c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).f60041a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f60062c.f714c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).f60041a;
                            boolean z13 = this.F;
                            e2.u uVar2 = this.D;
                            str = uVar2.f10761s;
                            String str2 = uVar2.f10753k;
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
                    str = uVar22.f10761s;
                    String str22 = uVar22.f10753k;
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
        ?? r62 = this.f60064f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, f3.h0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.c1.h(long, int, long, int, f3.h0):void");
    }

    public final int i(long j3) {
        int i7 = this.f60073p;
        int w10 = w(i7 - 1);
        while (i7 > this.f60076s && this.f60071n[w10] >= j3) {
            i7--;
            w10--;
            if (w10 == -1) {
                w10 = this.f60066i - 1;
            }
        }
        return i7;
    }

    public final long j(int i7) {
        int i10;
        this.v = Math.max(this.v, u(i7));
        this.f60073p -= i7;
        int i11 = this.f60074q + i7;
        this.f60074q = i11;
        int i12 = this.f60075r + i7;
        this.f60075r = i12;
        int i13 = this.f60066i;
        if (i12 >= i13) {
            this.f60075r = i12 - i13;
        }
        int i14 = this.f60076s - i7;
        this.f60076s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f60076s = 0;
        }
        xa xaVar = this.f60062c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((z0) xaVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = xaVar.f713b;
            if (i17 > 0) {
                xaVar.f713b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f60073p == 0) {
            int i18 = this.f60075r;
            if (i18 == 0) {
                i18 = this.f60066i;
            }
            return this.f60068k[i18 - 1] + this.f60069l[i10];
        }
        return this.f60068k[this.f60075r];
    }

    public final void k(long j3, boolean z10) {
        Throwable th2;
        cn0 cn0Var = this.f60060a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.f60073p;
                    long j10 = -1;
                    if (i7 != 0) {
                        long[] jArr = this.f60071n;
                        int i10 = this.f60075r;
                        if (j3 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.f60076s;
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
                            cn0Var.b(j10);
                        }
                    }
                    cn0Var.b(j10);
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
        cn0 cn0Var = this.f60060a;
        synchronized (this) {
            int i7 = this.f60073p;
            if (i7 == 0) {
                j3 = -1;
            } else {
                j3 = j(i7);
            }
        }
        cn0Var.b(j3);
    }

    public final void m(long j3) {
        boolean z10;
        if (this.f60073p == 0) {
            return;
        }
        if (j3 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        o(this.f60074q + i(j3));
    }

    public final long n(int i7) {
        boolean z10;
        int w10;
        int i10 = this.f60074q;
        int i11 = this.f60073p;
        int i12 = (i10 + i11) - i7;
        boolean z11 = false;
        if (i12 >= 0 && i12 <= i11 - this.f60076s) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int i13 = this.f60073p - i12;
        this.f60073p = i13;
        this.f60079w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.f60081y) {
            z11 = true;
        }
        this.f60081y = z11;
        int i14 = this.f60080x;
        int i15 = -1;
        if (i14 != -1 && i7 < i14) {
            this.f60080x = -1;
        }
        xa xaVar = this.f60062c;
        SparseArray sparseArray = (SparseArray) xaVar.f714c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((z0) xaVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i15 = Math.min(xaVar.f713b, sparseArray.size() - 1);
        }
        xaVar.f713b = i15;
        int i16 = this.f60073p;
        if (i16 != 0) {
            return this.f60068k[w(i16 - 1)] + this.f60069l[w10];
        }
        return 0L;
    }

    public final void o(int i7) {
        boolean z10;
        cn0 cn0Var = this.f60060a;
        long n10 = n(i7);
        int i10 = cn0Var.f34189a;
        if (n10 <= cn0Var.f34190b) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        cn0Var.f34190b = n10;
        if (n10 != 0) {
            a4.c cVar = (a4.c) cn0Var.f34192e;
            if (n10 != cVar.f158a) {
                while (cn0Var.f34190b > cVar.f159b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                if (((b3.a) cVar2.f160c) != null) {
                    h6.m mVar = (h6.m) cn0Var.f34191c;
                    synchronized (mVar) {
                        ((l2.h) mVar.d).f19387c.b(cVar2);
                        a4.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            b3.a aVar = (b3.a) cVar3.f160c;
                            aVar.getClass();
                            mVar.H(aVar);
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
                if (cn0Var.f34190b == cVar.f159b) {
                    cVar = cVar4;
                }
                cn0Var.f34194g = cVar;
                if (((a4.c) cn0Var.f34193f) == cVar2) {
                    cn0Var.f34193f = cVar4;
                    return;
                }
                return;
            }
        }
        cn0Var.a((a4.c) cn0Var.f34192e);
        a4.c cVar5 = new a4.c(cn0Var.f34190b, i10);
        cn0Var.f34192e = cVar5;
        cn0Var.f34193f = cVar5;
        cn0Var.f34194g = cVar5;
    }

    public final int p(int i7, int i10, long j3, boolean z10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f60071n[i7] >= j3) {
                return i11;
            }
            i7++;
            if (i7 == this.f60066i) {
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
            int i13 = (this.f60071n[i7] > j3 ? 1 : (this.f60071n[i7] == j3 ? 0 : -1));
            if (i13 > 0) {
                break;
            }
            if (!z10 || (this.f60070m[i7] & 1) != 0) {
                if (i13 == 0) {
                    return i12;
                }
                i11 = i12;
            }
            i7++;
            if (i7 == this.f60066i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public e2.u r(e2.u uVar) {
        if (this.H != 0 && uVar.f10765x != Long.MAX_VALUE) {
            e2.t a10 = uVar.a();
            a10.f10713w = uVar.f10765x + this.H;
            return new e2.u(a10);
        }
        return uVar;
    }

    public final synchronized long s() {
        return this.f60079w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f60076s));
    }

    public final long u(int i7) {
        long j3 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = Math.max(j3, this.f60071n[w10]);
            if ((this.f60070m[w10] & 1) != 0) {
                return j3;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.f60066i - 1;
            }
        }
        return j3;
    }

    public final int v() {
        return this.f60074q + this.f60076s;
    }

    public final int w(int i7) {
        int i10 = this.f60075r + i7;
        int i11 = this.f60066i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int x(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int w10 = w(this.f60076s);
                int i7 = this.f60076s;
                int i10 = this.f60073p;
                if (i7 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f60071n[w10]) {
                    return 0;
                }
                if (j3 > this.f60079w && z10) {
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
        if (this.f60080x != -1) {
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
