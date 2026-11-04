package w2;

import b8.kg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, a3.k {
    public int E;
    public final i2.n f57145a;
    public final i2.g f57146b;
    public final i2.d0 f57147c;
    public final kb.a d;
    public final kg f57148e;
    public final r1 f57149f;
    public final ArrayList h = new ArrayList();
    public final long f57150n;
    public final a3.q f57151r;
    public final d2.v f57152s;
    public final boolean f57153w;
    public boolean f57154x;
    public byte[] f57155y;

    public m1(i2.n nVar, i2.g gVar, i2.d0 d0Var, d2.v vVar, long j10, kb.a aVar, kg kgVar, boolean z10, b3.a aVar2) {
        a3.q qVar;
        this.f57145a = nVar;
        this.f57146b = gVar;
        this.f57147c = d0Var;
        this.f57152s = vVar;
        this.f57150n = j10;
        this.d = aVar;
        this.f57148e = kgVar;
        this.f57153w = z10;
        this.f57149f = new r1(new d2.o1("", vVar));
        if (aVar2 != null) {
            qVar = new a3.q(aVar2);
        } else {
            qVar = new a3.q("SingleSampleMediaPeriod");
        }
        this.f57151r = qVar;
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        u uVar;
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.f57133b;
        if (i3 == 0) {
            uVar = new u(l1Var.f57132a, j10);
        } else {
            uVar = new u(l1Var.f57132a, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.f57148e.u(uVar, 1, -1, this.f57152s, 0, null, 0L, this.f57150n, i3);
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        if (!this.f57154x) {
            a3.q qVar = this.f57151r;
            if (!qVar.d() && !qVar.c()) {
                i2.h createDataSource = this.f57146b.createDataSource();
                i2.d0 d0Var = this.f57147c;
                if (d0Var != null) {
                    createDataSource.addTransferListener(d0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f57145a);
                this.d.getClass();
                qVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return this.f57151r.d();
    }

    @Override
    public final long e() {
        if (!this.f57154x && !this.f57151r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        l1 l1Var = (l1) mVar;
        this.E = (int) l1Var.f57133b.f14528b;
        byte[] bArr = l1Var.f57134c;
        bArr.getClass();
        this.f57155y = bArr;
        this.f57154x = true;
        i2.c0 c0Var = l1Var.f57133b;
        u uVar = new u(l1Var.f57132a, c0Var.f14529c, c0Var.d, j10, j11, this.E);
        this.d.getClass();
        this.f57148e.q(uVar, 1, -1, this.f57152s, 0, null, 0L, this.f57150n);
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        d0Var.b(this);
    }

    @Override
    public final long j(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i3);
                if (k1Var.f57125a == 2) {
                    k1Var.f57125a = 1;
                }
                i3++;
            } else {
                return j10;
            }
        }
    }

    @Override
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        boolean z10;
        IOException iOException2;
        a3.i iVar;
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.f57133b;
        u uVar = new u(l1Var.f57132a, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        String str = g2.n0.f11873a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof d2.v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).f14552a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        int i10 = (min > (-9223372036854775807L) ? 1 : (min == (-9223372036854775807L) ? 0 : -1));
        if (i10 != 0 && i3 < 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f57153w && z10) {
            iOException2 = iOException;
            g2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f57154x = true;
            iVar = a3.q.f105e;
        } else {
            iOException2 = iOException;
            if (i10 != 0) {
                iVar = new a3.i(0, min, false);
            } else {
                iVar = a3.q.f106f;
            }
        }
        this.f57148e.r(uVar, 1, -1, this.f57152s, 0, null, 0L, this.f57150n, iOException2, !iVar.a());
        return iVar;
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final r1 p() {
        return this.f57149f;
    }

    @Override
    public final long q() {
        if (this.f57154x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        l1 l1Var = (l1) mVar;
        i2.c0 c0Var = l1Var.f57133b;
        u uVar = new u(l1Var.f57132a, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.d.getClass();
        this.f57148e.p(uVar, 1, -1, null, 0, null, 0L, this.f57150n);
    }

    @Override
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        for (int i3 = 0; i3 < pVarArr.length; i3++) {
            d1 d1Var = d1VarArr[i3];
            ArrayList arrayList = this.h;
            if (d1Var != null && (pVarArr[i3] == null || !zArr[i3])) {
                arrayList.remove(d1Var);
                d1VarArr[i3] = null;
            }
            if (d1VarArr[i3] == null && pVarArr[i3] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i3] = k1Var;
                zArr2[i3] = true;
            }
        }
        return j10;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void l(long j10) {
    }

    @Override
    public final void t(long j10) {
    }

    @Override
    public final long r(long j10, k2.t1 t1Var) {
        return j10;
    }
}
