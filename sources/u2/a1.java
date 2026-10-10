package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.np0;
public class a1 implements c3.h0 {
    public b2.s A;
    public b2.s B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final np0 f48567a;
    public final n2.m d;
    public final n2.j f48570e;
    public Object f48571f;
    public b2.s f48572g;
    public n2.g h;
    public int f48580p;
    public int f48581q;
    public int f48582r;
    public int f48583s;
    public boolean f48586w;
    public boolean f48589z;
    public final ii.b0 f48568b = new Object();
    public int f48573i = 1000;
    public long[] f48574j = new long[1000];
    public long[] f48575k = new long[1000];
    public long[] f48578n = new long[1000];
    public int[] f48577m = new int[1000];
    public int[] f48576l = new int[1000];
    public c3.g0[] f48579o = new c3.g0[1000];
    public final a5.a f48569c = new a5.a(new s0.b(16));
    public long f48584t = Long.MIN_VALUE;
    public long f48585u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f48588y = true;
    public boolean f48587x = true;
    public boolean D = true;

    public a1(y2.d dVar, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.f48570e = jVar;
        this.f48567a = new np0(dVar);
    }

    public final void A(b2.s sVar, n4.x xVar) {
        boolean z10;
        b2.o oVar;
        b2.s sVar2;
        b2.s sVar3 = this.f48572g;
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
        this.f48572g = sVar;
        b2.o oVar2 = sVar.v;
        n2.m mVar = this.d;
        if (mVar != null) {
            int Q0 = mVar.Q0(sVar);
            b2.r a2 = sVar.a();
            a2.R = Q0;
            sVar2 = new b2.s(a2);
        } else {
            sVar2 = sVar;
        }
        xVar.f16617c = sVar2;
        xVar.f16616b = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(oVar, oVar2)) {
                n2.g gVar = this.h;
                n2.j jVar = this.f48570e;
                n2.g e12 = mVar.e1(jVar, sVar);
                this.h = e12;
                xVar.f16616b = e12;
                if (gVar != null) {
                    gVar.a(jVar);
                }
            }
        }
    }

    public final synchronized long B() {
        boolean z10;
        long j3;
        try {
            int u10 = u(this.f48583s);
            if (this.f48583s != this.f48580p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f48574j[u10];
            } else {
                j3 = this.C;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j3;
    }

    public final int C(n4.x xVar, h2.h hVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ii.b0 b0Var = this.f48568b;
        synchronized (this) {
            try {
                hVar.d = false;
                if (this.f48583s != this.f48580p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f48586w) {
                        b2.s sVar = this.B;
                        if (sVar == null || (!z11 && sVar == this.f48572g)) {
                        }
                        A(sVar, xVar);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.f10986e = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    b2.s sVar2 = ((y0) this.f48569c.n(t())).f48807a;
                    if (!z11 && sVar2 == this.f48572g) {
                        int u10 = u(this.f48583s);
                        if (!y(u10)) {
                            hVar.d = true;
                        } else {
                            hVar.setFlags(this.f48577m[u10]);
                            if (this.f48583s == this.f48580p - 1 && (z10 || this.f48586w)) {
                                hVar.addFlag(536870912);
                            }
                            hVar.f10986e = this.f48578n[u10];
                            b0Var.f12281a = this.f48576l[u10];
                            b0Var.f12282b = this.f48575k[u10];
                            b0Var.f12283c = this.f48579o[u10];
                            i11 = -4;
                        }
                    }
                    A(sVar2, xVar);
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
                    np0 np0Var = this.f48567a;
                    np0.f((x0) np0Var.f29171f, hVar, this.f48568b, (e2.v) np0Var.d);
                } else {
                    np0 np0Var2 = this.f48567a;
                    np0Var2.f29171f = np0.f((x0) np0Var2.f29171f, hVar, this.f48568b, (e2.v) np0Var2.d);
                }
            }
            if (!z13) {
                this.f48583s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        boolean z11;
        np0 np0Var = this.f48567a;
        np0Var.a((x0) np0Var.f29170e);
        x0 x0Var = (x0) np0Var.f29170e;
        int i10 = np0Var.f29167a;
        if (((y2.a) x0Var.f48804c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.g(z11);
        x0Var.f48802a = 0L;
        x0Var.f48803b = i10;
        x0 x0Var2 = (x0) np0Var.f29170e;
        np0Var.f29171f = x0Var2;
        np0Var.f29172g = x0Var2;
        np0Var.f29168b = 0L;
        ((y2.d) np0Var.f29169c).b();
        this.f48580p = 0;
        this.f48581q = 0;
        this.f48582r = 0;
        this.f48583s = 0;
        this.f48587x = true;
        this.f48584t = Long.MIN_VALUE;
        this.f48585u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f48586w = false;
        a5.a aVar = this.f48569c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((s0.b) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.f299b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f48588y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f48583s = 0;
        np0 np0Var = this.f48567a;
        np0Var.f29171f = (x0) np0Var.f29170e;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.f48581q;
        if (i10 >= i11 && i10 <= this.f48580p + i11) {
            this.f48584t = Long.MIN_VALUE;
            this.f48583s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j3, boolean z10) {
        Throwable th2;
        boolean z11;
        a1 a1Var;
        long j10;
        int o9;
        try {
            try {
                E();
                int u10 = u(this.f48583s);
                int i10 = this.f48583s;
                int i11 = this.f48580p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f48578n[u10] || (j3 > this.v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.f48578n[u10] >= j3) {
                                    i12 = i13;
                                    break;
                                }
                                u10++;
                                if (u10 == this.f48573i) {
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
                    a1Var = this;
                } else {
                    int i14 = i11 - i10;
                    a1Var = this;
                    j10 = j3;
                    o9 = a1Var.o(j10, u10, i14, true);
                }
                if (o9 == -1) {
                    return false;
                }
                a1Var.f48584t = j10;
                a1Var.f48583s += o9;
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
                if (this.f48583s + i10 <= this.f48580p) {
                    z10 = true;
                    e2.d.b(z10);
                    this.f48583s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        e2.d.b(z10);
        this.f48583s += i10;
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
        this.f48589z = false;
        this.A = sVar;
        synchronized (this) {
            try {
                this.f48588y = false;
                if (!Objects.equals(p5, this.B)) {
                    if (((SparseArray) this.f48569c.f300c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f48569c.f300c;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).f48807a.equals(p5)) {
                            SparseArray sparseArray2 = (SparseArray) this.f48569c.f300c;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f48807a;
                            boolean z12 = this.D;
                            b2.s sVar2 = this.B;
                            this.D = z12 & b2.r0.a(sVar2.f3643r, sVar2.f3636k);
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = p5;
                    boolean z122 = this.D;
                    b2.s sVar22 = this.B;
                    this.D = z122 & b2.r0.a(sVar22.f3643r, sVar22.f3636k);
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f48571f;
        if (r52 != 0 && z11) {
            r52.a();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.g0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a1.c(long, int, int, int, c3.g0):void");
    }

    @Override
    public final void d(int i10, e2.v vVar) {
        a1.g.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        np0 np0Var = this.f48567a;
        int c10 = np0Var.c(i10);
        x0 x0Var = (x0) np0Var.f29172g;
        y2.a aVar = (y2.a) x0Var.f48804c;
        int read = kVar.read(aVar.f51700a, ((int) (np0Var.f29168b - x0Var.f48802a)) + aVar.f51701b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = np0Var.f29168b + read;
        np0Var.f29168b = j3;
        x0 x0Var2 = (x0) np0Var.f29172g;
        if (j3 == x0Var2.f48803b) {
            np0Var.f29172g = (x0) x0Var2.d;
        }
        return read;
    }

    @Override
    public final void f(e2.v vVar, int i10, int i11) {
        while (true) {
            np0 np0Var = this.f48567a;
            if (i10 > 0) {
                int c10 = np0Var.c(i10);
                x0 x0Var = (x0) np0Var.f29172g;
                y2.a aVar = (y2.a) x0Var.f48804c;
                vVar.h(((int) (np0Var.f29168b - x0Var.f48802a)) + aVar.f51701b, c10, aVar.f51700a);
                i10 -= c10;
                long j3 = np0Var.f29168b + c10;
                np0Var.f29168b = j3;
                x0 x0Var2 = (x0) np0Var.f29172g;
                if (j3 == x0Var2.f48803b) {
                    np0Var.f29172g = (x0) x0Var2.d;
                }
            } else {
                np0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void g(long r9, int r11, long r12, int r14, c3.g0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a1.g(long, int, long, int, c3.g0):void");
    }

    public final int h(long j3) {
        int i10 = this.f48580p;
        int u10 = u(i10 - 1);
        while (i10 > this.f48583s && this.f48578n[u10] >= j3) {
            i10--;
            u10--;
            if (u10 == -1) {
                u10 = this.f48573i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        int i11;
        this.f48585u = Math.max(this.f48585u, s(i10));
        this.f48580p -= i10;
        int i12 = this.f48581q + i10;
        this.f48581q = i12;
        int i13 = this.f48582r + i10;
        this.f48582r = i13;
        int i14 = this.f48573i;
        if (i13 >= i14) {
            this.f48582r = i13 - i14;
        }
        int i15 = this.f48583s - i10;
        this.f48583s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f48583s = 0;
        }
        a5.a aVar = this.f48569c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((s0.b) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f299b;
            if (i18 > 0) {
                aVar.f299b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f48580p == 0) {
            int i19 = this.f48582r;
            if (i19 == 0) {
                i19 = this.f48573i;
            }
            return this.f48575k[i19 - 1] + this.f48576l[i11];
        }
        return this.f48575k[this.f48582r];
    }

    public final void j(long j3, boolean z10) {
        Throwable th2;
        np0 np0Var = this.f48567a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f48580p;
                    long j10 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f48578n;
                        int i11 = this.f48582r;
                        if (j3 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f48583s;
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
                            np0Var.b(j10);
                        }
                    }
                    np0Var.b(j10);
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
        np0 np0Var = this.f48567a;
        synchronized (this) {
            int i11 = this.f48580p;
            if (i11 == 0) {
                i10 = -1;
            } else {
                i10 = i(i11);
            }
        }
        np0Var.b(i10);
    }

    public final void l(long j3) {
        boolean z10;
        if (this.f48580p == 0) {
            return;
        }
        if (j3 > r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        n(this.f48581q + h(j3));
    }

    public final long m(int i10) {
        boolean z10;
        int i11;
        int u10;
        int i12 = this.f48581q;
        int i13 = this.f48580p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f48583s) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i15 = this.f48580p - i14;
        this.f48580p = i15;
        this.v = Math.max(this.f48585u, s(i15));
        if (i14 == 0 && this.f48586w) {
            z11 = true;
        }
        this.f48586w = z11;
        a5.a aVar = this.f48569c;
        SparseArray sparseArray = (SparseArray) aVar.f300c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((s0.b) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(aVar.f299b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        aVar.f299b = i11;
        int i16 = this.f48580p;
        if (i16 != 0) {
            return this.f48575k[u(i16 - 1)] + this.f48576l[u10];
        }
        return 0L;
    }

    public final void n(int i10) {
        boolean z10;
        long m10 = m(i10);
        np0 np0Var = this.f48567a;
        int i11 = np0Var.f29167a;
        if (m10 <= np0Var.f29168b) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        np0Var.f29168b = m10;
        if (m10 != 0) {
            x0 x0Var = (x0) np0Var.f29170e;
            if (m10 != x0Var.f48802a) {
                while (np0Var.f29168b > x0Var.f48803b) {
                    x0Var = (x0) x0Var.d;
                }
                x0 x0Var2 = (x0) x0Var.d;
                x0Var2.getClass();
                np0Var.a(x0Var2);
                x0 x0Var3 = new x0(x0Var.f48803b, i11);
                x0Var.d = x0Var3;
                if (np0Var.f29168b == x0Var.f48803b) {
                    x0Var = x0Var3;
                }
                np0Var.f29172g = x0Var;
                if (((x0) np0Var.f29171f) == x0Var2) {
                    np0Var.f29171f = x0Var3;
                    return;
                }
                return;
            }
        }
        np0Var.a((x0) np0Var.f29170e);
        x0 x0Var4 = new x0(np0Var.f29168b, i11);
        np0Var.f29170e = x0Var4;
        np0Var.f29171f = x0Var4;
        np0Var.f29172g = x0Var4;
    }

    public final int o(long j3, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f48578n[i10] > j3 ? 1 : (this.f48578n[i10] == j3 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f48577m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f48573i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.s p(b2.s sVar) {
        if (this.F != 0 && sVar.f3647w != Long.MAX_VALUE) {
            b2.r a2 = sVar.a();
            a2.v = sVar.f3647w + this.F;
            return new b2.s(a2);
        }
        return sVar;
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.f48585u, s(this.f48583s));
    }

    public final long s(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int u10 = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f48578n[u10]);
            if ((this.f48577m[u10] & 1) != 0) {
                return j3;
            }
            u10--;
            if (u10 == -1) {
                u10 = this.f48573i - 1;
            }
        }
        return j3;
    }

    public final int t() {
        return this.f48581q + this.f48583s;
    }

    public final int u(int i10) {
        int i11 = this.f48582r + i10;
        int i12 = this.f48573i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int v(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int u10 = u(this.f48583s);
                int i10 = this.f48583s;
                int i11 = this.f48580p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f48578n[u10]) {
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
        if (this.f48588y) {
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
        if (this.f48583s != this.f48580p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f48586w || ((sVar = this.B) != null && sVar != this.f48572g)) {
                z12 = true;
            }
            return z12;
        } else if (((y0) this.f48569c.n(t())).f48807a != this.f48572g) {
            return true;
        } else {
            return y(u(this.f48583s));
        }
    }

    public final boolean y(int i10) {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f48577m[i10] & 1073741824) != 0 || !this.h.d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void z() {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() == 1) {
            n2.f g10 = this.h.g();
            g10.getClass();
            throw g10;
        }
    }
}
