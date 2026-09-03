package t4;

import android.net.Uri;
import android.util.Pair;
import g5.v0;
import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k7.y7;
import o4.s0;
import oh.h4;
import org.telegram.ui.Components.ai;
import org.telegram.ui.web.e0;
import s8.i0;
public final class i {
    public final j f47925a;
    public final g5.m f47926b;
    public final g5.m f47927c;
    public final ai d;
    public final Uri[] f47928e;
    public final n0[] f47929f;
    public final u4.c f47930g;
    public final s0 h;
    public final List f47931i;
    public final k3.k f47933k;
    public boolean f47934l;
    public o4.b f47936n;
    public Uri f47937o;
    public boolean f47938p;
    public f5.c f47939q;
    public boolean f47941s;
    public final e0 f47932j = new e0(11);
    public byte[] f47935m = d0.f7241f;
    public long f47940r = -9223372036854775807L;

    public i(j jVar, u4.c cVar, Uri[] uriArr, n0[] n0VarArr, h4 h4Var, v0 v0Var, ai aiVar, List list, k3.k kVar) {
        this.f47925a = jVar;
        this.f47930g = cVar;
        this.f47928e = uriArr;
        this.f47929f = n0VarArr;
        this.d = aiVar;
        this.f47931i = list;
        this.f47933k = kVar;
        g5.m createDataSource = ((g5.l) h4Var.f17182b).createDataSource();
        this.f47926b = createDataSource;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        this.f47927c = ((g5.l) h4Var.f17182b).createDataSource();
        this.h = new s0("", n0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((n0VarArr[i10].f9321e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        s0 s0Var = this.h;
        int[] d = y7.d(arrayList);
        ?? cVar2 = new f5.c(s0Var, d);
        cVar2.f47921g = cVar2.n(s0Var.d[d[0]]);
        this.f47939q = cVar2;
    }

    public final q4.l[] a(k kVar, long j10) {
        int a2;
        boolean z4;
        List list;
        i iVar = this;
        k kVar2 = kVar;
        if (kVar2 == null) {
            a2 = -1;
        } else {
            a2 = iVar.h.a(kVar2.d);
        }
        int p10 = iVar.f47939q.p();
        q4.l[] lVarArr = new q4.l[p10];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < p10) {
            int f10 = iVar.f47939q.f(i10);
            Uri uri = iVar.f47928e[f10];
            u4.c cVar = iVar.f47930g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = q4.l.f44530z;
            } else {
                u4.i a10 = cVar.a(uri, z10);
                a10.getClass();
                long j11 = a10.h - cVar.f48297y;
                if (f10 != a2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Pair c3 = iVar.c(kVar2, z4, a10, j11, j10);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                long j12 = a10.f48322k;
                s8.v vVar = a10.f48330s;
                s8.v vVar2 = a10.f48329r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && vVar2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < vVar2.size()) {
                        if (intValue != -1) {
                            u4.f fVar = (u4.f) vVar2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(fVar);
                            } else if (intValue < fVar.f48304x.size()) {
                                s8.v vVar3 = fVar.f48304x;
                                arrayList.addAll(vVar3.subList(intValue, vVar3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(vVar2.subList(i11, vVar2.size()));
                        intValue = 0;
                    }
                    if (a10.f48325n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < vVar.size()) {
                            arrayList.addAll(vVar.subList(intValue, vVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    s8.t tVar = s8.v.f47174b;
                    list = i0.f47139e;
                }
                lVarArr[i10] = new f(j11, list);
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        s8.v vVar;
        int i10 = kVar.B;
        if (i10 != -1) {
            u4.i a2 = this.f47930g.a(this.f47928e[this.h.a(kVar.d)], false);
            a2.getClass();
            s8.v vVar2 = a2.f48329r;
            int i11 = (int) (kVar.f44529s - a2.f48322k);
            if (i11 >= 0) {
                if (i11 < vVar2.size()) {
                    vVar = ((u4.f) vVar2.get(i11)).f48304x;
                } else {
                    vVar = a2.f48330s;
                }
                if (i10 < vVar.size()) {
                    u4.d dVar = (u4.d) vVar.get(i10);
                    if (dVar.f48299x) {
                        return 0;
                    }
                    if (d0.a(Uri.parse(h5.a.G(a2.f48350a, dVar.f48305a)), kVar.f44505b.f6885a)) {
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

    public final Pair c(k kVar, boolean z4, u4.i iVar, long j10, long j11) {
        s8.v vVar;
        long j12;
        boolean z10 = true;
        int i10 = -1;
        if (kVar != null) {
            long j13 = kVar.f44529s;
            int i11 = kVar.B;
            if (!z4) {
                if (kVar.U) {
                    if (i11 == -1) {
                        j13 = kVar.b();
                    }
                    Long valueOf = Long.valueOf(j13);
                    if (i11 != -1) {
                        i10 = i11 + 1;
                    }
                    return new Pair(valueOf, Integer.valueOf(i10));
                }
                return new Pair(Long.valueOf(j13), Integer.valueOf(i11));
            }
        }
        long j14 = iVar.f48332u;
        s8.v vVar2 = iVar.f48330s;
        long j15 = iVar.f48322k;
        s8.v vVar3 = iVar.f48329r;
        long j16 = j14 + j10;
        if (kVar != null && !this.f47938p) {
            j11 = kVar.h;
        }
        if (!iVar.f48326o && j11 >= j16) {
            return new Pair(Long.valueOf(j15 + vVar3.size()), -1);
        }
        long j17 = j11 - j10;
        Long valueOf2 = Long.valueOf(j17);
        int i12 = 0;
        if (this.f47930g.f48296x && kVar != null) {
            z10 = false;
        }
        int c3 = d0.c(vVar3, valueOf2, z10);
        long j18 = c3 + j15;
        if (c3 >= 0) {
            u4.f fVar = (u4.f) vVar3.get(c3);
            if (j17 < fVar.f48308e + fVar.f48307c) {
                vVar = fVar.f48304x;
            } else {
                vVar = vVar2;
            }
            while (true) {
                if (i12 >= vVar.size()) {
                    break;
                }
                u4.d dVar = (u4.d) vVar.get(i12);
                if (j17 < dVar.f48308e + dVar.f48307c) {
                    if (dVar.f48298w) {
                        if (vVar == vVar2) {
                            j12 = 1;
                        } else {
                            j12 = 0;
                        }
                        j18 += j12;
                        i10 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair(Long.valueOf(j18), Integer.valueOf(i10));
    }

    public final e d(int i10, Uri uri, boolean z4) {
        if (uri == null) {
            return null;
        }
        e0 e0Var = this.f47932j;
        byte[] bArr = (byte[]) ((d) e0Var.f42491b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) e0Var.f42491b).put(uri, bArr);
            return null;
        }
        Map map = Collections.EMPTY_MAP;
        g5.p pVar = new g5.p(uri, 1, null, s8.n0.h, 0L, -1L, null, 1);
        n0 n0Var = this.f47929f[i10];
        int k10 = this.f47939q.k();
        Object j10 = this.f47939q.j();
        byte[] bArr3 = this.f47935m;
        ?? eVar = new q4.e(this.f47927c, pVar, 3, n0Var, k10, j10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f7241f;
        }
        eVar.f47918s = bArr3;
        return eVar;
    }
}
