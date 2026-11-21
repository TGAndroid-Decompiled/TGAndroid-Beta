package x2;

import a8.xa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, b3.k {
    public int E;
    public final j2.m f60193a;
    public final j2.g f60194b;
    public final j2.c0 f60195c;
    public final qb.a d;
    public final xa f60196e;
    public final r1 f60197f;
    public final ArrayList h = new ArrayList();
    public final long f60198n;
    public final b3.p f60199r;
    public final e2.u f60200s;
    public final boolean f60201w;
    public boolean f60202x;
    public byte[] f60203y;

    public m1(j2.m mVar, j2.g gVar, j2.c0 c0Var, e2.u uVar, long j3, qb.a aVar, xa xaVar, boolean z10, c3.a aVar2) {
        b3.p pVar;
        this.f60193a = mVar;
        this.f60194b = gVar;
        this.f60195c = c0Var;
        this.f60200s = uVar;
        this.f60198n = j3;
        this.d = aVar;
        this.f60196e = xaVar;
        this.f60201w = z10;
        this.f60197f = new r1(new e2.m1("", uVar));
        if (aVar2 != null) {
            pVar = new b3.p(aVar2);
        } else {
            pVar = new b3.p("SingleSampleMediaPeriod");
        }
        this.f60199r = pVar;
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            d1 d1Var = d1VarArr[i7];
            ArrayList arrayList = this.h;
            if (d1Var != null && (uVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(d1Var);
                d1VarArr[i7] = null;
            }
            if (d1VarArr[i7] == null && uVarArr[i7] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i7] = k1Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        if (!this.f60202x) {
            b3.p pVar = this.f60199r;
            if (!pVar.d() && !pVar.c()) {
                j2.h createDataSource = this.f60194b.createDataSource();
                j2.c0 c0Var = this.f60195c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f60193a);
                this.d.getClass();
                pVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long e() {
        if (!this.f60202x && !this.f60199r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean g() {
        return this.f60199r.d();
    }

    @Override
    public final long k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i7);
                if (k1Var.f60173a == 2) {
                    k1Var.f60173a = 1;
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        boolean z10;
        IOException iOException2;
        b3.i iVar;
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.f60181b;
        u uVar = new u(l1Var.f60180a, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        String str = h2.l0.f13812a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17198a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        int i10 = (min > (-9223372036854775807L) ? 1 : (min == (-9223372036854775807L) ? 0 : -1));
        if (i10 != 0 && i7 < 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f60201w && z10) {
            iOException2 = iOException;
            h2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f60202x = true;
            iVar = b3.p.f2924e;
        } else {
            iOException2 = iOException;
            if (i10 != 0) {
                iVar = new b3.i(0, min, false);
            } else {
                iVar = b3.p.f2925f;
            }
        }
        this.f60196e.q(uVar, 1, -1, this.f60200s, 0, null, 0L, this.f60198n, iOException2, !iVar.a());
        return iVar;
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.f60181b;
        u uVar = new u(l1Var.f60180a, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        this.d.getClass();
        this.f60196e.o(uVar, 1, -1, null, 0, null, 0L, this.f60198n);
    }

    @Override
    public final r1 q() {
        return this.f60197f;
    }

    @Override
    public final long r() {
        if (this.f60202x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        u uVar;
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.f60181b;
        if (i7 == 0) {
            uVar = new u(l1Var.f60180a, j3);
        } else {
            uVar = new u(l1Var.f60180a, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        }
        this.f60196e.u(uVar, 1, -1, this.f60200s, 0, null, 0L, this.f60198n, i7);
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        d0Var.m(this);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        l1 l1Var = (l1) mVar;
        this.E = (int) l1Var.f60181b.f17177b;
        byte[] bArr = l1Var.f60182c;
        bArr.getClass();
        this.f60203y = bArr;
        this.f60202x = true;
        j2.b0 b0Var = l1Var.f60181b;
        u uVar = new u(l1Var.f60180a, b0Var.f17178c, b0Var.d, j3, j10, this.E);
        this.d.getClass();
        this.f60196e.p(uVar, 1, -1, this.f60200s, 0, null, 0L, this.f60198n);
    }

    @Override
    public final void i() {
    }

    @Override
    public final void n(long j3) {
    }

    @Override
    public final void u(long j3) {
    }

    @Override
    public final long f(long j3, l2.p1 p1Var) {
        return j3;
    }
}
