package x2;

import a8.wa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import l2.t1;
public final class l1 implements e0, b3.j {
    public int D;
    public final j2.m f58286a;
    public final j2.g f58287b;
    public final j2.d0 f58288c;
    public final pb.b d;
    public final wa f58289e;
    public final q1 f58290f;
    public final ArrayList h = new ArrayList();
    public final long f58291n;
    public final b3.o f58292r;
    public final e2.u f58293s;
    public final boolean f58294w;
    public boolean f58295x;
    public byte[] f58296y;

    public l1(j2.m mVar, j2.g gVar, j2.d0 d0Var, e2.u uVar, long j3, pb.b bVar, wa waVar, boolean z9, c3.a aVar) {
        b3.o oVar;
        this.f58286a = mVar;
        this.f58287b = gVar;
        this.f58288c = d0Var;
        this.f58293s = uVar;
        this.f58291n = j3;
        this.d = bVar;
        this.f58289e = waVar;
        this.f58294w = z9;
        this.f58290f = new q1(new e2.m1("", uVar));
        if (aVar != null) {
            oVar = new b3.o(aVar);
        } else {
            oVar = new b3.o("SingleSampleMediaPeriod");
        }
        this.f58292r = oVar;
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        u uVar;
        k1 k1Var = (k1) lVar;
        j2.c0 c0Var = k1Var.f58280b;
        if (i7 == 0) {
            uVar = new u(k1Var.f58279a, j3);
        } else {
            uVar = new u(k1Var.f58279a, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        }
        this.f58289e.t(uVar, 1, -1, this.f58293s, 0, null, 0L, this.f58291n, i7);
    }

    @Override
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < uVarArr.length; i7++) {
            c1 c1Var = c1VarArr[i7];
            ArrayList arrayList = this.h;
            if (c1Var != null && (uVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(c1Var);
                c1VarArr[i7] = null;
            }
            if (c1VarArr[i7] == null && uVarArr[i7] != null) {
                j1 j1Var = new j1(this);
                arrayList.add(j1Var);
                c1VarArr[i7] = j1Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        if (!this.f58295x) {
            b3.o oVar = this.f58292r;
            if (!oVar.d() && !oVar.c()) {
                j2.h createDataSource = this.f58287b.createDataSource();
                j2.d0 d0Var = this.f58288c;
                if (d0Var != null) {
                    createDataSource.addTransferListener(d0Var);
                }
                k1 k1Var = new k1(createDataSource, this.f58286a);
                this.d.getClass();
                oVar.f(k1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long e() {
        if (!this.f58295x && !this.f58292r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean g() {
        return this.f58292r.d();
    }

    @Override
    public final long j(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                j1 j1Var = (j1) arrayList.get(i7);
                if (j1Var.f58273a == 2) {
                    j1Var.f58273a = 1;
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final q1 o() {
        return this.f58290f;
    }

    @Override
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        boolean z9;
        IOException iOException2;
        b3.i iVar;
        k1 k1Var = (k1) lVar;
        j2.c0 c0Var = k1Var.f58280b;
        u uVar = new u(k1Var.f58279a, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        String str = h2.m0.f14112a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16434a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        int i10 = (min > (-9223372036854775807L) ? 1 : (min == (-9223372036854775807L) ? 0 : -1));
        if (i10 != 0 && i7 < 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f58294w && z9) {
            iOException2 = iOException;
            h2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f58295x = true;
            iVar = b3.o.f2960e;
        } else {
            iOException2 = iOException;
            if (i10 != 0) {
                iVar = new b3.i(0, min, false);
            } else {
                iVar = b3.o.f2961f;
            }
        }
        this.f58289e.q(uVar, 1, -1, this.f58293s, 0, null, 0L, this.f58291n, iOException2, !iVar.a());
        return iVar;
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        k1 k1Var = (k1) lVar;
        this.D = (int) k1Var.f58280b.f16413b;
        byte[] bArr = k1Var.f58281c;
        bArr.getClass();
        this.f58296y = bArr;
        this.f58295x = true;
        j2.c0 c0Var = k1Var.f58280b;
        u uVar = new u(k1Var.f58279a, c0Var.f16414c, c0Var.d, j3, j10, this.D);
        this.d.getClass();
        this.f58289e.p(uVar, 1, -1, this.f58293s, 0, null, 0L, this.f58291n);
    }

    @Override
    public final long p() {
        if (this.f58295x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        d0Var.a(this);
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        k1 k1Var = (k1) lVar;
        j2.c0 c0Var = k1Var.f58280b;
        u uVar = new u(k1Var.f58279a, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        this.d.getClass();
        this.f58289e.o(uVar, 1, -1, null, 0, null, 0L, this.f58291n);
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(long j3) {
    }

    @Override
    public final void r(long j3) {
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        return j3;
    }
}
