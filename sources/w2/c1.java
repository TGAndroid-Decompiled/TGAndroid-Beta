package w2;

import android.util.SparseArray;
import b8.kg;
import b8.zb;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.rm0;
public class c1 implements e3.i0 {
    public boolean B;
    public d2.v C;
    public d2.v D;
    public long E;
    public boolean G;
    public long H;
    public boolean I;
    public final rm0 f57043a;
    public final p2.m d;
    public final p2.j f57046e;
    public Object f57047f;
    public d2.v f57048g;
    public p2.g h;
    public int f57056p;
    public int f57057q;
    public int f57058r;
    public int f57059s;
    public boolean f57064y;
    public final l5.c f57044b = new Object();
    public int f57049i = 1000;
    public long[] f57050j = new long[1000];
    public long[] f57051k = new long[1000];
    public long[] f57054n = new long[1000];
    public int[] f57053m = new int[1000];
    public int[] f57052l = new int[1000];
    public e3.h0[] f57055o = new e3.h0[1000];
    public final kg f57045c = new kg(new u9.j(14));
    public long f57060t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long f57062w = Long.MIN_VALUE;
    public boolean A = true;
    public boolean f57065z = true;
    public boolean F = true;
    public long f57061u = Long.MIN_VALUE;
    public int f57063x = -1;

    public c1(android.support.v4.media.session.a0 a0Var, p2.m mVar, p2.j jVar) {
        this.d = mVar;
        this.f57046e = jVar;
        this.f57043a = new rm0(a0Var);
    }

    public final synchronized boolean A(boolean z10) {
        boolean z11;
        d2.v vVar;
        int v = v();
        int i3 = this.f57063x;
        boolean z12 = true;
        if (i3 != -1 && v >= i3) {
            return true;
        }
        if (this.f57059s != this.f57056p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f57064y && ((vVar = this.D) == null || vVar == this.f57048g)) {
                z12 = false;
            }
            return z12;
        } else if (((a1) this.f57045c.m(v)).f57024a != this.f57048g) {
            return true;
        } else {
            return B(w(this.f57059s));
        }
    }

    public final boolean B(int i3) {
        p2.g gVar = this.h;
        if (gVar != null && gVar.d() != 4) {
            if ((this.f57053m[i3] & 1073741824) != 0 || !this.h.c()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void C() {
        p2.g gVar = this.h;
        if (gVar != null && gVar.d() == 1) {
            p2.f g7 = this.h.g();
            g7.getClass();
            throw g7;
        }
    }

    public final void D(d2.v vVar, tf.b bVar) {
        boolean z10;
        d2.s sVar;
        d2.v vVar2;
        d2.v vVar3 = this.f57048g;
        if (vVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (vVar3 == null) {
            sVar = null;
        } else {
            sVar = vVar3.f8492w;
        }
        this.f57048g = vVar;
        d2.s sVar2 = vVar.f8492w;
        p2.m mVar = this.d;
        if (mVar != null) {
            int u10 = mVar.u(vVar);
            d2.u a10 = vVar.a();
            a10.S = u10;
            vVar2 = new d2.v(a10);
        } else {
            vVar2 = vVar;
        }
        bVar.f55095b = vVar2;
        bVar.f55094a = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(sVar, sVar2)) {
                p2.g gVar = this.h;
                p2.j jVar = this.f57046e;
                p2.g A = mVar.A(jVar, vVar);
                this.h = A;
                bVar.f55094a = A;
                if (gVar != null) {
                    gVar.b(jVar);
                }
            }
        }
    }

    public final synchronized long E() {
        boolean z10;
        long j10;
        try {
            int w10 = w(this.f57059s);
            if (this.f57059s != this.f57056p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j10 = this.f57050j[w10];
            } else {
                j10 = this.E;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final int F(tf.b r12, j2.h r13, int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: w2.c1.F(tf.b, j2.h, int, boolean):int");
    }

    public final void G(boolean z10) {
        boolean z11;
        rm0 rm0Var = this.f57043a;
        z0 z0Var = (z0) rm0Var.f37752e;
        if (((a3.a) z0Var.f57294c) != null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) rm0Var.f37751c;
            synchronized (a0Var) {
                ((k2.h) a0Var.d).f16515c.c(z0Var);
                z0 z0Var2 = z0Var;
                while (z0Var2 != null) {
                    a3.a aVar = (a3.a) z0Var2.f57294c;
                    aVar.getClass();
                    a0Var.p(aVar);
                    z0Var2 = (z0) z0Var2.d;
                    if (z0Var2 == null || ((a3.a) z0Var2.f57294c) == null) {
                        z0Var2 = null;
                    }
                }
            }
            z0Var.f57294c = null;
            z0Var.d = null;
        }
        z0 z0Var3 = (z0) rm0Var.f37752e;
        int i3 = rm0Var.f37749a;
        if (((a3.a) z0Var3.f57294c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.p(z11);
        z0Var3.f57292a = 0L;
        z0Var3.f57293b = i3;
        z0 z0Var4 = (z0) rm0Var.f37752e;
        rm0Var.f37753f = z0Var4;
        rm0Var.f37754g = z0Var4;
        rm0Var.f37750b = 0L;
        ((android.support.v4.media.session.a0) rm0Var.f37751c).x();
        this.f57056p = 0;
        this.f57057q = 0;
        this.f57058r = 0;
        this.f57059s = 0;
        this.f57063x = -1;
        this.f57065z = true;
        this.f57060t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f57062w = Long.MIN_VALUE;
        this.f57064y = false;
        kg kgVar = this.f57045c;
        SparseArray sparseArray = (SparseArray) kgVar.f2723c;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(i10));
        }
        kgVar.f2722b = -1;
        sparseArray.clear();
        if (z10) {
            this.C = null;
            this.D = null;
            this.A = true;
            this.F = true;
        }
    }

    public final synchronized void H() {
        this.f57059s = 0;
        rm0 rm0Var = this.f57043a;
        rm0Var.f37753f = (z0) rm0Var.f37752e;
    }

    public final synchronized boolean I(int i3) {
        H();
        int i10 = this.f57057q;
        if (i3 >= i10 && i3 <= this.f57056p + i10) {
            int i11 = this.f57063x;
            if (i11 != -1 && i3 >= i11) {
                return false;
            }
            this.f57060t = Long.MIN_VALUE;
            this.f57059s = i3 - i10;
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
        int q10;
        try {
            try {
                H();
                int w10 = w(this.f57059s);
                long j12 = this.f57061u;
                if (j12 != Long.MIN_VALUE) {
                    try {
                        min = Math.min(this.f57062w, j12);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    min = this.f57062w;
                }
                int i3 = this.f57059s;
                int i10 = this.f57056p;
                if (i3 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f57054n[w10] || (j10 > min && !z10)) {
                    return false;
                }
                if (this.F) {
                    q10 = p(w10, i10 - i3, j10, z10);
                    c1Var = this;
                    j11 = j10;
                } else {
                    int i11 = i10 - i3;
                    c1Var = this;
                    j11 = j10;
                    q10 = c1Var.q(w10, i11, j11, true);
                }
                if (q10 == -1) {
                    return false;
                }
                c1Var.f57060t = j11;
                c1Var.f57059s += q10;
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
        int i3;
        try {
            try {
                if (j10 == this.f57061u) {
                    return;
                }
                int i10 = -1;
                if (j10 == Long.MIN_VALUE) {
                    try {
                        this.f57063x = -1;
                        return;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (j10 <= this.f57062w) {
                    c1Var = this;
                    j11 = j10;
                    i3 = c1Var.p(this.f57058r, this.f57056p, j11, false);
                } else {
                    c1Var = this;
                    j11 = j10;
                    i3 = -1;
                }
                if (i3 != -1) {
                    i10 = c1Var.f57057q + i3;
                }
                c1Var.f57063x = i10;
                c1Var.f57061u = j11;
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

    public final synchronized void L(int i3) {
        boolean z10;
        if (i3 >= 0) {
            try {
                if (this.f57059s + i3 <= this.f57056p) {
                    z10 = true;
                    zb.f(z10);
                    this.f57059s += i3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        zb.f(z10);
        this.f57059s += i3;
    }

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        rm0 rm0Var = this.f57043a;
        int c2 = rm0Var.c(i3);
        z0 z0Var = (z0) rm0Var.f37754g;
        a3.a aVar = (a3.a) z0Var.f57294c;
        int read = oVar.read(aVar.f55a, ((int) (rm0Var.f37750b - z0Var.f57292a)) + aVar.f56b, c2);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = rm0Var.f37750b + read;
        rm0Var.f37750b = j10;
        z0 z0Var2 = (z0) rm0Var.f37754g;
        if (j10 == z0Var2.f57293b) {
            rm0Var.f37754g = (z0) z0Var2.d;
        }
        return read;
    }

    @Override
    public void d(long r13, int r15, int r16, int r17, e3.h0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: w2.c1.d(long, int, int, int, e3.h0):void");
    }

    @Override
    public final void e(int i3, g2.y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override
    public final void f(g2.y yVar, int i3, int i10) {
        while (true) {
            rm0 rm0Var = this.f57043a;
            if (i3 > 0) {
                int c2 = rm0Var.c(i3);
                z0 z0Var = (z0) rm0Var.f37754g;
                a3.a aVar = (a3.a) z0Var.f57294c;
                yVar.k(((int) (rm0Var.f37750b - z0Var.f57292a)) + aVar.f56b, c2, aVar.f55a);
                i3 -= c2;
                long j10 = rm0Var.f37750b + c2;
                rm0Var.f37750b = j10;
                z0 z0Var2 = (z0) rm0Var.f37754g;
                if (j10 == z0Var2.f57293b) {
                    rm0Var.f37754g = (z0) z0Var2.d;
                }
            } else {
                rm0Var.getClass();
                return;
            }
        }
    }

    @Override
    public final void g(d2.v vVar) {
        boolean z10;
        String str;
        boolean z11;
        d2.v r5 = r(vVar);
        boolean z12 = false;
        this.B = false;
        this.C = vVar;
        synchronized (this) {
            try {
                this.A = false;
                if (!Objects.equals(r5, this.D)) {
                    if (((SparseArray) this.f57045c.f2723c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f57045c.f2723c;
                        if (((a1) sparseArray.valueAt(sparseArray.size() - 1)).f57024a.equals(r5)) {
                            SparseArray sparseArray2 = (SparseArray) this.f57045c.f2723c;
                            this.D = ((a1) sparseArray2.valueAt(sparseArray2.size() - 1)).f57024a;
                            boolean z13 = this.F;
                            d2.v vVar2 = this.D;
                            str = vVar2.f8489s;
                            String str2 = vVar2.f8481k;
                            if (d2.u0.h(str) != 1 && d2.u0.a(str, str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.F = z13 & z11;
                            this.G = false;
                            z12 = true;
                        }
                    }
                    this.D = r5;
                    boolean z132 = this.F;
                    d2.v vVar22 = this.D;
                    str = vVar22.f8489s;
                    String str22 = vVar22.f8481k;
                    if (d2.u0.h(str) != 1) {
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
        ?? r62 = this.f57047f;
        if (r62 != 0 && z12) {
            r62.a();
        }
    }

    public final synchronized void h(long r9, int r11, long r12, int r14, e3.h0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: w2.c1.h(long, int, long, int, e3.h0):void");
    }

    public final int i(long j10) {
        int i3 = this.f57056p;
        int w10 = w(i3 - 1);
        while (i3 > this.f57059s && this.f57054n[w10] >= j10) {
            i3--;
            w10--;
            if (w10 == -1) {
                w10 = this.f57049i - 1;
            }
        }
        return i3;
    }

    public final long j(int i3) {
        int i10;
        this.v = Math.max(this.v, u(i3));
        this.f57056p -= i3;
        int i11 = this.f57057q + i3;
        this.f57057q = i11;
        int i12 = this.f57058r + i3;
        this.f57058r = i12;
        int i13 = this.f57049i;
        if (i12 >= i13) {
            this.f57058r = i12 - i13;
        }
        int i14 = this.f57059s - i3;
        this.f57059s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f57059s = 0;
        }
        kg kgVar = this.f57045c;
        SparseArray sparseArray = (SparseArray) kgVar.f2723c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = kgVar.f2722b;
            if (i17 > 0) {
                kgVar.f2722b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f57056p == 0) {
            int i18 = this.f57058r;
            if (i18 == 0) {
                i18 = this.f57049i;
            }
            return this.f57051k[i18 - 1] + this.f57052l[i10];
        }
        return this.f57051k[this.f57058r];
    }

    public final void k(long j10, boolean z10) {
        Throwable th2;
        rm0 rm0Var = this.f57043a;
        synchronized (this) {
            try {
                try {
                    int i3 = this.f57056p;
                    long j11 = -1;
                    if (i3 != 0) {
                        long[] jArr = this.f57054n;
                        int i10 = this.f57058r;
                        if (j10 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.f57059s;
                                    if (i11 != i3) {
                                        i3 = i11 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int q10 = q(i10, i3, j10, false);
                            if (q10 != -1) {
                                j11 = j(q10);
                            }
                            rm0Var.b(j11);
                        }
                    }
                    rm0Var.b(j11);
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
        rm0 rm0Var = this.f57043a;
        synchronized (this) {
            int i3 = this.f57056p;
            if (i3 == 0) {
                j10 = -1;
            } else {
                j10 = j(i3);
            }
        }
        rm0Var.b(j10);
    }

    public final void m(long j10) {
        boolean z10;
        if (this.f57056p == 0) {
            return;
        }
        if (j10 > t()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        o(this.f57057q + i(j10));
    }

    public final long n(int i3) {
        boolean z10;
        int w10;
        int i10 = this.f57057q;
        int i11 = this.f57056p;
        int i12 = (i10 + i11) - i3;
        boolean z11 = false;
        if (i12 >= 0 && i12 <= i11 - this.f57059s) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int i13 = this.f57056p - i12;
        this.f57056p = i13;
        this.f57062w = Math.max(this.v, u(i13));
        if (i12 == 0 && this.f57064y) {
            z11 = true;
        }
        this.f57064y = z11;
        int i14 = this.f57063x;
        int i15 = -1;
        if (i14 != -1 && i3 < i14) {
            this.f57063x = -1;
        }
        kg kgVar = this.f57045c;
        SparseArray sparseArray = (SparseArray) kgVar.f2723c;
        for (int size = sparseArray.size() - 1; size >= 0 && i3 < sparseArray.keyAt(size); size--) {
            ((u9.j) kgVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i15 = Math.min(kgVar.f2722b, sparseArray.size() - 1);
        }
        kgVar.f2722b = i15;
        int i16 = this.f57056p;
        if (i16 != 0) {
            return this.f57051k[w(i16 - 1)] + this.f57052l[w10];
        }
        return 0L;
    }

    public final void o(int i3) {
        boolean z10;
        rm0 rm0Var = this.f57043a;
        long n4 = n(i3);
        int i10 = rm0Var.f37749a;
        if (n4 <= rm0Var.f37750b) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        rm0Var.f37750b = n4;
        if (n4 != 0) {
            z0 z0Var = (z0) rm0Var.f37752e;
            if (n4 != z0Var.f57292a) {
                while (rm0Var.f37750b > z0Var.f57293b) {
                    z0Var = (z0) z0Var.d;
                }
                z0 z0Var2 = (z0) z0Var.d;
                z0Var2.getClass();
                if (((a3.a) z0Var2.f57294c) != null) {
                    android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) rm0Var.f37751c;
                    synchronized (a0Var) {
                        ((k2.h) a0Var.d).f16515c.c(z0Var2);
                        z0 z0Var3 = z0Var2;
                        while (z0Var3 != null) {
                            a3.a aVar = (a3.a) z0Var3.f57294c;
                            aVar.getClass();
                            a0Var.p(aVar);
                            z0Var3 = (z0) z0Var3.d;
                            if (z0Var3 == null || ((a3.a) z0Var3.f57294c) == null) {
                                z0Var3 = null;
                            }
                        }
                    }
                    z0Var2.f57294c = null;
                    z0Var2.d = null;
                }
                z0 z0Var4 = new z0(z0Var.f57293b, i10);
                z0Var.d = z0Var4;
                if (rm0Var.f37750b == z0Var.f57293b) {
                    z0Var = z0Var4;
                }
                rm0Var.f37754g = z0Var;
                if (((z0) rm0Var.f37753f) == z0Var2) {
                    rm0Var.f37753f = z0Var4;
                    return;
                }
                return;
            }
        }
        rm0Var.a((z0) rm0Var.f37752e);
        z0 z0Var5 = new z0(rm0Var.f37750b, i10);
        rm0Var.f37752e = z0Var5;
        rm0Var.f37753f = z0Var5;
        rm0Var.f37754g = z0Var5;
    }

    public final int p(int i3, int i10, long j10, boolean z10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f57054n[i3] >= j10) {
                return i11;
            }
            i3++;
            if (i3 == this.f57049i) {
                i3 = 0;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    public final int q(int i3, int i10, long j10, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = (this.f57054n[i3] > j10 ? 1 : (this.f57054n[i3] == j10 ? 0 : -1));
            if (i13 > 0) {
                break;
            }
            if (!z10 || (this.f57053m[i3] & 1) != 0) {
                if (i13 == 0) {
                    return i12;
                }
                i11 = i12;
            }
            i3++;
            if (i3 == this.f57049i) {
                i3 = 0;
            }
        }
        return i11;
    }

    public d2.v r(d2.v vVar) {
        if (this.H != 0 && vVar.f8493x != Long.MAX_VALUE) {
            d2.u a10 = vVar.a();
            a10.f8435w = vVar.f8493x + this.H;
            return new d2.v(a10);
        }
        return vVar;
    }

    public final synchronized long s() {
        return this.f57062w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.f57059s));
    }

    public final long u(int i3) {
        long j10 = Long.MIN_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int w10 = w(i3 - 1);
        for (int i10 = 0; i10 < i3; i10++) {
            j10 = Math.max(j10, this.f57054n[w10]);
            if ((this.f57053m[w10] & 1) != 0) {
                return j10;
            }
            w10--;
            if (w10 == -1) {
                w10 = this.f57049i - 1;
            }
        }
        return j10;
    }

    public final int v() {
        return this.f57057q + this.f57059s;
    }

    public final int w(int i3) {
        int i10 = this.f57058r + i3;
        int i11 = this.f57049i;
        if (i10 < i11) {
            return i10;
        }
        return i10 - i11;
    }

    public final synchronized int x(long j10, boolean z10) {
        boolean z11;
        try {
            try {
                int w10 = w(this.f57059s);
                int i3 = this.f57059s;
                int i10 = this.f57056p;
                if (i3 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j10 < this.f57054n[w10]) {
                    return 0;
                }
                if (j10 > this.f57062w && z10) {
                    return i10 - i3;
                }
                int q10 = q(w10, i10 - i3, j10, true);
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

    public final synchronized d2.v y() {
        d2.v vVar;
        if (this.A) {
            vVar = null;
        } else {
            vVar = this.D;
        }
        return vVar;
    }

    public final synchronized boolean z() {
        boolean z10;
        if (this.f57063x != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override
    public final void b(long j10) {
    }
}
