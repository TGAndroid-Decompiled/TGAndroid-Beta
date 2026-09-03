package t4;

import android.net.Uri;
import android.util.SparseArray;
import b4.e0;
import g5.v0;
import h5.d0;
import j3.h2;
import j3.m0;
import j3.r1;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o4.n0;
import o4.t0;
import oh.h4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ai;
public final class l implements o4.t, u4.q {
    public final k3.k B;
    public final f1 C = new f1(this, 19);
    public o4.s D;
    public int E;
    public t0 F;
    public r[] G;
    public r[] H;
    public int I;
    public z2.d J;
    public final j f47946a;
    public final u4.c f47947b;
    public final h4 f47948c;
    public final v0 d;
    public final o3.o f47949e;
    public final o3.l f47950f;
    public final ab.a h;
    public final e0 f47951n;
    public final g5.q f47952r;
    public final IdentityHashMap f47953s;
    public final ai v;
    public final z9.d f47954w;
    public final boolean f47955x;
    public final int f47956y;

    public l(j jVar, u4.c cVar, h4 h4Var, v0 v0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, g5.q qVar, z9.d dVar, boolean z4, int i10, k3.k kVar) {
        this.f47946a = jVar;
        this.f47947b = cVar;
        this.f47948c = h4Var;
        this.d = v0Var;
        this.f47949e = oVar;
        this.f47950f = lVar;
        this.h = aVar;
        this.f47951n = e0Var;
        this.f47952r = qVar;
        this.f47954w = dVar;
        this.f47955x = z4;
        this.f47956y = i10;
        this.B = kVar;
        dVar.getClass();
        this.J = new z2.d(new n0[0]);
        this.f47953s = new IdentityHashMap();
        this.v = new ai(15);
        this.G = new r[0];
        this.H = new r[0];
    }

    public static j3.n0 l(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
        String p10;
        e4.c cVar;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14 = -1;
        if (n0Var2 != null) {
            p10 = n0Var2.f9324r;
            cVar = n0Var2.f9325s;
            i11 = n0Var2.P;
            i10 = n0Var2.d;
            i12 = n0Var2.f9321e;
            str = n0Var2.f9320c;
            str2 = n0Var2.f9319b;
        } else {
            p10 = d0.p(1, n0Var.f9324r);
            cVar = n0Var.f9325s;
            if (z4) {
                i11 = n0Var.P;
                i10 = n0Var.d;
                i12 = n0Var.f9321e;
                str = n0Var.f9320c;
                str2 = n0Var.f9319b;
            } else {
                i10 = 0;
                str = null;
                str2 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String c3 = h5.o.c(p10);
        if (z4) {
            i13 = n0Var.f9322f;
        } else {
            i13 = -1;
        }
        if (z4) {
            i14 = n0Var.h;
        }
        m0 m0Var = new m0();
        m0Var.f9253a = n0Var.f9318a;
        m0Var.f9254b = str2;
        m0Var.f9264n = n0Var.B;
        m0Var.f9265o = c3;
        m0Var.h = p10;
        m0Var.f9259i = cVar;
        m0Var.f9257f = i13;
        m0Var.f9258g = i14;
        m0Var.B = i11;
        m0Var.d = i10;
        m0Var.f9256e = i12;
        m0Var.f9255c = str;
        return new j3.n0(m0Var);
    }

    @Override
    public final void a() {
        r[] rVarArr;
        for (r rVar : this.G) {
            g5.m0 m0Var = rVar.f47999s;
            ArrayList arrayList = rVar.f48002y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) s8.l.h(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.X = true;
                } else if (b10 == 2 && !rVar.f47992g0 && m0Var.d()) {
                    m0Var.b();
                }
            }
        }
        this.D.s(this);
    }

    @Override
    public final boolean b() {
        return this.J.b();
    }

    @Override
    public final boolean c(android.net.Uri r18, p2.v r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.c(android.net.Uri, p2.v, boolean):boolean");
    }

    @Override
    public final long d(long j10, h2 h2Var) {
        u4.i iVar;
        long j11;
        r[] rVarArr = this.H;
        int length = rVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            r rVar = rVarArr[i10];
            if (rVar.N == 2) {
                i iVar2 = rVar.d;
                u4.c cVar = iVar2.f47930g;
                int h = iVar2.f47939q.h();
                Uri[] uriArr = iVar2.f47928e;
                if (h < uriArr.length && h != -1) {
                    iVar = cVar.a(uriArr[iVar2.f47939q.i()], true);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    s8.v vVar = iVar.f48329r;
                    if (!vVar.isEmpty() && iVar.f48352c) {
                        long j12 = iVar.h - cVar.f48297y;
                        long j13 = j10 - j12;
                        int c3 = d0.c(vVar, Long.valueOf(j13), true);
                        long j14 = ((u4.f) vVar.get(c3)).f48308e;
                        if (c3 != vVar.size() - 1) {
                            j11 = ((u4.f) vVar.get(c3 + 1)).f48308e;
                        } else {
                            j11 = j14;
                        }
                        return h2Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override
    public final long e() {
        return this.J.e();
    }

    @Override
    public final void f(o4.s r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.f(o4.s, long):void");
    }

    @Override
    public final long g(f5.c[] r38, boolean[] r39, o4.l0[] r40, boolean[] r41, long r42) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.g(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    public final r h(String str, int i10, Uri[] uriArr, j3.n0[] n0VarArr, j3.n0 n0Var, List list, Map map, long j10) {
        return new r(str, i10, this.C, new i(this.f47946a, this.f47947b, uriArr, n0VarArr, this.f47948c, this.d, this.v, list, this.B), map, this.f47952r, j10, n0Var, this.f47949e, this.f47950f, this.h, this.f47951n, this.f47956y);
    }

    @Override
    public final void i() {
        r[] rVarArr;
        for (r rVar : this.G) {
            rVar.B();
            if (rVar.f47992g0 && !rVar.Q) {
                throw r1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long j(long j10) {
        r[] rVarArr = this.H;
        if (rVarArr.length > 0) {
            boolean E = rVarArr[0].E(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.H;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].E(j10, E);
                i10++;
            }
            if (E) {
                ((SparseArray) this.v.f25257b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        r[] rVarArr;
        for (r rVar : this.H) {
            if (rVar.P && !rVar.z()) {
                int length = rVar.I.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.I[i10].h(j10, rVar.f47982a0[i10]);
                }
            }
        }
    }

    @Override
    public final boolean m(long j10) {
        r[] rVarArr;
        if (this.F == null) {
            for (r rVar : this.G) {
                if (!rVar.Q) {
                    rVar.m(rVar.f47986c0);
                }
            }
            return false;
        }
        return this.J.m(j10);
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final t0 o() {
        t0 t0Var = this.F;
        t0Var.getClass();
        return t0Var;
    }

    @Override
    public final long r() {
        return this.J.r();
    }

    @Override
    public final void t(long j10) {
        this.J.t(j10);
    }
}
