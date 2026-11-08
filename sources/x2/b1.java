package x2;

import a8.ia;
import a8.wa;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.om0;
public class b1 implements f3.j0 {
    public boolean B;
    public e2.u C;
    public e2.u D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final om0 f58279a;
    public final q2.m d;
    public final q2.j f58282e;
    public Object f58283f;
    public e2.u f58284g;
    public q2.g h;
    public int f58292p;
    public int f58293q;
    public int f58294r;
    public int f58295s;
    public boolean f58300y;
    public final li.z f58280b = new Object();
    public int f58285i = 1000;
    public long[] f58286j = new long[1000];
    public long[] f58287k = new long[1000];
    public long[] f58290n = new long[1000];
    public int[] f58289m = new int[1000];
    public int[] f58288l = new int[1000];
    public f3.i0[] f58291o = new f3.i0[1000];
    public final wa f58281c = new wa(new v0.j(24));
    public long f58296t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f58298w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f58301z = true;
    public boolean F = true;
    public long f58297u = Long.MIN_VALUE;
    public int f58299x = -1;

    public b1(h6.m mVar, q2.m mVar2, q2.j jVar) {
        this.d = mVar2;
        this.f58282e = jVar;
        this.f58279a = new om0(mVar);
    }

    public final synchronized boolean A(boolean z9) {
        boolean z10;
        e2.u uVar;
        int v = v();
        int i7 = this.f58299x;
        boolean z11 = true;
        if (i7 != -1 && v >= i7) {
            return true;
        }
        if (this.f58295s != this.f58292p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!z9 && !this.f58300y && ((uVar = this.D) == null || uVar == this.f58284g)) {
                z11 = false;
            }
            return z11;
        } else if (((z0) this.f58281c.l(v)).f58536a != this.f58284g) {
            return true;
        } else {
            return B(w(this.f58295s));
        }
    }

    public final boolean B(int i7) {
        q2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f58289m[i7] & 1073741824) != 0 || !this.h.d()) {
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

    public final void D(e2.u uVar, wf.b bVar) {
        boolean z9;
        e2.r rVar;
        e2.u uVar2;
        e2.u uVar3 = this.f58284g;
        if (uVar3 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (uVar3 == null) {
            rVar = null;
        } else {
            rVar = uVar3.f10618w;
        }
        this.f58284g = uVar;
        e2.r rVar2 = uVar.f10618w;
        q2.m mVar = this.d;
        if (mVar != null) {
            int F = mVar.F(uVar);
            e2.t a10 = uVar.a();
            a10.S = F;
            uVar2 = new e2.u(a10);
        } else {
            uVar2 = uVar;
        }
        bVar.f57655c = uVar2;
        bVar.f57654b = this.h;
        if (mVar != null) {
            if (z9 || !Objects.equals(rVar, rVar2)) {
                q2.g gVar = this.h;
                q2.j jVar = this.f58282e;
                q2.g i7 = mVar.i(jVar, uVar);
                this.h = i7;
                bVar.f57654b = i7;
                if (gVar != null) {
                    gVar.c(jVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z9;
        long j3;
        try {
            int w10 = w(this.f58295s);
            if (this.f58295s != this.f58292p) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                j3 = this.f58286j[w10];
            } else {
                j3 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j3;
    }

    public final int F(wf.b r12, k2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b1.F(wf.b, k2.h, int, boolean):int");
    }

    public final void G(boolean z9) {
        boolean z10;
        om0 om0Var = this.f58279a;
        a4.c cVar = (a4.c) om0Var.f36668e;
        if (((b3.a) cVar.f160c) != null) {
            h6.m mVar = (h6.m) om0Var.f36667c;
            synchronized (mVar) {
                ((l2.h) mVar.d).f17828c.b(cVar);
                a4.c cVar2 = cVar;
                while (cVar2 != null) {
                    b3.a aVar = (b3.a) cVar2.f160c;
                    aVar.getClass();
                    mVar.D(aVar);
                    cVar2 = (a4.c) cVar2.d;
                    if (cVar2 == null || ((b3.a) cVar2.f160c) == null) {
                        cVar2 = null;
                    }
                }
            }
            cVar.f160c = null;
            cVar.d = null;
        }
        a4.c cVar3 = (a4.c) om0Var.f36668e;
        int i7 = om0Var.f36665a;
        if (((b3.a) cVar3.f160c) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.p(z10);
        cVar3.f158a = 0L;
        cVar3.f159b = i7;
        a4.c cVar4 = (a4.c) om0Var.f36668e;
        om0Var.f36669f = cVar4;
        om0Var.f36670g = cVar4;
        om0Var.f36666b = 0L;
        ((h6.m) om0Var.f36667c).G();
        this.f58292p = 0;
        this.f58293q = 0;
        this.f58294r = 0;
        this.f58295s = 0;
        this.f58299x = -1;
        this.f58301z = true;
        this.f58296t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f58298w = Long.MIN_VALUE;
        this.f58300y = false;
        wa waVar = this.f58281c;
        SparseArray sparseArray = (SparseArray) waVar.f701c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((v0.j) waVar.d).accept(sparseArray.valueAt(i10));
        }
        waVar.f700b = -1;
        sparseArray.clear();
        if (z9) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f58295s = 0;
        om0 om0Var = this.f58279a;
        om0Var.f36669f = (a4.c) om0Var.f36668e;
    }

    public final synchronized boolean I(int i7) {
        H();
        int i10 = this.f58293q;
        if (i7 >= i10 && i7 <= this.f58292p + i10) {
            int i11 = this.f58299x;
            if (i11 != -1 && i7 >= i11) {
                return false;
            }
            this.f58296t = Long.MIN_VALUE;
            this.f58295s = i7 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean J(long j3, boolean z9) {
        Throwable th2;
        long min;
        boolean z10;
        b1 b1Var;
        long j10;
        int q10;
        try {
            try {
                H();
                int w10 = w(this.f58295s);
                long j11 = this.f58297u;
                if (j11 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f58298w, j11);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f58298w;
                }
                int i7 = this.f58295s;
                int i10 = this.f58292p;
                if (i7 != i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || j3 < this.f58290n[w10] || (j3 > min && !z9)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i7, j3, z9);
                    b1Var = this;
                    j10 = j3;
                } else {
                    int i11 = i10 - i7;
                    b1Var = this;
                    j10 = j3;
                    q10 = b1Var.q(w10, i11, j10, true);
                }
                if (q10 == -1) {
                    return false;
                }
                b1Var.f58296t = j10;
                b1Var.f58295s += q10;
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
        b1 b1Var;
        long j10;
        int i7;
        try {
            try {
                if (j3 == this.f58297u) {
                    return;
                }
                int i10 = -1;
                if (j3 == Long.MIN_VALUE) {
                    try {
                        this.f58299x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j3 <= this.f58298w) {
                    b1Var = this;
                    j10 = j3;
                    i7 = b1Var.p(this.f58294r, this.f58292p, j10, false);
                } else {
                    b1Var = this;
                    j10 = j3;
                    i7 = -1;
                }
                if (i7 != -1) {
                    i10 = b1Var.f58293q + i7;
                }
                b1Var.f58299x = i10;
                b1Var.f58297u = j10;
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
        boolean z9;
        if (i7 >= 0) {
            try {
                if (this.f58295s + i7 <= this.f58292p) {
                    z9 = true;
                    ia.f(z9);
                    this.f58295s += i7;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z9 = false;
        ia.f(z9);
        this.f58295s += i7;
    }

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        while (true) {
            om0 om0Var = this.f58279a;
            if (i7 > 0) {
                int c10 = om0Var.c(i7);
                a4.c cVar = (a4.c) om0Var.f36670g;
                b3.a aVar = (b3.a) cVar.f160c;
                xVar.k(((int) (om0Var.f36666b - cVar.f158a)) + aVar.f2914b, c10, aVar.f2913a);
                i7 -= c10;
                long j3 = om0Var.f36666b + c10;
                om0Var.f36666b = j3;
                a4.c cVar2 = (a4.c) om0Var.f36670g;
                if (j3 == cVar2.f159b) {
                    om0Var.f36670g = (a4.c) cVar2.d;
                }
            } else {
                om0Var.getClass();
                return;
            }
        }
    }

    @Override
    public final void b(int i7, h2.x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, f3.i0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b1.c(long, int, int, int, f3.i0):void");
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        om0 om0Var = this.f58279a;
        int c10 = om0Var.c(i7);
        a4.c cVar = (a4.c) om0Var.f36670g;
        b3.a aVar = (b3.a) cVar.f160c;
        int read = nVar.read(aVar.f2913a, ((int) (om0Var.f36666b - cVar.f158a)) + aVar.f2914b, c10);
        if (read == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = om0Var.f36666b + read;
        om0Var.f36666b = j3;
        a4.c cVar2 = (a4.c) om0Var.f36670g;
        if (j3 == cVar2.f159b) {
            om0Var.f36670g = (a4.c) cVar2.d;
        }
        return read;
    }

    @Override
    public final void g(e2.u uVar) {
        boolean z9;
        String str;
        boolean z10;
        e2.u r10 = r(uVar);
        boolean z11 = false;
        this.B = false;
        this.C = uVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r10, this.D)) {
                    if (((SparseArray) this.f58281c.f701c).size() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        SparseArray sparseArray = (SparseArray) this.f58281c.f701c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).f58536a.equals(r10)) {
                            SparseArray sparseArray2 = (SparseArray) this.f58281c.f701c;
                            this.D = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f58536a;
                            boolean z12 = this.F;
                            e2.u uVar2 = this.D;
                            str = uVar2.f10615s;
                            String str2 = uVar2.f10607k;
                            if (e2.s0.h(str) != 1 && e2.s0.a(str, str2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.F = z12 & z10;
                            this.G = false;
                            z11 = true;
                        }
                    }
                    this.D = r10;
                    boolean z122 = this.F;
                    e2.u uVar22 = this.D;
                    str = uVar22.f10615s;
                    String str22 = uVar22.f10607k;
                    if (e2.s0.h(str) != 1) {
                    }
                    z10 = false;
                    this.F = z122 & z10;
                    this.G = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r62 = this.f58283f;
        if (r62 != 0 && z11) {
            r62.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, f3.i0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b1.h(long, int, long, int, f3.i0):void");
    }

    public final int i(long j3) {
        int i7 = this.f58292p;
        int w10 = w(i7 - 1);
        while (i7 > this.f58295s && this.f58290n[w10] >= j3) {
            i7--;
            w10--;
            if (w10 == -1) {
                w10 = this.f58285i - 1;
            }
        }
        return i7;
    }

    public final long j(int i7) {
        int i10;
        this.v = Math.max(this.v, u(i7));
        this.f58292p -= i7;
        int i11 = this.f58293q + i7;
        this.f58293q = i11;
        int i12 = this.f58294r + i7;
        this.f58294r = i12;
        int i13 = this.f58285i;
        if (i12 >= i13) {
            this.f58294r = i12 - i13;
        }
        int i14 = this.f58295s - i7;
        this.f58295s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f58295s = 0;
        }
        wa waVar = this.f58281c;
        SparseArray sparseArray = (SparseArray) waVar.f701c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((v0.j) waVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = waVar.f700b;
            if (i17 > 0) {
                waVar.f700b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f58292p == 0) {
            int i18 = this.f58294r;
            if (i18 == 0) {
                i18 = this.f58285i;
            }
            return this.f58287k[i18 - 1] + this.f58288l[i10];
        }
        return this.f58287k[this.f58294r];
    }

    public final void k(long j3, boolean z9) {
        Throwable th2;
        om0 om0Var = this.f58279a;
        synchronized (this) {
            try {
                try {
                    int i7 = this.f58292p;
                    long j10 = -1;
                    if (i7 != 0) {
                        long[] jArr = this.f58290n;
                        int i10 = this.f58294r;
                        if (j3 >= jArr[i10]) {
                            if (z9) {
                                try {
                                    int i11 = this.f58295s;
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
                            om0Var.b(j10);
                        }
                    }
                    om0Var.b(j10);
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
        om0 om0Var = this.f58279a;
        synchronized (this) {
            int i7 = this.f58292p;
            if (i7 == 0) {
                j3 = -1;
            } else {
                j3 = j(i7);
            }
        }
        om0Var.b(j3);
    }

    public final void m(long j3) {
        boolean z9;
        if (this.f58292p == 0) {
            return;
        }
        if (j3 > t()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        o(this.f58293q + i(j3));
    }

    public final long n(int i7) {
        boolean z9;
        int w10;
        int i10 = this.f58293q;
        int i11 = this.f58292p;
        int i12 = (i10 + i11) - i7;
        boolean z10 = false;
        if (i12 >= 0 && i12 <= i11 - this.f58295s) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int i13 = this.f58292p - i12;
        this.f58292p = i13;
        this.f58298w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.f58300y) {
            z10 = true;
        }
        this.f58300y = z10;
        int i14 = this.f58299x;
        int i15 = -1;
        if (i14 != -1 && i7 < i14) {
            this.f58299x = -1;
        }
        wa waVar = this.f58281c;
        SparseArray sparseArray = (SparseArray) waVar.f701c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((v0.j) waVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i15 = Math.min(waVar.f700b, sparseArray.size() - 1);
        }
        waVar.f700b = i15;
        int i16 = this.f58292p;
        if (i16 != 0) {
            return this.f58287k[w(i16 - 1)] + this.f58288l[w10];
        }
        return 0L;
    }

    public final void o(int i7) {
        boolean z9;
        om0 om0Var = this.f58279a;
        long n10 = n(i7);
        int i10 = om0Var.f36665a;
        if (n10 <= om0Var.f36666b) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        om0Var.f36666b = n10;
        if (n10 != 0) {
            a4.c cVar = (a4.c) om0Var.f36668e;
            if (n10 != cVar.f158a) {
                while (om0Var.f36666b > cVar.f159b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                if (((b3.a) cVar2.f160c) != null) {
                    h6.m mVar = (h6.m) om0Var.f36667c;
                    synchronized (mVar) {
                        ((l2.h) mVar.d).f17828c.b(cVar2);
                        a4.c cVar3 = cVar2;
                        while (cVar3 != null) {
                            b3.a aVar = (b3.a) cVar3.f160c;
                            aVar.getClass();
                            mVar.D(aVar);
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
                if (om0Var.f36666b == cVar.f159b) {
                    cVar = cVar4;
                }
                om0Var.f36670g = cVar;
                if (((a4.c) om0Var.f36669f) == cVar2) {
                    om0Var.f36669f = cVar4;
                    return;
                }
                return;
            }
        }
        om0Var.a((a4.c) om0Var.f36668e);
        a4.c cVar5 = new a4.c(om0Var.f36666b, i10);
        om0Var.f36668e = cVar5;
        om0Var.f36669f = cVar5;
        om0Var.f36670g = cVar5;
    }

    public final int p(int i7, int i10, long j3, boolean z9) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f58290n[i7] >= j3) {
                return i11;
            }
            i7++;
            if (i7 == this.f58285i) {
                i7 = 0;
            }
        }
        if (z9) {
            return i10;
        }
        return -1;
    }

    public final int q(int i7, int i10, long j3, boolean z9) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = (this.f58290n[i7] > j3 ? 1 : (this.f58290n[i7] == j3 ? 0 : -1));
            if (i13 > 0) {
                break;
            }
            if (!z9 || (this.f58289m[i7] & 1) != 0) {
                if (i13 == 0) {
                    return i12;
                }
                i11 = i12;
            }
            i7++;
            if (i7 == this.f58285i) {
                i7 = 0;
            }
        }
        return i11;
    }

    public e2.u r(e2.u uVar) {
        if (this.H != 0 && uVar.f10619x != Long.MAX_VALUE) {
            e2.t a10 = uVar.a();
            a10.f10567w = uVar.f10619x + this.H;
            return new e2.u(a10);
        }
        return uVar;
    }

    public final synchronized long s() {
        return this.f58298w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f58295s));
    }

    public final long u(int i7) {
        long j3 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i7 - 1);
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = Math.max(j3, this.f58290n[w10]);
            if ((this.f58289m[w10] & 1) != 0) {
                return j3;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.f58285i - 1;
            }
        }
        return j3;
    }

    public final int v() {
        return this.f58293q + this.f58295s;
    }

    public final int w(int i7) {
        int i10 = this.f58294r + i7;
        int i11 = this.f58285i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int x(long j3, boolean z9) {
        boolean z10;
        try {
            try {
                int w10 = w(this.f58295s);
                int i7 = this.f58295s;
                int i10 = this.f58292p;
                if (i7 != i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || j3 < this.f58290n[w10]) {
                    return 0;
                }
                if (j3 > this.f58298w && z9) {
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
        boolean z9;
        if (this.f58299x != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        return z9;
    }

    @Override
    public final void d(long j3) {
    }
}
