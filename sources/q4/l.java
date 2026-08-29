package q4;

import ag.j2;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.y0;
import f5.d0;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l4.e1;
import l4.g0;
import l4.k1;
import l4.y;
import l4.z;
import nh.d6;
public final class l implements z, r4.r {
    public final k3.k A;
    public final org.telegram.ui.Components.n B = new org.telegram.ui.Components.n(this, 11);
    public y C;
    public int D;
    public k1 E;
    public r[] F;
    public r[] G;
    public int H;
    public ha.c I;
    public final j f46286a;
    public final r4.c f46287b;
    public final o1.a f46288c;
    public final y0 d;
    public final n3.i f46289e;
    public final j2 f46290f;
    public final f7.v h;
    public final g0 f46291n;
    public final com.google.android.exoplayer2.upstream.r f46292r;
    public final IdentityHashMap f46293s;
    public final d6 v;
    public final bb.a f46294w;
    public final boolean f46295x;
    public final int f46296y;

    public l(j jVar, r4.c cVar, o1.a aVar, y0 y0Var, n3.i iVar, j2 j2Var, f7.v vVar, g0 g0Var, com.google.android.exoplayer2.upstream.r rVar, bb.a aVar2, boolean z10, int i10, k3.k kVar) {
        this.f46286a = jVar;
        this.f46287b = cVar;
        this.f46288c = aVar;
        this.d = y0Var;
        this.f46289e = iVar;
        this.f46290f = j2Var;
        this.h = vVar;
        this.f46291n = g0Var;
        this.f46292r = rVar;
        this.f46294w = aVar2;
        this.f46295x = z10;
        this.f46296y = i10;
        this.A = kVar;
        aVar2.getClass();
        this.I = new ha.c(new e1[0], 24);
        this.f46293s = new IdentityHashMap();
        this.v = new d6(18);
        this.F = new r[0];
        this.G = new r[0];
    }

    public static t0 e(t0 t0Var, t0 t0Var2, boolean z10) {
        String o10;
        b4.c cVar;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14 = -1;
        if (t0Var2 != null) {
            o10 = t0Var2.f10803r;
            cVar = t0Var2.f10804s;
            i11 = t0Var2.O;
            i10 = t0Var2.d;
            i12 = t0Var2.f10800e;
            str = t0Var2.f10799c;
            str2 = t0Var2.f10798b;
        } else {
            o10 = d0.o(1, t0Var.f10803r);
            cVar = t0Var.f10804s;
            if (z10) {
                i11 = t0Var.O;
                i10 = t0Var.d;
                i12 = t0Var.f10800e;
                str = t0Var.f10799c;
                str2 = t0Var.f10798b;
            } else {
                i10 = 0;
                str = null;
                str2 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String c3 = f5.o.c(o10);
        if (z10) {
            i13 = t0Var.f10801f;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = t0Var.h;
        }
        s0 s0Var = new s0();
        s0Var.f10730a = t0Var.f10797a;
        s0Var.f10731b = str2;
        s0Var.f10741n = t0Var.A;
        s0Var.f10742o = c3;
        s0Var.h = o10;
        s0Var.f10736i = cVar;
        s0Var.f10734f = i13;
        s0Var.f10735g = i14;
        s0Var.B = i11;
        s0Var.d = i10;
        s0Var.f10733e = i12;
        s0Var.f10732c = str;
        return new t0(s0Var);
    }

    @Override
    public final long A(d5.r[] r38, boolean[] r39, l4.c1[] r40, boolean[] r41, long r42) {
        throw new UnsupportedOperationException("Method not decompiled: q4.l.A(d5.r[], boolean[], l4.c1[], boolean[], long):long");
    }

    @Override
    public final long E() {
        return -9223372036854775807L;
    }

    @Override
    public final k1 J() {
        k1 k1Var = this.E;
        k1Var.getClass();
        return k1Var;
    }

    @Override
    public final long L() {
        return this.I.L();
    }

    @Override
    public final void U(long j10) {
        this.I.U(j10);
    }

    @Override
    public final void a() {
        r[] rVarArr;
        for (r rVar : this.F) {
            q0 q0Var = rVar.f46338s;
            ArrayList arrayList = rVar.f46341y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) q8.l.g(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.W = true;
                } else if (b10 == 2 && !rVar.f46331f0 && q0Var.d()) {
                    q0Var.b();
                }
            }
        }
        this.C.a(this);
    }

    @Override
    public final boolean b() {
        return this.I.b();
    }

    @Override
    public final boolean c(android.net.Uri r18, p2.u r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: q4.l.c(android.net.Uri, p2.u, boolean):boolean");
    }

    public final r d(String str, int i10, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j10) {
        return new r(str, i10, this.B, new i(this.f46286a, this.f46287b, uriArr, t0VarArr, this.f46288c, this.d, this.v, list, this.A), map, this.f46292r, j10, t0Var, this.f46289e, this.f46290f, this.h, this.f46291n, this.f46296y);
    }

    @Override
    public final long f(long j10, j3.j2 j2Var) {
        r4.j jVar;
        long j11;
        r[] rVarArr = this.G;
        int length = rVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            r rVar = rVarArr[i10];
            if (rVar.M == 2) {
                i iVar = rVar.d;
                r4.c cVar = iVar.f46270g;
                int c3 = iVar.f46279q.c();
                Uri[] uriArr = iVar.f46268e;
                if (c3 < uriArr.length && c3 != -1) {
                    jVar = cVar.a(uriArr[iVar.f46279q.l()], true);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    q8.z zVar = jVar.f46986r;
                    if (!zVar.isEmpty() && jVar.f47009c) {
                        long j12 = jVar.h - cVar.f46954y;
                        long j13 = j10 - j12;
                        int c6 = d0.c(zVar, Long.valueOf(j13), true);
                        long j14 = ((r4.g) zVar.get(c6)).f46965e;
                        if (c6 != zVar.size() - 1) {
                            j11 = ((r4.g) zVar.get(c6 + 1)).f46965e;
                        } else {
                            j11 = j14;
                        }
                        return j2Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override
    public final long h() {
        return this.I.h();
    }

    @Override
    public final void n(l4.y r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: q4.l.n(l4.y, long):void");
    }

    @Override
    public final void o() {
        r[] rVarArr;
        for (r rVar : this.F) {
            rVar.w();
            if (rVar.f46331f0 && !rVar.P) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long p(long j10) {
        r[] rVarArr = this.G;
        if (rVarArr.length > 0) {
            boolean z10 = rVarArr[0].z(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.G;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].z(j10, z10);
                i10++;
            }
            if (z10) {
                ((SparseArray) this.v.f17533b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void r(long j10) {
        r[] rVarArr;
        for (r rVar : this.G) {
            if (rVar.O && !rVar.u()) {
                int length = rVar.H.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.H[i10].h(j10, rVar.Z[i10]);
                }
            }
        }
    }

    @Override
    public final boolean s(long j10) {
        r[] rVarArr;
        if (this.E == null) {
            for (r rVar : this.F) {
                if (!rVar.P) {
                    rVar.s(rVar.f46324b0);
                }
            }
            return false;
        }
        return this.I.s(j10);
    }
}
