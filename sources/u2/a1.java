package u2;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.ui.Components.ho0;
public class a1 implements c3.h0 {
    public b2.s A;
    public b2.s B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final ho0 f46646a;
    public final n2.m d;
    public final n2.j f46649e;
    public Object f46650f;
    public b2.s f46651g;
    public n2.g h;
    public int f46659p;
    public int f46660q;
    public int f46661r;
    public int f46662s;
    public boolean f46665w;
    public boolean f46668z;
    public final j5.b f46647b = new Object();
    public int f46652i = 1000;
    public long[] f46653j = new long[1000];
    public long[] f46654k = new long[1000];
    public long[] f46657n = new long[1000];
    public int[] f46656m = new int[1000];
    public int[] f46655l = new int[1000];
    public c3.g0[] f46658o = new c3.g0[1000];
    public final a5.a f46648c = new a5.a(new org.telegram.ui.web.n(2));
    public long f46663t = Long.MIN_VALUE;
    public long f46664u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean f46667y = true;
    public boolean f46666x = true;
    public boolean D = true;

    public a1(y2.d dVar, n2.m mVar, n2.j jVar) {
        this.d = mVar;
        this.f46649e = jVar;
        this.f46646a = new ho0(dVar);
    }

    public final void A(b2.s sVar, n4.y yVar) {
        boolean z10;
        b2.o oVar;
        b2.s sVar2;
        b2.s sVar3 = this.f46651g;
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
        this.f46651g = sVar;
        b2.o oVar2 = sVar.v;
        n2.m mVar = this.d;
        if (mVar != null) {
            int H0 = mVar.H0(sVar);
            b2.r a2 = sVar.a();
            a2.R = H0;
            sVar2 = new b2.s(a2);
        } else {
            sVar2 = sVar;
        }
        yVar.f16524c = sVar2;
        yVar.f16523b = this.h;
        if (mVar != null) {
            if (z10 || !Objects.equals(oVar, oVar2)) {
                n2.g gVar = this.h;
                n2.j jVar = this.f46649e;
                n2.g T0 = mVar.T0(jVar, sVar);
                this.h = T0;
                yVar.f16523b = T0;
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
            int u10 = u(this.f46662s);
            if (this.f46662s != this.f46659p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                j3 = this.f46653j[u10];
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
        j5.b bVar = this.f46647b;
        synchronized (this) {
            try {
                hVar.d = false;
                if (this.f46662s != this.f46659p) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 = -3;
                if (!z12) {
                    if (!z10 && !this.f46665w) {
                        b2.s sVar = this.B;
                        if (sVar == null || (!z11 && sVar == this.f46651g)) {
                        }
                        A(sVar, yVar);
                        i11 = -5;
                    }
                    hVar.setFlags(4);
                    hVar.f10877e = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    b2.s sVar2 = ((y0) this.f46648c.l(t())).f46887a;
                    if (!z11 && sVar2 == this.f46651g) {
                        int u10 = u(this.f46662s);
                        if (!y(u10)) {
                            hVar.d = true;
                        } else {
                            hVar.setFlags(this.f46656m[u10]);
                            if (this.f46662s == this.f46659p - 1 && (z10 || this.f46665w)) {
                                hVar.addFlag(536870912);
                            }
                            hVar.f10877e = this.f46657n[u10];
                            bVar.f13539b = this.f46655l[u10];
                            bVar.f13538a = this.f46654k[u10];
                            bVar.f13540c = this.f46658o[u10];
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
                    ho0 ho0Var = this.f46646a;
                    ho0.f((x0) ho0Var.f26804f, hVar, this.f46647b, (e2.v) ho0Var.d);
                } else {
                    ho0 ho0Var2 = this.f46646a;
                    ho0Var2.f26804f = ho0.f((x0) ho0Var2.f26804f, hVar, this.f46647b, (e2.v) ho0Var2.d);
                }
            }
            if (!z13) {
                this.f46662s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        boolean z11;
        ho0 ho0Var = this.f46646a;
        ho0Var.a((x0) ho0Var.f26803e);
        x0 x0Var = (x0) ho0Var.f26803e;
        int i10 = ho0Var.f26800a;
        if (((y2.a) x0Var.f46884c) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.g(z11);
        x0Var.f46882a = 0L;
        x0Var.f46883b = i10;
        x0 x0Var2 = (x0) ho0Var.f26803e;
        ho0Var.f26804f = x0Var2;
        ho0Var.f26805g = x0Var2;
        ho0Var.f26801b = 0L;
        ((y2.d) ho0Var.f26802c).b();
        this.f46659p = 0;
        this.f46660q = 0;
        this.f46661r = 0;
        this.f46662s = 0;
        this.f46666x = true;
        this.f46663t = Long.MIN_VALUE;
        this.f46664u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f46665w = false;
        a5.a aVar = this.f46648c;
        SparseArray sparseArray = (SparseArray) aVar.f298c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(i11));
        }
        aVar.f297b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f46667y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f46662s = 0;
        ho0 ho0Var = this.f46646a;
        ho0Var.f26804f = (x0) ho0Var.f26803e;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.f46660q;
        if (i10 >= i11 && i10 <= this.f46659p + i11) {
            this.f46663t = Long.MIN_VALUE;
            this.f46662s = i10 - i11;
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
                int u10 = u(this.f46662s);
                int i10 = this.f46662s;
                int i11 = this.f46659p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f46657n[u10] || (j3 > this.v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.f46657n[u10] >= j3) {
                                    i12 = i13;
                                    break;
                                }
                                u10++;
                                if (u10 == this.f46652i) {
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
                a1Var.f46663t = j10;
                a1Var.f46662s += o9;
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
                if (this.f46662s + i10 <= this.f46659p) {
                    z10 = true;
                    e2.d.b(z10);
                    this.f46662s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        e2.d.b(z10);
        this.f46662s += i10;
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
        this.f46668z = false;
        this.A = sVar;
        synchronized (this) {
            try {
                this.f46667y = false;
                if (!Objects.equals(p5, this.B)) {
                    if (((SparseArray) this.f46648c.f298c).size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        SparseArray sparseArray = (SparseArray) this.f46648c.f298c;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).f46887a.equals(p5)) {
                            SparseArray sparseArray2 = (SparseArray) this.f46648c.f298c;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f46887a;
                            boolean z12 = this.D;
                            b2.s sVar2 = this.B;
                            this.D = z12 & b2.r0.a(sVar2.f2397r, sVar2.f2390k);
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = p5;
                    boolean z122 = this.D;
                    b2.s sVar22 = this.B;
                    this.D = z122 & b2.r0.a(sVar22.f2397r, sVar22.f2390k);
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f46650f;
        if (r52 != 0 && z11) {
            r52.b();
        }
    }

    @Override
    public void c(long r13, int r15, int r16, int r17, c3.g0 r18) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a1.c(long, int, int, int, c3.g0):void");
    }

    @Override
    public final void d(int i10, e2.v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        ho0 ho0Var = this.f46646a;
        int c10 = ho0Var.c(i10);
        x0 x0Var = (x0) ho0Var.f26805g;
        y2.a aVar = (y2.a) x0Var.f46884c;
        int read = kVar.read(aVar.f49504a, ((int) (ho0Var.f26801b - x0Var.f46882a)) + aVar.f49505b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = ho0Var.f26801b + read;
        ho0Var.f26801b = j3;
        x0 x0Var2 = (x0) ho0Var.f26805g;
        if (j3 == x0Var2.f46883b) {
            ho0Var.f26805g = (x0) x0Var2.d;
        }
        return read;
    }

    @Override
    public final void f(e2.v vVar, int i10, int i11) {
        while (true) {
            ho0 ho0Var = this.f46646a;
            if (i10 > 0) {
                int c10 = ho0Var.c(i10);
                x0 x0Var = (x0) ho0Var.f26805g;
                y2.a aVar = (y2.a) x0Var.f46884c;
                vVar.h(((int) (ho0Var.f26801b - x0Var.f46882a)) + aVar.f49505b, c10, aVar.f49504a);
                i10 -= c10;
                long j3 = ho0Var.f26801b + c10;
                ho0Var.f26801b = j3;
                x0 x0Var2 = (x0) ho0Var.f26805g;
                if (j3 == x0Var2.f46883b) {
                    ho0Var.f26805g = (x0) x0Var2.d;
                }
            } else {
                ho0Var.getClass();
                return;
            }
        }
    }

    public final synchronized void g(long r9, int r11, long r12, int r14, c3.g0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a1.g(long, int, long, int, c3.g0):void");
    }

    public final int h(long j3) {
        int i10 = this.f46659p;
        int u10 = u(i10 - 1);
        while (i10 > this.f46662s && this.f46657n[u10] >= j3) {
            i10--;
            u10--;
            if (u10 == -1) {
                u10 = this.f46652i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        int i11;
        this.f46664u = Math.max(this.f46664u, s(i10));
        this.f46659p -= i10;
        int i12 = this.f46660q + i10;
        this.f46660q = i12;
        int i13 = this.f46661r + i10;
        this.f46661r = i13;
        int i14 = this.f46652i;
        if (i13 >= i14) {
            this.f46661r = i13 - i14;
        }
        int i15 = this.f46662s - i10;
        this.f46662s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f46662s = 0;
        }
        a5.a aVar = this.f46648c;
        SparseArray sparseArray = (SparseArray) aVar.f298c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = aVar.f297b;
            if (i18 > 0) {
                aVar.f297b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f46659p == 0) {
            int i19 = this.f46661r;
            if (i19 == 0) {
                i19 = this.f46652i;
            }
            return this.f46654k[i19 - 1] + this.f46655l[i11];
        }
        return this.f46654k[this.f46661r];
    }

    public final void j(long j3, boolean z10) {
        Throwable th2;
        ho0 ho0Var = this.f46646a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f46659p;
                    long j10 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f46657n;
                        int i11 = this.f46661r;
                        if (j3 >= jArr[i11]) {
                            if (z10) {
                                try {
                                    int i12 = this.f46662s;
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
                            ho0Var.b(j10);
                        }
                    }
                    ho0Var.b(j10);
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
        ho0 ho0Var = this.f46646a;
        synchronized (this) {
            int i11 = this.f46659p;
            if (i11 == 0) {
                i10 = -1;
            } else {
                i10 = i(i11);
            }
        }
        ho0Var.b(i10);
    }

    public final void l(long j3) {
        boolean z10;
        if (this.f46659p == 0) {
            return;
        }
        if (j3 > r()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        n(this.f46660q + h(j3));
    }

    public final long m(int i10) {
        boolean z10;
        int i11;
        int u10;
        int i12 = this.f46660q;
        int i13 = this.f46659p;
        int i14 = (i12 + i13) - i10;
        boolean z11 = false;
        if (i14 >= 0 && i14 <= i13 - this.f46662s) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i15 = this.f46659p - i14;
        this.f46659p = i15;
        this.v = Math.max(this.f46664u, s(i15));
        if (i14 == 0 && this.f46665w) {
            z11 = true;
        }
        this.f46665w = z11;
        a5.a aVar = this.f46648c;
        SparseArray sparseArray = (SparseArray) aVar.f298c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((org.telegram.ui.web.n) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i11 = Math.min(aVar.f297b, sparseArray.size() - 1);
        } else {
            i11 = -1;
        }
        aVar.f297b = i11;
        int i16 = this.f46659p;
        if (i16 != 0) {
            return this.f46654k[u(i16 - 1)] + this.f46655l[u10];
        }
        return 0L;
    }

    public final void n(int i10) {
        boolean z10;
        long m10 = m(i10);
        ho0 ho0Var = this.f46646a;
        int i11 = ho0Var.f26800a;
        if (m10 <= ho0Var.f26801b) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ho0Var.f26801b = m10;
        if (m10 != 0) {
            x0 x0Var = (x0) ho0Var.f26803e;
            if (m10 != x0Var.f46882a) {
                while (ho0Var.f26801b > x0Var.f46883b) {
                    x0Var = (x0) x0Var.d;
                }
                x0 x0Var2 = (x0) x0Var.d;
                x0Var2.getClass();
                ho0Var.a(x0Var2);
                x0 x0Var3 = new x0(x0Var.f46883b, i11);
                x0Var.d = x0Var3;
                if (ho0Var.f26801b == x0Var.f46883b) {
                    x0Var = x0Var3;
                }
                ho0Var.f26805g = x0Var;
                if (((x0) ho0Var.f26804f) == x0Var2) {
                    ho0Var.f26804f = x0Var3;
                    return;
                }
                return;
            }
        }
        ho0Var.a((x0) ho0Var.f26803e);
        x0 x0Var4 = new x0(ho0Var.f26801b, i11);
        ho0Var.f26803e = x0Var4;
        ho0Var.f26804f = x0Var4;
        ho0Var.f26805g = x0Var4;
    }

    public final int o(long j3, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f46657n[i10] > j3 ? 1 : (this.f46657n[i10] == j3 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f46656m[i10] & 1) != 0) {
                if (i14 == 0) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f46652i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b2.s p(b2.s sVar) {
        if (this.F != 0 && sVar.f2401w != Long.MAX_VALUE) {
            b2.r a2 = sVar.a();
            a2.v = sVar.f2401w + this.F;
            return new b2.s(a2);
        }
        return sVar;
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.f46664u, s(this.f46662s));
    }

    public final long s(int i10) {
        long j3 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int u10 = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.f46657n[u10]);
            if ((this.f46656m[u10] & 1) != 0) {
                return j3;
            }
            u10--;
            if (u10 == -1) {
                u10 = this.f46652i - 1;
            }
        }
        return j3;
    }

    public final int t() {
        return this.f46660q + this.f46662s;
    }

    public final int u(int i10) {
        int i11 = this.f46661r + i10;
        int i12 = this.f46652i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    public final synchronized int v(long j3, boolean z10) {
        boolean z11;
        try {
            try {
                int u10 = u(this.f46662s);
                int i10 = this.f46662s;
                int i11 = this.f46659p;
                if (i10 != i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 || j3 < this.f46657n[u10]) {
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
        if (this.f46667y) {
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
        if (this.f46662s != this.f46659p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (z10 || this.f46665w || ((sVar = this.B) != null && sVar != this.f46651g)) {
                z12 = true;
            }
            return z12;
        } else if (((y0) this.f46648c.l(t())).f46887a != this.f46651g) {
            return true;
        } else {
            return y(u(this.f46662s));
        }
    }

    public final boolean y(int i10) {
        n2.g gVar = this.h;
        if (gVar != null && gVar.e() != 4) {
            if ((this.f46656m[i10] & 1073741824) != 0 || !this.h.d()) {
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
