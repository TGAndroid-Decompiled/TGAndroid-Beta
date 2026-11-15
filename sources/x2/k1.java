package x2;

import a8.xa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class k1 implements d0, b3.j {
    public int E;
    public final j2.m f59572a;
    public final j2.g f59573b;
    public final j2.c0 f59574c;
    public final qb.a d;
    public final xa f59575e;
    public final q1 f59576f;
    public final ArrayList h = new ArrayList();
    public final long f59577n;
    public final b3.o f59578r;
    public final e2.u f59579s;
    public final boolean f59580w;
    public boolean f59581x;
    public byte[] f59582y;

    public k1(j2.m mVar, j2.g gVar, j2.c0 c0Var, e2.u uVar, long j3, qb.a aVar, xa xaVar, boolean z10, c3.a aVar2) {
        b3.o oVar;
        this.f59572a = mVar;
        this.f59573b = gVar;
        this.f59574c = c0Var;
        this.f59579s = uVar;
        this.f59577n = j3;
        this.d = aVar;
        this.f59575e = xaVar;
        this.f59580w = z10;
        this.f59576f = new q1(new e2.m1("", uVar));
        if (aVar2 != null) {
            oVar = new b3.o(aVar2);
        } else {
            oVar = new b3.o("SingleSampleMediaPeriod");
        }
        this.f59578r = oVar;
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            b1 b1Var = b1VarArr[i7];
            ArrayList arrayList = this.h;
            if (b1Var != null && (uVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(b1Var);
                b1VarArr[i7] = null;
            }
            if (b1VarArr[i7] == null && uVarArr[i7] != null) {
                i1 i1Var = new i1(this);
                arrayList.add(i1Var);
                b1VarArr[i7] = i1Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        if (!this.f59581x) {
            b3.o oVar = this.f59578r;
            if (!oVar.d() && !oVar.c()) {
                j2.h createDataSource = this.f59573b.createDataSource();
                j2.c0 c0Var = this.f59574c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                j1 j1Var = new j1(createDataSource, this.f59572a);
                this.d.getClass();
                oVar.f(j1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long e() {
        if (!this.f59581x && !this.f59578r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean g() {
        return this.f59578r.d();
    }

    @Override
    public final long j(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                i1 i1Var = (i1) arrayList.get(i7);
                if (i1Var.f59558a == 2) {
                    i1Var.f59558a = 1;
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        boolean z10;
        IOException iOException2;
        b3.i iVar;
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.f59565b;
        t tVar = new t(j1Var.f59564a, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        String str = h2.l0.f13471a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16791a == 2008)) {
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
        if (this.f59580w && z10) {
            iOException2 = iOException;
            h2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f59581x = true;
            iVar = b3.o.f2917e;
        } else {
            iOException2 = iOException;
            if (i10 != 0) {
                iVar = new b3.i(0, min, false);
            } else {
                iVar = b3.o.f2918f;
            }
        }
        this.f59575e.p(tVar, 1, -1, this.f59579s, 0, null, 0L, this.f59577n, iOException2, !iVar.a());
        return iVar;
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.f59565b;
        t tVar = new t(j1Var.f59564a, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.d.getClass();
        this.f59575e.n(tVar, 1, -1, null, 0, null, 0L, this.f59577n);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final q1 p() {
        return this.f59576f;
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        t tVar;
        j1 j1Var = (j1) lVar;
        j2.b0 b0Var = j1Var.f59565b;
        if (i7 == 0) {
            tVar = new t(j1Var.f59564a, j3);
        } else {
            tVar = new t(j1Var.f59564a, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.f59575e.s(tVar, 1, -1, this.f59579s, 0, null, 0L, this.f59577n, i7);
    }

    @Override
    public final long s() {
        if (this.f59581x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        c0Var.k(this);
    }

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        j1 j1Var = (j1) lVar;
        this.E = (int) j1Var.f59565b.f16770b;
        byte[] bArr = j1Var.f59566c;
        bArr.getClass();
        this.f59582y = bArr;
        this.f59581x = true;
        j2.b0 b0Var = j1Var.f59565b;
        t tVar = new t(j1Var.f59564a, b0Var.f16771c, b0Var.d, j3, j10, this.E);
        this.d.getClass();
        this.f59575e.o(tVar, 1, -1, this.f59579s, 0, null, 0L, this.f59577n);
    }

    @Override
    public final void i() {
    }

    @Override
    public final void l(long j3) {
    }

    @Override
    public final void u(long j3) {
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        return j3;
    }
}
