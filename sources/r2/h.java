package r2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c8.g1;
import e2.m1;
import e2.u;
import h2.l0;
import h9.g0;
import h9.g2;
import h9.i0;
import h9.s1;
import h9.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.cf;
import org.telegram.utils.twidget.v;
import s2.w;
public final class h {
    public final c f55777a;
    public final j2.h f55778b;
    public final j2.h f55779c;
    public final cf d;
    public final w[] f55780e;
    public final u[] f55781f;
    public final s2.d f55782g;
    public final m1 h;
    public final List f55783i;
    public final m2.j f55785k;
    public boolean f55786l;
    public x2.b f55788n;
    public Uri f55789o;
    public Uri f55790p;
    public boolean f55791q;
    public a3.u f55792r;
    public final ou f55784j = new ou(19);
    public byte[] f55787m = l0.f13472b;
    public long f55793s = -9223372036854775807L;

    public h(c cVar, s2.d dVar, w[] wVarArr, u[] uVarArr, cf cfVar, c0 c0Var, cf cfVar2, List list, m2.j jVar) {
        this.f55777a = cVar;
        this.f55782g = dVar;
        this.f55780e = wVarArr;
        this.f55781f = uVarArr;
        this.d = cfVar2;
        this.f55783i = list;
        this.f55785k = jVar;
        j2.h createDataSource = ((j2.g) cfVar.f33545a).createDataSource();
        this.f55778b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f55779c = ((j2.g) cfVar.f33545a).createDataSource();
        this.h = new m1("", uVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < wVarArr.length; i7++) {
            if ((uVarArr[i7].f10439f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        m1 m1Var = this.h;
        int[] f10 = g1.f(arrayList);
        ?? dVar2 = new a3.d(m1Var, f10);
        dVar2.f55773g = dVar2.b(m1Var.d[f10[0]]);
        this.f55792r = dVar2;
    }

    public static g f(s2.m mVar, long j3, int i7) {
        long j10 = mVar.f56258k;
        i0 i0Var = mVar.f56266s;
        int i10 = (int) (j3 - j10);
        i0 i0Var2 = mVar.f56265r;
        if (i10 == i0Var2.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < i0Var.size()) {
                return new g((s2.k) i0Var.get(i7), j3, i7);
            }
            return null;
        }
        s2.j jVar = (s2.j) i0Var2.get(i10);
        if (i7 == -1) {
            return new g(jVar, j3, -1);
        }
        if (i7 < jVar.f56239y.size()) {
            return new g((s2.k) jVar.f56239y.get(i7), j3, i7);
        }
        int i11 = i10 + 1;
        if (i11 < i0Var2.size()) {
            return new g((s2.k) i0Var2.get(i11), j3 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new g((s2.k) i0Var.get(0), j3 + 1, 0);
        }
        return null;
    }

    public final b3.h a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        s2.d dVar = this.f55782g;
        s2.c cVar = (s2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f56180a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f56332b;
        int size = hashMap.size();
        g2 it = t0.q(hashMap.values()).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            s2.c cVar2 = (s2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                s2.b bVar = (s2.b) r.b.i(cVar2.f56181b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f56175r) {
                    i7++;
                }
            }
        }
        return new b3.h(size, i7, this.f55792r.length(), d(elapsedRealtime));
    }

    public final y2.m[] b(i iVar, long j3) {
        int a10;
        boolean z10;
        List list;
        h hVar = this;
        i iVar2 = iVar;
        if (iVar2 == null) {
            a10 = -1;
        } else {
            a10 = hVar.h.a(iVar2.d);
        }
        int length = hVar.f55792r.length();
        y2.m[] mVarArr = new y2.m[length];
        boolean z11 = false;
        int i7 = 0;
        while (i7 < length) {
            int i10 = hVar.f55792r.i(i7);
            Uri c10 = hVar.f55780e[i10].c();
            s2.d dVar = hVar.f55782g;
            if (!dVar.f(c10)) {
                mVarArr[i7] = y2.m.C;
            } else {
                s2.m b10 = dVar.b(c10, z11);
                b10.getClass();
                long j10 = b10.h - dVar.J;
                if (i10 != a10) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair e10 = hVar.e(iVar2, z10, b10, j10, j3);
                long longValue = ((Long) e10.first).longValue();
                int intValue = ((Integer) e10.second).intValue();
                long j11 = b10.f56258k;
                i0 i0Var = b10.f56266s;
                i0 i0Var2 = b10.f56265r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            s2.j jVar = (s2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar);
                            } else if (intValue < jVar.f56239y.size()) {
                                i0 i0Var3 = jVar.f56239y;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f56261n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f13686b;
                    list = s1.f13749e;
                }
                mVarArr[i7] = new e(j10, list);
            }
            i7++;
            hVar = this;
            iVar2 = iVar;
            z11 = false;
        }
        return mVarArr;
    }

    public final int c(i iVar) {
        i0 i0Var;
        int i7 = iVar.F;
        if (i7 != -1) {
            s2.m b10 = this.f55782g.b(iVar.f55800y, false);
            b10.getClass();
            i0 i0Var2 = b10.f56265r;
            int i10 = (int) (iVar.f60141s - b10.f56258k);
            if (i10 >= 0) {
                if (i10 < i0Var2.size()) {
                    i0Var = ((s2.j) i0Var2.get(i10)).f56239y;
                } else {
                    i0Var = b10.f56266s;
                }
                if (i7 < i0Var.size()) {
                    s2.h hVar = (s2.h) i0Var.get(i7);
                    if (hVar.f56234y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(h2.e.f(b10.f56289a, hVar.f56240a)), iVar.f60116b.f16803a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final int d(long j3) {
        a3.u uVar = this.f55792r;
        int length = uVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = uVar.i(i10);
            if (!uVar.a(i10, j3)) {
                if (!this.f55782g.e(this.f55780e[i11], j3)) {
                }
            }
            i7++;
        }
        return i7;
    }

    public final android.util.Pair e(r2.i r17, boolean r18, s2.m r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: r2.h.e(r2.i, boolean, s2.m, long, long):android.util.Pair");
    }

    public final d g(Uri uri, int i7, boolean z10) {
        if (uri == null) {
            return null;
        }
        ou ouVar = this.f55784j;
        byte[] bArr = (byte[]) ((v) ouVar.f25806b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((v) ouVar.f25806b).put(uri, bArr);
            return null;
        }
        j2.m mVar = new j2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        u uVar = this.f55781f[i7];
        int o4 = this.f55792r.o();
        Object r10 = this.f55792r.r();
        byte[] bArr3 = this.f55787m;
        ?? fVar = new y2.f(this.f55779c, mVar, 3, uVar, o4, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = l0.f13472b;
        }
        fVar.f55769s = bArr3;
        return fVar;
    }
}
