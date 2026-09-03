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
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zz;
import s8.i0;
public final class i {
    public final j f44548a;
    public final g5.m f44549b;
    public final g5.m f44550c;
    public final tp0 d;
    public final Uri[] e;
    public final n0[] f44551f;
    public final u4.c f44552g;
    public final s0 h;
    public final List f44553i;
    public final k3.k f44555k;
    public boolean f44556l;
    public o4.b f44558n;
    public Uri f44559o;
    public boolean f44560p;
    public f5.c f44561q;
    public boolean f44563s;
    public final zz f44554j = new zz(15);
    public byte[] f44557m = d0.f6927f;
    public long f44562r = -9223372036854775807L;

    public i(j jVar, u4.c cVar, Uri[] uriArr, n0[] n0VarArr, o3.c cVar2, v0 v0Var, tp0 tp0Var, List list, k3.k kVar) {
        this.f44548a = jVar;
        this.f44552g = cVar;
        this.e = uriArr;
        this.f44551f = n0VarArr;
        this.d = tp0Var;
        this.f44553i = list;
        this.f44555k = kVar;
        g5.m createDataSource = ((g5.l) cVar2.f16228b).createDataSource();
        this.f44549b = createDataSource;
        if (v0Var != null) {
            createDataSource.addTransferListener(v0Var);
        }
        this.f44550c = ((g5.l) cVar2.f16228b).createDataSource();
        this.h = new s0("", n0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((n0VarArr[i10].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        s0 s0Var = this.h;
        int[] d = y7.d(arrayList);
        ?? cVar3 = new f5.c(s0Var, d);
        cVar3.f44544g = cVar3.n(s0Var.d[d[0]]);
        this.f44561q = cVar3;
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
        int p10 = iVar.f44561q.p();
        q4.l[] lVarArr = new q4.l[p10];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < p10) {
            int f10 = iVar.f44561q.f(i10);
            Uri uri = iVar.e[f10];
            u4.c cVar = iVar.f44552g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = q4.l.f42782z;
            } else {
                u4.i a10 = cVar.a(uri, z10);
                a10.getClass();
                long j11 = a10.h - cVar.f45078y;
                if (f10 != a2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Pair c3 = iVar.c(kVar2, z4, a10, j11, j10);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                long j12 = a10.f45100k;
                s8.v vVar = a10.f45108s;
                s8.v vVar2 = a10.f45107r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && vVar2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < vVar2.size()) {
                        if (intValue != -1) {
                            u4.f fVar = (u4.f) vVar2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(fVar);
                            } else if (intValue < fVar.f45085x.size()) {
                                s8.v vVar3 = fVar.f45085x;
                                arrayList.addAll(vVar3.subList(intValue, vVar3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(vVar2.subList(i11, vVar2.size()));
                        intValue = 0;
                    }
                    if (a10.f45103n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < vVar.size()) {
                            arrayList.addAll(vVar.subList(intValue, vVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    s8.t tVar = s8.v.f44222b;
                    list = i0.e;
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
            u4.i a2 = this.f44552g.a(this.e[this.h.a(kVar.d)], false);
            a2.getClass();
            s8.v vVar2 = a2.f45107r;
            int i11 = (int) (kVar.f42781s - a2.f45100k);
            if (i11 >= 0) {
                if (i11 < vVar2.size()) {
                    vVar = ((u4.f) vVar2.get(i11)).f45085x;
                } else {
                    vVar = a2.f45108s;
                }
                if (i10 < vVar.size()) {
                    u4.d dVar = (u4.d) vVar.get(i10);
                    if (dVar.f45080x) {
                        return 0;
                    }
                    if (d0.a(Uri.parse(h5.a.G(a2.f45126a, dVar.f45086a)), kVar.f42760b.f6401a)) {
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
            long j13 = kVar.f42781s;
            int i11 = kVar.B;
            if (!z4) {
                if (kVar.U) {
                    if (i11 == -1) {
                        j13 = kVar.c();
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
        long j14 = iVar.f45110u;
        s8.v vVar2 = iVar.f45108s;
        long j15 = iVar.f45100k;
        s8.v vVar3 = iVar.f45107r;
        long j16 = j14 + j10;
        if (kVar != null && !this.f44560p) {
            j11 = kVar.h;
        }
        if (!iVar.f45104o && j11 >= j16) {
            return new Pair(Long.valueOf(j15 + vVar3.size()), -1);
        }
        long j17 = j11 - j10;
        Long valueOf2 = Long.valueOf(j17);
        int i12 = 0;
        if (this.f44552g.f45077x && kVar != null) {
            z10 = false;
        }
        int c3 = d0.c(vVar3, valueOf2, z10);
        long j18 = c3 + j15;
        if (c3 >= 0) {
            u4.f fVar = (u4.f) vVar3.get(c3);
            if (j17 < fVar.e + fVar.f45088c) {
                vVar = fVar.f45085x;
            } else {
                vVar = vVar2;
            }
            while (true) {
                if (i12 >= vVar.size()) {
                    break;
                }
                u4.d dVar = (u4.d) vVar.get(i12);
                if (j17 < dVar.e + dVar.f45088c) {
                    if (dVar.f45079w) {
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
        zz zzVar = this.f44554j;
        byte[] bArr = (byte[]) ((d) zzVar.f31508b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) zzVar.f31508b).put(uri, bArr);
            return null;
        }
        Map map = Collections.EMPTY_MAP;
        g5.p pVar = new g5.p(uri, 1, null, s8.n0.h, 0L, -1L, null, 1);
        n0 n0Var = this.f44551f[i10];
        int k10 = this.f44561q.k();
        Object j10 = this.f44561q.j();
        byte[] bArr3 = this.f44557m;
        ?? eVar = new q4.e(this.f44550c, pVar, 3, n0Var, k10, j10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f6927f;
        }
        eVar.f44542s = bArr3;
        return eVar;
    }
}
