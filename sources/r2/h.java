package r2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c8.l1;
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
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.nd0;
import org.telegram.utils.twidget.w;
import s2.x;
public final class h {
    public final c f56475a;
    public final j2.h f56476b;
    public final j2.h f56477c;
    public final i5 d;
    public final x[] f56478e;
    public final u[] f56479f;
    public final s2.d f56480g;
    public final m1 h;
    public final List f56481i;
    public final m2.i f56483k;
    public boolean f56484l;
    public x2.b f56486n;
    public Uri f56487o;
    public Uri f56488p;
    public boolean f56489q;
    public a3.u f56490r;
    public final nd0 f56482j = new nd0(9);
    public byte[] f56485m = l0.f13779b;
    public long f56491s = -9223372036854775807L;

    public h(c cVar, s2.d dVar, x[] xVarArr, u[] uVarArr, i5 i5Var, c0 c0Var, i5 i5Var2, List list, m2.i iVar) {
        this.f56475a = cVar;
        this.f56480g = dVar;
        this.f56478e = xVarArr;
        this.f56479f = uVarArr;
        this.d = i5Var2;
        this.f56481i = list;
        this.f56483k = iVar;
        j2.h createDataSource = ((j2.g) i5Var.f29095a).createDataSource();
        this.f56476b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f56477c = ((j2.g) i5Var.f29095a).createDataSource();
        this.h = new m1("", uVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < xVarArr.length; i7++) {
            if ((uVarArr[i7].f10747f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        m1 m1Var = this.h;
        int[] f10 = l1.f(arrayList);
        ?? dVar2 = new a3.d(m1Var, f10);
        dVar2.f56471g = dVar2.b(m1Var.d[f10[0]]);
        this.f56490r = dVar2;
    }

    public static g f(s2.n nVar, long j3, int i7) {
        long j10 = nVar.f56958k;
        i0 i0Var = nVar.f56966s;
        int i10 = (int) (j3 - j10);
        i0 i0Var2 = nVar.f56965r;
        if (i10 == i0Var2.size()) {
            if (i7 == -1) {
                i7 = 0;
            }
            if (i7 < i0Var.size()) {
                return new g((s2.l) i0Var.get(i7), j3, i7);
            }
            return null;
        }
        s2.k kVar = (s2.k) i0Var2.get(i10);
        if (i7 == -1) {
            return new g(kVar, j3, -1);
        }
        if (i7 < kVar.f56939y.size()) {
            return new g((s2.l) kVar.f56939y.get(i7), j3, i7);
        }
        int i11 = i10 + 1;
        if (i11 < i0Var2.size()) {
            return new g((s2.l) i0Var2.get(i11), j3 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new g((s2.l) i0Var.get(0), j3 + 1, 0);
        }
        return null;
    }

    public final b3.h a(Uri uri) {
        x xVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        s2.d dVar = this.f56480g;
        s2.c cVar = (s2.c) dVar.d.get(uri);
        if (cVar != null) {
            xVar = cVar.f56877a;
        } else {
            xVar = null;
        }
        xVar.getClass();
        HashMap hashMap = xVar.f57032b;
        int size = hashMap.size();
        g2 it = t0.q(hashMap.values()).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            s2.c cVar2 = (s2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                s2.b bVar = (s2.b) p5.c.i(cVar2.f56878b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f56872r) {
                    i7++;
                }
            }
        }
        return new b3.h(size, i7, this.f56490r.length(), d(elapsedRealtime));
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
        int length = hVar.f56490r.length();
        y2.m[] mVarArr = new y2.m[length];
        boolean z11 = false;
        int i7 = 0;
        while (i7 < length) {
            int i10 = hVar.f56490r.i(i7);
            Uri c10 = hVar.f56478e[i10].c();
            s2.d dVar = hVar.f56480g;
            if (!dVar.f(c10)) {
                mVarArr[i7] = y2.m.C;
            } else {
                s2.n b10 = dVar.b(c10, z11);
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
                long j11 = b10.f56958k;
                i0 i0Var = b10.f56966s;
                i0 i0Var2 = b10.f56965r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            s2.k kVar = (s2.k) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(kVar);
                            } else if (intValue < kVar.f56939y.size()) {
                                i0 i0Var3 = kVar.f56939y;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f56961n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f13995b;
                    list = s1.f14058e;
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
            s2.n b10 = this.f56480g.b(iVar.f56498y, false);
            b10.getClass();
            i0 i0Var2 = b10.f56965r;
            int i10 = (int) (iVar.f60835s - b10.f56958k);
            if (i10 >= 0) {
                if (i10 < i0Var2.size()) {
                    i0Var = ((s2.k) i0Var2.get(i10)).f56939y;
                } else {
                    i0Var = b10.f56966s;
                }
                if (i7 < i0Var.size()) {
                    s2.i iVar2 = (s2.i) i0Var.get(i7);
                    if (iVar2.f56934y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(h2.e.f(b10.f56989a, iVar2.f56940a)), iVar.f60810b.f17276a)) {
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
        a3.u uVar = this.f56490r;
        int length = uVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = uVar.i(i10);
            if (!uVar.a(i10, j3)) {
                if (!this.f56480g.e(this.f56478e[i11], j3)) {
                }
            }
            i7++;
        }
        return i7;
    }

    public final android.util.Pair e(r2.i r17, boolean r18, s2.n r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: r2.h.e(r2.i, boolean, s2.n, long, long):android.util.Pair");
    }

    public final d g(Uri uri, int i7, boolean z10) {
        if (uri == null) {
            return null;
        }
        nd0 nd0Var = this.f56482j;
        byte[] bArr = (byte[]) ((w) nd0Var.f37766b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((w) nd0Var.f37766b).put(uri, bArr);
            return null;
        }
        j2.m mVar = new j2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        u uVar = this.f56479f[i7];
        int o4 = this.f56490r.o();
        Object r10 = this.f56490r.r();
        byte[] bArr3 = this.f56485m;
        ?? fVar = new y2.f(this.f56477c, mVar, 3, uVar, o4, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = l0.f13779b;
        }
        fVar.f56467s = bArr3;
        return fVar;
    }
}
