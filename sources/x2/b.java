package x2;

import android.os.SystemClock;
import b2.p1;
import b2.x;
import e2.g0;
import e2.l0;
import e9.k0;
import e9.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final y2.c f52907g;
    public final long h;
    public final long f52908i;
    public final long f52909j;
    public final int f52910k;
    public final int f52911l;
    public final float f52912m;
    public final float f52913n;
    public final n0 f52914o;
    public final g0 f52915p;
    public float f52916q;
    public int f52917r;
    public int f52918s;
    public long f52919t;
    public v2.l f52920u;

    public b(p1 p1Var, int[] iArr, y2.c cVar, long j10, long j11, long j12, n0 n0Var) {
        super(p1Var, iArr);
        if (j12 < j10) {
            e2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f52907g = cVar;
        this.h = j10 * 1000;
        this.f52908i = j11 * 1000;
        this.f52909j = j12 * 1000;
        this.f52910k = 1279;
        this.f52911l = 719;
        this.f52912m = 0.7f;
        this.f52913n = 0.75f;
        this.f52914o = n0.u(n0Var);
        this.f52915p = g0.f6143a;
        this.f52916q = 1.0f;
        this.f52918s = 0;
        this.f52919t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k0 k0Var = (k0) arrayList.get(i10);
            if (k0Var != null) {
                k0Var.c(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            v2.l lVar = (v2.l) e9.s.m(list);
            long j10 = lVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = lVar.f50323n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f52917r;
    }

    @Override
    public final void g() {
        this.f52919t = -9223372036854775807L;
        this.f52920u = null;
    }

    @Override
    public final int i(long j10, List list) {
        v2.l lVar;
        int i10;
        int i11;
        this.f52915p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f52919t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((v2.l) e9.s.m(list)).equals(this.f52920u))) {
            return list.size();
        }
        this.f52919t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (v2.l) e9.s.m(list);
        }
        this.f52920u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = l0.F(((v2.l) list.get(size - 1)).h - j10, this.f52916q);
        long j12 = this.f52909j;
        if (F >= j12) {
            x(list);
            x xVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.l lVar2 = (v2.l) list.get(i12);
                x xVar2 = lVar2.d;
                if (l0.F(lVar2.h - j10, this.f52916q) >= j12 && xVar2.f2414j < xVar.f2414j && (i10 = xVar2.A) != -1 && i10 <= this.f52911l && (i11 = xVar2.f2429z) != -1 && i11 <= this.f52910k && i10 < xVar.A) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f52920u = null;
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        long x10;
        int s10;
        long j13;
        this.f52915p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f52917r;
        if (i10 < mVarArr.length && mVarArr[i10].next()) {
            v2.m mVar = mVarArr[this.f52917r];
            x10 = mVar.C() - mVar.k();
        } else {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.m mVar2 = mVarArr[i11];
                    if (mVar2.next()) {
                        x10 = mVar2.C() - mVar2.k();
                        break;
                    }
                    i11++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f52918s;
        if (i12 == 0) {
            this.f52918s = 1;
            this.f52917r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f52917r;
        if (list.isEmpty()) {
            s10 = -1;
        } else {
            s10 = s(((v2.l) e9.s.m(list)).d);
        }
        if (s10 != -1) {
            i12 = ((v2.l) e9.s.m(list)).e;
            i13 = s10;
        }
        int w9 = w(1, elapsedRealtime);
        if (w9 != i13 && !a(i13, elapsedRealtime)) {
            x[] xVarArr = this.d;
            x xVar = xVarArr[i13];
            x xVar2 = xVarArr[w9];
            int i14 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            long j14 = this.h;
            if (i14 != 0) {
                if (x10 != -9223372036854775807L) {
                    j13 = j12 - x10;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f52913n, j14);
            }
            int i15 = xVar2.f2414j;
            int i16 = xVar.f2414j;
            if ((i15 > i16 && j11 < j14) || (i15 < i16 && j11 >= this.f52908i)) {
                w9 = i13;
            }
        }
        if (w9 != i13) {
            i12 = 3;
        }
        this.f52918s = i12;
        this.f52917r = w9;
    }

    @Override
    public final int n() {
        return this.f52918s;
    }

    @Override
    public final void p(float f7) {
        this.f52916q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j10) {
        y2.c cVar;
        x[] xVarArr;
        long j11;
        this.f52907g.getClass();
        long a2 = (((float) ((y2.f) cVar).a()) * this.f52912m) / this.f52916q;
        n0 n0Var = this.f52914o;
        if (!n0Var.isEmpty()) {
            int i11 = 1;
            while (i11 < n0Var.size() - 1 && ((a) n0Var.get(i11)).f52905a < a2) {
                i11++;
            }
            a aVar = (a) n0Var.get(i11 - 1);
            a aVar2 = (a) n0Var.get(i11);
            long j12 = aVar.f52905a;
            a2 = ((((float) (a2 - j12)) / ((float) (aVar2.f52905a - j12))) * ((float) (aVar2.f52906b - j11))) + aVar.f52906b;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f52922b;
            xVarArr = this.d;
            if (i13 >= i14) {
                break;
            }
            if (j10 == Long.MIN_VALUE || !a(i13, j10)) {
                x xVar = xVarArr[i13];
                int max = Math.max(xVar.f2429z, xVar.A);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    x xVar2 = xVarArr[num.intValue()];
                    boolean z10 = xVar2.f2418n;
                    if ((!z10 || xVar.f2418n) && ((!z10 && xVar.f2418n) || xVar.f2414j < xVar2.f2414j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
            }
            i13++;
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                int intValue = ((Integer) obj).intValue();
                if (xVarArr[intValue].f2418n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList.get(i16);
            i16++;
            i12 = ((Integer) obj2).intValue();
            x xVar3 = xVarArr[i12];
            int i17 = xVar3.f2414j;
            if (!xVar3.f2418n) {
                if (i17 <= a2) {
                    break;
                }
            } else {
                break;
            }
        }
        return i12;
    }
}
