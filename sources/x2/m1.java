package x2;

import a8.xa;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public final class m1 implements e0, b3.k {
    public int E;
    public final j2.m f60162a;
    public final j2.g f60163b;
    public final j2.c0 f60164c;
    public final qb.a d;
    public final xa f60165e;
    public final r1 f60166f;
    public final ArrayList h = new ArrayList();
    public final long f60167n;
    public final b3.p f60168r;
    public final e2.u f60169s;
    public final boolean f60170w;
    public boolean f60171x;
    public byte[] f60172y;

    public m1(j2.m mVar, j2.g gVar, j2.c0 c0Var, e2.u uVar, long j3, qb.a aVar, xa xaVar, boolean z10, c3.a aVar2) {
        b3.p pVar;
        this.f60162a = mVar;
        this.f60163b = gVar;
        this.f60164c = c0Var;
        this.f60169s = uVar;
        this.f60167n = j3;
        this.d = aVar;
        this.f60165e = xaVar;
        this.f60170w = z10;
        this.f60166f = new r1(new e2.m1("", uVar));
        if (aVar2 != null) {
            pVar = new b3.p(aVar2);
        } else {
            pVar = new b3.p("SingleSampleMediaPeriod");
        }
        this.f60168r = pVar;
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
        if (!this.f60171x) {
            b3.p pVar = this.f60168r;
            if (!pVar.d() && !pVar.c()) {
                j2.h createDataSource = this.f60163b.createDataSource();
                j2.c0 c0Var = this.f60164c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f60162a);
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
        if (!this.f60171x && !this.f60168r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean g() {
        return this.f60168r.d();
    }

    @Override
    public final long k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                k1 k1Var = (k1) arrayList.get(i7);
                if (k1Var.f60142a == 2) {
                    k1Var.f60142a = 1;
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
        j2.b0 b0Var = l1Var.f60150b;
        u uVar = new u(l1Var.f60149a, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        String str = h2.l0.f13778a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).f17167a == 2008)) {
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
        if (this.f60170w && z10) {
            iOException2 = iOException;
            h2.a.m("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f60171x = true;
            iVar = b3.p.f2882e;
        } else {
            iOException2 = iOException;
            if (i10 != 0) {
                iVar = new b3.i(0, min, false);
            } else {
                iVar = b3.p.f2883f;
            }
        }
        this.f60165e.q(uVar, 1, -1, this.f60169s, 0, null, 0L, this.f60167n, iOException2, !iVar.a());
        return iVar;
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.f60150b;
        u uVar = new u(l1Var.f60149a, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        this.d.getClass();
        this.f60165e.o(uVar, 1, -1, null, 0, null, 0L, this.f60167n);
    }

    @Override
    public final r1 q() {
        return this.f60166f;
    }

    @Override
    public final long r() {
        if (this.f60171x) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        u uVar;
        l1 l1Var = (l1) mVar;
        j2.b0 b0Var = l1Var.f60150b;
        if (i7 == 0) {
            uVar = new u(l1Var.f60149a, j3);
        } else {
            uVar = new u(l1Var.f60149a, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        }
        this.f60165e.u(uVar, 1, -1, this.f60169s, 0, null, 0L, this.f60167n, i7);
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        d0Var.m(this);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        l1 l1Var = (l1) mVar;
        this.E = (int) l1Var.f60150b.f17146b;
        byte[] bArr = l1Var.f60151c;
        bArr.getClass();
        this.f60172y = bArr;
        this.f60171x = true;
        j2.b0 b0Var = l1Var.f60150b;
        u uVar = new u(l1Var.f60149a, b0Var.f17147c, b0Var.d, j3, j10, this.E);
        this.d.getClass();
        this.f60165e.p(uVar, 1, -1, this.f60169s, 0, null, 0L, this.f60167n);
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
