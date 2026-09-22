package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.wo0;
public class b1 implements c3.h0 {
    public b2.s A;
    public b2.s B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final wo0 f43637a;
    public final n2.m d;
    public final n2.j e;
    public Object f43640f;
    public b2.s f43641g;
    public n2.g h;
    public int f43649p;
    public int f43650q;
    public int f43651r;
    public int f43652s;
    public boolean f43655w;
    public boolean f43658z;
    public final ii.b0 f43638b = new Object();
    public int f43642i = 1000;
    public long[] f43643j = new long[1000];
    public long[] f43644k = new long[1000];
    public long[] f43647n = new long[1000];
    public int[] f43646m = new int[1000];
    public int[] f43645l = new int[1000];
    public c3.g0[] f43648o = new c3.g0[1000];
    public final a5.a f43639c = new a5.a(new org.telegram.ui.web.m(2));
    public long f43653t = Long.MIN_VALUE;
    public long f43654u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f43657y = true;
    public boolean f43656x = true;
    public boolean D = true;

    public b1(y2.d dVar, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.e = jVar;
        this.f43637a = new wo0(dVar);
    }

    public final void A(b2.s sVar, n4.y yVar) {
        boolean z10;
        b2.o oVar;
        b2.s sVar2;
        b2.s sVar3 = this.f43641g;
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
        this.f43641g = sVar;
        b2.o oVar2 = sVar.v;
        n2.m mVar = this.d;
        if (mVar != null) {
            int M0 = mVar.M0(sVar);
            b2.r a2 = sVar.a();
            a2.R = M0;
            sVar2 = new b2.s(a2);
        } else {
            sVar2 = sVar;
        }
        yVar.f15231b = sVar2;
        yVar.f15230a = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(oVar, oVar2)) {
                n2.g gVar = this.h;
                n2.j jVar = this.e;
                n2.g Z0 = mVar.Z0(jVar, sVar);
                this.h = Z0;
                yVar.f15230a = Z0;
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
            int u10 = u(this.f43652s);
            if (this.f43652s != this.f43649p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f43643j[u10];
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
        ii.b0 b0Var = this.f43638b;
        synchronized (this) {
            try {
                hVar.d = false;
                if (this.f43652s != this.f43649p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f43655w) {
                        b2.s sVar = this.B;
                        if (sVar == null || (!z11 && sVar == this.f43641g)) {
                        }
                        A(sVar, yVar);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.e = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    b2.s sVar2 = ((z0) this.f43639c.m(t())).f43859a;
                    if (!z11 && sVar2 == this.f43641g) {
                        int u10 = u(this.f43652s);
                        if (!y(u10)) {
                            hVar.d = true;
                        } else {
                            hVar.setFlags(this.f43646m[u10]);
                            if (this.f43652s == this.f43649p - 1 && (z10 || this.f43655w)) {
                                hVar.addFlag(536870912);
                            }
                            hVar.e = this.f43647n[u10];
                            b0Var.f11249a = this.f43645l[u10];
                            b0Var.f11250b = this.f43644k[u10];
                            b0Var.f11251c = this.f43648o[u10];
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
                    wo0 wo0Var = this.f43637a;
                    wo0.f((y0) wo0Var.f30089f, hVar, this.f43638b, (e2.v) wo0Var.d);
                } else {
                    wo0 wo0Var2 = this.f43637a;
                    wo0Var2.f30089f = wo0.f((y0) wo0Var2.f30089f, hVar, this.f43638b, (e2.v) wo0Var2.d);
                }
            }
            if (!z13) {
                this.f43652s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        boolean z11;
        wo0 wo0Var = this.f43637a;
        wo0Var.a((y0) wo0Var.e);
        y0 y0Var = (y0) wo0Var.e;
        int i10 = wo0Var.f30086a;
        if (((y2.a) y0Var.f43858c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.g(z11);
        y0Var.f43856a = 0L;
        y0Var.f43857b = i10;
        y0 y0Var2 = (y0) wo0Var.e;
        wo0Var.f30089f = y0Var2;
        wo0Var.f30090g = y0Var2;
        wo0Var.f30087b = 0L;
        ((y2.d) wo0Var.f30088c).b();
        this.f43649p = 0;
        this.f43650q = 0;
        this.f43651r = 0;
        this.f43652s = 0;
        this.f43656x = true;
        this.f43653t = Long.MIN_VALUE;
        this.f43654u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f43655w = false;
        a5.a aVar = this.f43639c;
        SparseArray sparseArray = (SparseArray) aVar.f277c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((org.telegram.ui.web.m) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.f276b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f43657y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f43652s = 0;
        wo0 wo0Var = this.f43637a;
        wo0Var.f30089f = (y0) wo0Var.e;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.f43650q;
        if (i10 >= i11 && i10 <= this.f43649p + i11) {
            this.f43653t = Long.MIN_VALUE;
            this.f43652s = i10 - i11;
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
                int u10 = u(this.f43652s);
                int i10 = this.f43652s;
                int i11 = this.f43649p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f43647n[u10] || (j3 > this.v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.f43647n[u10] >= j3) {
                                    i12 = i13;
                                    break;
                                }
                                u10++;
                                if (u10 == this.f43642i) {
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
                b1Var.f43653t = j10;
                b1Var.f43652s += o9;
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
                if (this.f43652s + i10 <= this.f43649p) {
                    z10 = true;
                    e2.d.b(z10);
                    this.f43652s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        e2.d.b(z10);
        this.f43652s += i10;
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
        this.f43658z = false;
        this.A = sVar;
        synchronized (this) {
            try {
                this.f43657y = false;
                if (!Objects.equals(p5, this.B)) {
                    if (((SparseArray) this.f43639c.f277c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f43639c.f277c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).f43859a.equals(p5)) {
                            SparseArray sparseArray2 = (SparseArray) this.f43639c.f277c;
                            this.B = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).f43859a;
                            boolean z12 = this.D;
                            b2.s sVar2 = this.B;
                            this.D = z12 & b2.r0.a(sVar2.f3308r, sVar2.f3301k);
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = p5;
                    boolean z122 = this.D;
                    b2.s sVar22 = this.B;
                    this.D = z122 & b2.r0.a(sVar22.f3308r, sVar22.f3301k);
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f43640f;
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
        wo0 wo0Var = this.f43637a;
        int c10 = wo0Var.c(i10);
        y0 y0Var = (y0) wo0Var.f30090g;
        y2.a aVar = (y2.a) y0Var.f43858c;
        int read = kVar.read(aVar.f46579a, ((int) (wo0Var.f30087b - y0Var.f43856a)) + aVar.f46580b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = wo0Var.f30087b + read;
        wo0Var.f30087b = j3;
        y0 y0Var2 = (y0) wo0Var.f30090g;
        if (j3 == y0Var2.f43857b) {
            wo0Var.f30090g = (y0) y0Var2.d;
        }
        return read;
    }

    @Override
    public final void f(e2.v vVar, int i10, int i11) {
        while (true) {
            wo0 wo0Var = this.f43637a;
            if (i10 > 0) {
                int c10 = wo0Var.c(i10);
                y0 y0Var = (y0) wo0Var.f30090g;
                y2.a aVar = (y2.a) y0Var.f43858c;
                vVar.h(((int) (wo0Var.f30087b - y0Var.f43856a)) + aVar.f46580b, c10, aVar.f46579a);
                i10 -= c10;
                long j3 = wo0Var.f30087b + c10;
                wo0Var.f30087b = j3;
                y0 y0Var2 = (y0) wo0Var.f30090g;
                if (j3 == y0Var2.f43857b) {
                    wo0Var.f30090g = (y0) y0Var2.d;
                }
            } else {
                wo0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void g(long r9, int r11, long r12, int r14, c3.g0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b1.g(long, int, long, int, c3.g0):void");
    }

    public final int h(long j3) {
        int i10 = this.f43649p;
        int u10 = u(i10 - 1);
        while (i10 > this.f43652s && this.f43647n[u10] >= j3) {
            i10--;
            u10--;
            if (u10 == -1) {
                u10 = this.f43642i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        int i11;
        this.f43654u = Math.max(this.f43654u, s(i10));
        this.f43649p -= i10;
        int i12 = this.f43650q + i10;
        this.f43650q = i12;
        int i13 = this.f43651r + i10;
        this.f43651r = i13;
        int i14 = this.f43642i;
        if (i13 >= i14) {
            this.f43651r = i13 - i14;
        }
        int i15 = this.f43652s - i10;
        this.f43652s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f43652s = 0;
        }
        a5.a aVar = this.f43639c;
        SparseArray sparseArray = (SparseArray) aVar.f277c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((org.telegram.ui.web.m) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f276b;
            if (i18 > 0) {
                aVar.f276b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f43649p == 0) {
            int i19 = this.f43651r;
            if (i19 == 0) {
                i19 = this.f43642i;
            }
            return this.f43644k[i19 - 1] + this.f43645l[i11];
        }
        return this.f43644k[this.f43651r];
    }

    public final void j(long j3, boolean z10) {
        Throwable th2;
        wo0 wo0Var = this.f43637a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f43649p;
                    long j10 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f43647n;
                        int i11 = this.f43651r;
                        if (j3 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f43652s;
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
                            wo0Var.b(j10);
                        }
                    }
                    wo0Var.b(j10);
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
        wo0 wo0Var = this.f43637a;
        synchronized (this) {
            int i11 = this.f43649p;
            if (i11 == 0) {
                i10 = -1;
            } else {
                i10 = i(i11);
            }
        }
        wo0Var.b(i10);
    }

    public final void l(long j3) {
        boolean z10;
        if (this.f43649p == 0) {
            return;
        }
        if (j3 > r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        n(this.f43650q + h(j3));
    }

    public final long m(int i10) {
        boolean z10;
        int i11;
        int u10;
        int i12 = this.f43650q;
        int i13 = this.f43649p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f43652s) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i15 = this.f43649p - i14;
        this.f43649p = i15;
        this.v = Math.max(this.f43654u, s(i15));
        if (i14 == 0 && this.f43655w) {
            z11 = true;
        }
        this.f43655w = z11;
        a5.a aVar = this.f43639c;
        SparseArray sparseArray = (SparseArray) aVar.f277c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((org.telegram.ui.web.m) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(aVar.f276b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        aVar.f276b = i11;
        int i16 = this.f43649p;
        if (i16 != 0) {
            return this.f43644k[u(i16 - 1)] + this.f43645l[u10];
        }
        return 0L;
    }

    public final void n(int i10) {
        boolean z10;
        long m10 = m(i10);
        wo0 wo0Var = this.f43637a;
        int i11 = wo0Var.f30086a;
        if (m10 <= wo0Var.f30087b) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        wo0Var.f30087b = m10;
        if (m10 != 0) {
            y0 y0Var = (y0) wo0Var.e;
            if (m10 != y0Var.f43856a) {
                while (wo0Var.f30087b > y0Var.f43857b) {
                    y0Var = (y0) y0Var.d;
                }
                y0 y0Var2 = (y0) y0Var.d;
                y0Var2.getClass();
                wo0Var.a(y0Var2);
                y0 y0Var3 = new y0(y0Var.f43857b, i11);
                y0Var.d = y0Var3;
                if (wo0Var.f30087b == y0Var.f43857b) {
                    y0Var = y0Var3;
                }
                wo0Var.f30090g = y0Var;
                if (((y0) wo0Var.f30089f) == y0Var2) {
                    wo0Var.f30089f = y0Var3;
                    return;
                }
                return;
            }
        }
        wo0Var.a((y0) wo0Var.e);
        y0 y0Var4 = new y0(wo0Var.f30087b, i11);
        wo0Var.e = y0Var4;
        wo0Var.f30089f = y0Var4;
        wo0Var.f30090g = y0Var4;
    }

    public final int o(long j3, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f43647n[i10] > j3 ? 1 : (this.f43647n[i10] == j3 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f43646m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f43642i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.s p(b2.s sVar) {
        if (this.F != 0 && sVar.f3312w != Long.MAX_VALUE) {
            b2.r a2 = sVar.a();
            a2.v = sVar.f3312w + this.F;
            return new b2.s(a2);
        }
        return sVar;
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.f43654u, s(this.f43652s));
    }

    public final long s(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int u10 = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f43647n[u10]);
            if ((this.f43646m[u10] & 1) != 0) {
                return j3;
            }
            u10--;
            if (u10 == -1) {
                u10 = this.f43642i - 1;
            }
        }
        return j3;
    }

    public final int t() {
        return this.f43650q + this.f43652s;
    }

    public final int u(int i10) {
        int i11 = this.f43651r + i10;
        int i12 = this.f43642i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int v(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int u10 = u(this.f43652s);
                int i10 = this.f43652s;
                int i11 = this.f43649p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f43647n[u10]) {
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
        if (this.f43657y) {
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
        if (this.f43652s != this.f43649p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f43655w || ((sVar = this.B) != null && sVar != this.f43641g)) {
                z12 = true;
            }
            return z12;
        } else if (((z0) this.f43639c.m(t())).f43859a != this.f43641g) {
            return true;
        } else {
            return y(u(this.f43652s));
        }
    }

    public final boolean y(int i10) {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f43646m[i10] & 1073741824) != 0 || !this.h.d()) {
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
