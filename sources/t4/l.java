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
import org.telegram.ui.Components.tp0;
public final class l implements o4.t, u4.q {
    public final k3.k B;
    public final o2.i C = new o2.i(this, 19);
    public o4.s D;
    public int E;
    public t0 F;
    public r[] G;
    public r[] H;
    public int I;
    public o2.i J;
    public final j f44568a;
    public final u4.c f44569b;
    public final o3.c f44570c;
    public final v0 d;
    public final o3.p e;
    public final o3.m f44571f;
    public final z9.d h;
    public final e0 f44572n;
    public final g5.q f44573r;
    public final IdentityHashMap f44574s;
    public final tp0 v;
    public final h7.u f44575w;
    public final boolean f44576x;
    public final int f44577y;

    public l(j jVar, u4.c cVar, o3.c cVar2, v0 v0Var, o3.p pVar, o3.m mVar, z9.d dVar, e0 e0Var, g5.q qVar, h7.u uVar, boolean z4, int i10, k3.k kVar) {
        this.f44568a = jVar;
        this.f44569b = cVar;
        this.f44570c = cVar2;
        this.d = v0Var;
        this.e = pVar;
        this.f44571f = mVar;
        this.h = dVar;
        this.f44572n = e0Var;
        this.f44573r = qVar;
        this.f44575w = uVar;
        this.f44576x = z4;
        this.f44577y = i10;
        this.B = kVar;
        uVar.getClass();
        this.J = new o2.i(new n0[0], 1);
        this.f44574s = new IdentityHashMap();
        this.v = new tp0();
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
            p10 = n0Var2.f8722r;
            cVar = n0Var2.f8723s;
            i11 = n0Var2.P;
            i10 = n0Var2.d;
            i12 = n0Var2.e;
            str = n0Var2.f8719c;
            str2 = n0Var2.f8718b;
        } else {
            p10 = d0.p(1, n0Var.f8722r);
            cVar = n0Var.f8723s;
            if (z4) {
                i11 = n0Var.P;
                i10 = n0Var.d;
                i12 = n0Var.e;
                str = n0Var.f8719c;
                str2 = n0Var.f8718b;
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
            i13 = n0Var.f8720f;
        } else {
            i13 = -1;
        }
        if (z4) {
            i14 = n0Var.h;
        }
        m0 m0Var = new m0();
        m0Var.f8655a = n0Var.f8717a;
        m0Var.f8656b = str2;
        m0Var.f8665n = n0Var.B;
        m0Var.f8666o = c3;
        m0Var.h = p10;
        m0Var.f8660i = cVar;
        m0Var.f8658f = i13;
        m0Var.f8659g = i14;
        m0Var.B = i11;
        m0Var.d = i10;
        m0Var.e = i12;
        m0Var.f8657c = str;
        return new j3.n0(m0Var);
    }

    @Override
    public final long H() {
        return this.J.H();
    }

    @Override
    public final void J(o4.s r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.J(o4.s, long):void");
    }

    @Override
    public final long Y(f5.c[] r38, boolean[] r39, o4.l0[] r40, boolean[] r41, long r42) {
        throw new UnsupportedOperationException("Method not decompiled: t4.l.Y(f5.c[], boolean[], o4.l0[], boolean[], long):long");
    }

    @Override
    public final void a() {
        r[] rVarArr;
        for (r rVar : this.G) {
            g5.m0 m0Var = rVar.f44618s;
            ArrayList arrayList = rVar.f44621y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) s8.l.h(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.X = true;
                } else if (b10 == 2 && !rVar.f44611g0 && m0Var.d()) {
                    m0Var.b();
                }
            }
        }
        this.D.X1(this);
    }

    @Override
    public final long a1() {
        return -9223372036854775807L;
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
        return new r(str, i10, this.C, new i(this.f44568a, this.f44569b, uriArr, n0VarArr, this.f44570c, this.d, this.v, list, this.B), map, this.f44573r, j10, n0Var, this.e, this.f44571f, this.h, this.f44572n, this.f44577y);
    }

    @Override
    public final void d0() {
        r[] rVarArr;
        for (r rVar : this.G) {
            rVar.m();
            if (rVar.f44611g0 && !rVar.Q) {
                throw r1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long j0(long j10) {
        r[] rVarArr = this.H;
        if (rVarArr.length > 0) {
            boolean p10 = rVarArr[0].p(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.H;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].p(j10, p10);
                i10++;
            }
            if (p10) {
                ((SparseArray) this.v.f29015b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void k2(long j10) {
        this.J.k2(j10);
    }

    @Override
    public final void m0(long j10) {
        r[] rVarArr;
        for (r rVar : this.H) {
            if (rVar.P && !rVar.k()) {
                int length = rVar.I.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.I[i10].h(j10, rVar.f44602a0[i10]);
                }
            }
        }
    }

    @Override
    public final boolean n0(long j10) {
        r[] rVarArr;
        if (this.F == null) {
            for (r rVar : this.G) {
                if (!rVar.Q) {
                    rVar.n0(rVar.f44606c0);
                }
            }
            return false;
        }
        return this.J.n0(j10);
    }

    @Override
    public final t0 o1() {
        t0 t0Var = this.F;
        t0Var.getClass();
        return t0Var;
    }

    @Override
    public final long y1() {
        return this.J.y1();
    }

    @Override
    public final long z(long j10, h2 h2Var) {
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
                u4.c cVar = iVar2.f44552g;
                int h = iVar2.f44561q.h();
                Uri[] uriArr = iVar2.e;
                if (h < uriArr.length && h != -1) {
                    iVar = cVar.a(uriArr[iVar2.f44561q.i()], true);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    s8.v vVar = iVar.f45107r;
                    if (!vVar.isEmpty() && iVar.f45128c) {
                        long j12 = iVar.h - cVar.f45078y;
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
}
