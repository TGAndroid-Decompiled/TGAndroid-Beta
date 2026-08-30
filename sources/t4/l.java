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
import org.telegram.ui.Components.qk0;
import ph.j5;
public final class l implements o4.t, u4.q {
    public final k3.k B;
    public final j5 C = new j5(this, 8);
    public o4.s D;
    public int E;
    public t0 F;
    public r[] G;
    public r[] H;
    public int I;
    public ja.c J;
    public final j f44506a;
    public final u4.c f44507b;
    public final qk0 f44508c;
    public final v0 d;
    public final o3.o e;
    public final o3.l f44509f;
    public final ab.a h;
    public final e0 f44510n;
    public final g5.q f44511r;
    public final IdentityHashMap f44512s;
    public final o2.o v;
    public final z9.d f44513w;
    public final boolean f44514x;
    public final int f44515y;

    public l(j jVar, u4.c cVar, qk0 qk0Var, v0 v0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, g5.q qVar, z9.d dVar, boolean z4, int i10, k3.k kVar) {
        this.f44506a = jVar;
        this.f44507b = cVar;
        this.f44508c = qk0Var;
        this.d = v0Var;
        this.e = oVar;
        this.f44509f = lVar;
        this.h = aVar;
        this.f44510n = e0Var;
        this.f44511r = qVar;
        this.f44513w = dVar;
        this.f44514x = z4;
        this.f44515y = i10;
        this.B = kVar;
        dVar.getClass();
        this.J = new ja.c(new n0[0], 22);
        this.f44512s = new IdentityHashMap();
        this.v = new o2.o(23);
        this.G = new r[0];
        this.H = new r[0];
    }

    public static j3.n0 e(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
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
            p10 = n0Var2.f8740r;
            cVar = n0Var2.f8741s;
            i11 = n0Var2.P;
            i10 = n0Var2.d;
            i12 = n0Var2.e;
            str = n0Var2.f8737c;
            str2 = n0Var2.f8736b;
        } else {
            p10 = d0.p(1, n0Var.f8740r);
            cVar = n0Var.f8741s;
            if (z4) {
                i11 = n0Var.P;
                i10 = n0Var.d;
                i12 = n0Var.e;
                str = n0Var.f8737c;
                str2 = n0Var.f8736b;
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
            i13 = n0Var.f8738f;
        } else {
            i13 = -1;
        }
        if (z4) {
            i14 = n0Var.h;
        }
        m0 m0Var = new m0();
        m0Var.f8673a = n0Var.f8735a;
        m0Var.f8674b = str2;
        m0Var.f8683n = n0Var.B;
        m0Var.f8684o = c3;
        m0Var.h = p10;
        m0Var.f8678i = cVar;
        m0Var.f8676f = i13;
        m0Var.f8677g = i14;
        m0Var.B = i11;
        m0Var.d = i10;
        m0Var.e = i12;
        m0Var.f8675c = str;
        return new j3.n0(m0Var);
    }

    @Override
    public final void B(long j10) {
        r[] rVarArr;
        for (r rVar : this.H) {
            if (rVar.P && !rVar.n()) {
                int length = rVar.I.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.I[i10].h(j10, rVar.f44540a0[i10]);
                }
            }
        }
    }

    @Override
    public final boolean C(long j10) {
        r[] rVarArr;
        if (this.F == null) {
            for (r rVar : this.G) {
                if (!rVar.Q) {
                    rVar.C(rVar.f44544c0);
                }
            }
            return false;
        }
        return this.J.C(j10);
    }

    @Override
    public final long K() {
        return -9223372036854775807L;
    }

    @Override
    public final t0 V() {
        t0 t0Var = this.F;
        t0Var.getClass();
        return t0Var;
    }

    @Override
    public final long X() {
        return this.J.X();
    }

    @Override
    public final void a() {
        r[] rVarArr;
        for (r rVar : this.G) {
            g5.m0 m0Var = rVar.f44556s;
            ArrayList arrayList = rVar.f44559y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) s8.l.h(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.X = true;
                } else if (b10 == 2 && !rVar.f44549g0 && m0Var.d()) {
                    m0Var.b();
                }
            }
        }
        this.D.Z(this);
    }

    @Override
    public final boolean b() {
        return this.J.b();
    }

    @Override
    public final boolean c(android.net.Uri r18, p2.w r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.c(android.net.Uri, p2.w, boolean):boolean");
    }

    public final r d(String str, int i10, Uri[] uriArr, j3.n0[] n0VarArr, j3.n0 n0Var, List list, Map map, long j10) {
        return new r(str, i10, this.C, new i(this.f44506a, this.f44507b, uriArr, n0VarArr, this.f44508c, this.d, this.v, list, this.B), map, this.f44511r, j10, n0Var, this.e, this.f44509f, this.h, this.f44510n, this.f44515y);
    }

    @Override
    public final void f0(long j10) {
        this.J.f0(j10);
    }

    @Override
    public final long h(long j10, h2 h2Var) {
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
                u4.c cVar = iVar2.f44490g;
                int h = iVar2.f44499q.h();
                Uri[] uriArr = iVar2.e;
                if (h < uriArr.length && h != -1) {
                    iVar = cVar.a(uriArr[iVar2.f44499q.i()], true);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    s8.v vVar = iVar.f45045r;
                    if (!vVar.isEmpty() && iVar.f45066c) {
                        long j12 = iVar.h - cVar.f45016y;
                        long j13 = j10 - j12;
                        int c3 = d0.c(vVar, Long.valueOf(j13), true);
                        long j14 = ((u4.f) vVar.get(c3)).e;
                        if (c3 != vVar.size() - 1) {
                            j11 = ((u4.f) vVar.get(c3 + 1)).e;
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
    public final long l() {
        return this.J.l();
    }

    @Override
    public final void p(o4.s r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.p(o4.s, long):void");
    }

    @Override
    public final long v(f5.c[] r38, boolean[] r39, o4.l0[] r40, boolean[] r41, long r42) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.v(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    @Override
    public final void x() {
        r[] rVarArr;
        for (r rVar : this.G) {
            rVar.q();
            if (rVar.f44549g0 && !rVar.Q) {
                throw r1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long z(long j10) {
        r[] rVarArr = this.H;
        if (rVarArr.length > 0) {
            boolean u10 = rVarArr[0].u(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.H;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].u(j10, u10);
                i10++;
            }
            if (u10) {
                ((SparseArray) this.v.f16220b).clear();
            }
        }
        return j10;
    }
}
