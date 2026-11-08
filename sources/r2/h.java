package r2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c8.e1;
import e2.m1;
import e2.u;
import h2.m0;
import h9.g0;
import h9.h2;
import h9.i0;
import h9.t0;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.vy;
import org.telegram.utils.twidget.v;
import s2.w;
public final class h {
    public final c f54297a;
    public final j2.h f54298b;
    public final j2.h f54299c;
    public final org.telegram.ui.Components.n d;
    public final w[] f54300e;
    public final u[] f54301f;
    public final s2.d f54302g;
    public final m1 h;
    public final List f54303i;
    public final m2.j f54305k;
    public boolean f54306l;
    public x2.b f54308n;
    public Uri f54309o;
    public Uri f54310p;
    public boolean f54311q;
    public a3.u f54312r;
    public final vy f54304j = new vy(12);
    public byte[] f54307m = m0.f14113b;
    public long f54313s = -9223372036854775807L;

    public h(c cVar, s2.d dVar, w[] wVarArr, u[] uVarArr, org.telegram.ui.Components.n nVar, d0 d0Var, org.telegram.ui.Components.n nVar2, List list, m2.j jVar) {
        this.f54297a = cVar;
        this.f54302g = dVar;
        this.f54300e = wVarArr;
        this.f54301f = uVarArr;
        this.d = nVar2;
        this.f54303i = list;
        this.f54305k = jVar;
        j2.h createDataSource = ((j2.g) nVar.f36175a).createDataSource();
        this.f54298b = createDataSource;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        this.f54299c = ((j2.g) nVar.f36175a).createDataSource();
        this.h = new m1("", uVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < wVarArr.length; i7++) {
            if ((uVarArr[i7].f10603f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        m1 m1Var = this.h;
        int[] f10 = e1.f(arrayList);
        ?? dVar2 = new a3.d(m1Var, f10);
        dVar2.f54293g = dVar2.b(m1Var.d[f10[0]]);
        this.f54312r = dVar2;
    }

    public static g f(s2.m mVar, long j3, int i7) {
        long j10 = mVar.f54693k;
        i0 i0Var = mVar.f54701s;
        int i10 = (int) (j3 - j10);
        i0 i0Var2 = mVar.f54700r;
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
        if (i7 < jVar.f54674y.size()) {
            return new g((s2.k) jVar.f54674y.get(i7), j3, i7);
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
        s2.d dVar = this.f54302g;
        s2.c cVar = (s2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f54615a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f54767b;
        int size = hashMap.size();
        h2 it = t0.q(hashMap.values()).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            s2.c cVar2 = (s2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                s2.b bVar = (s2.b) f1.l(cVar2.f54616b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f54610r) {
                    i7++;
                }
            }
        }
        return new b3.h(size, i7, this.f54312r.length(), d(elapsedRealtime));
    }

    public final y2.m[] b(i iVar, long j3) {
        int a10;
        boolean z9;
        List list;
        h hVar = this;
        i iVar2 = iVar;
        if (iVar2 == null) {
            a10 = -1;
        } else {
            a10 = hVar.h.a(iVar2.d);
        }
        int length = hVar.f54312r.length();
        y2.m[] mVarArr = new y2.m[length];
        boolean z10 = false;
        int i7 = 0;
        while (i7 < length) {
            int i10 = hVar.f54312r.i(i7);
            Uri c10 = hVar.f54300e[i10].c();
            s2.d dVar = hVar.f54302g;
            if (!dVar.f(c10)) {
                mVarArr[i7] = y2.m.C;
            } else {
                s2.m b10 = dVar.b(c10, z10);
                b10.getClass();
                long j10 = b10.h - dVar.I;
                if (i10 != a10) {
                    z9 = true;
                } else {
                    z9 = z10;
                }
                Pair e10 = hVar.e(iVar2, z9, b10, j10, j3);
                long longValue = ((Long) e10.first).longValue();
                int intValue = ((Integer) e10.second).intValue();
                long j11 = b10.f54693k;
                i0 i0Var = b10.f54701s;
                i0 i0Var2 = b10.f54700r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            s2.j jVar = (s2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar);
                            } else if (intValue < jVar.f54674y.size()) {
                                i0 i0Var3 = jVar.f54674y;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f54696n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f14329b;
                    list = t1.f14397e;
                }
                mVarArr[i7] = new e(j10, list);
            }
            i7++;
            hVar = this;
            iVar2 = iVar;
            z10 = false;
        }
        return mVarArr;
    }

    public final int c(i iVar) {
        i0 i0Var;
        int i7 = iVar.E;
        if (i7 != -1) {
            s2.m b10 = this.f54302g.b(iVar.f54319y, false);
            b10.getClass();
            i0 i0Var2 = b10.f54700r;
            int i10 = (int) (iVar.f58921s - b10.f54693k);
            if (i10 >= 0) {
                if (i10 < i0Var2.size()) {
                    i0Var = ((s2.j) i0Var2.get(i10)).f54674y;
                } else {
                    i0Var = b10.f54701s;
                }
                if (i7 < i0Var.size()) {
                    s2.h hVar = (s2.h) i0Var.get(i7);
                    if (hVar.f54669y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(h2.e.f(b10.f54724a, hVar.f54675a)), iVar.f58896b.f16449a)) {
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
        a3.u uVar = this.f54312r;
        int length = uVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = uVar.i(i10);
            if (!uVar.a(i10, j3)) {
                if (!this.f54302g.e(this.f54300e[i11], j3)) {
                }
            }
            i7++;
        }
        return i7;
    }

    public final android.util.Pair e(r2.i r17, boolean r18, s2.m r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: r2.h.e(r2.i, boolean, s2.m, long, long):android.util.Pair");
    }

    public final d g(Uri uri, int i7, boolean z9) {
        if (uri == null) {
            return null;
        }
        vy vyVar = this.f54304j;
        byte[] bArr = (byte[]) ((v) vyVar.f39747b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((v) vyVar.f39747b).put(uri, bArr);
            return null;
        }
        j2.m mVar = new j2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        u uVar = this.f54301f[i7];
        int o4 = this.f54312r.o();
        Object r10 = this.f54312r.r();
        byte[] bArr3 = this.f54307m;
        ?? fVar = new y2.f(this.f54299c, mVar, 3, uVar, o4, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = m0.f14113b;
        }
        fVar.f54289s = bArr3;
        return fVar;
    }
}
