package x2;

import android.os.SystemClock;
import b2.q1;
import b2.x;
import e2.g0;
import e2.m0;
import e9.k0;
import e9.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final y2.c f47726g;
    public final long h;
    public final long f47727i;
    public final long f47728j;
    public final int f47729k;
    public final int f47730l;
    public final float f47731m;
    public final float f47732n;
    public final n0 f47733o;
    public final g0 f47734p;
    public float f47735q;
    public int f47736r;
    public int f47737s;
    public long f47738t;
    public v2.l f47739u;

    public b(q1 q1Var, int[] iArr, y2.c cVar, long j10, long j11, long j12, n0 n0Var) {
        super(q1Var, iArr);
        if (j12 < j10) {
            e2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f47726g = cVar;
        this.h = j10 * 1000;
        this.f47727i = j11 * 1000;
        this.f47728j = j12 * 1000;
        this.f47729k = 1279;
        this.f47730l = 719;
        this.f47731m = 0.7f;
        this.f47732n = 0.75f;
        this.f47733o = n0.u(n0Var);
        this.f47734p = g0.f8349a;
        this.f47735q = 1.0f;
        this.f47737s = 0;
        this.f47738t = -9223372036854775807L;
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
                long j11 = lVar.f46502n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f47736r;
    }

    @Override
    public final void g() {
        this.f47738t = -9223372036854775807L;
        this.f47739u = null;
    }

    @Override
    public final int i(long j10, List list) {
        v2.l lVar;
        int i10;
        int i11;
        this.f47734p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f47738t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((v2.l) e9.s.m(list)).equals(this.f47739u))) {
            return list.size();
        }
        this.f47738t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (v2.l) e9.s.m(list);
        }
        this.f47739u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = m0.F(((v2.l) list.get(size - 1)).h - j10, this.f47735q);
        long j12 = this.f47728j;
        if (F >= j12) {
            x(list);
            x xVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.l lVar2 = (v2.l) list.get(i12);
                x xVar2 = lVar2.d;
                if (m0.F(lVar2.h - j10, this.f47735q) >= j12 && xVar2.f2510j < xVar.f2510j && (i10 = xVar2.A) != -1 && i10 <= this.f47730l && (i11 = xVar2.f2525z) != -1 && i11 <= this.f47729k && i10 < xVar.A) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f47739u = null;
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        long x10;
        int s10;
        long j13;
        this.f47734p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f47736r;
        if (i10 < mVarArr.length && mVarArr[i10].next()) {
            v2.m mVar = mVarArr[this.f47736r];
            x10 = mVar.p() - mVar.b();
        } else {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.m mVar2 = mVarArr[i11];
                    if (mVar2.next()) {
                        x10 = mVar2.p() - mVar2.b();
                        break;
                    }
                    i11++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f47737s;
        if (i12 == 0) {
            this.f47737s = 1;
            this.f47736r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f47736r;
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
                j14 = Math.min(((float) j13) * this.f47732n, j14);
            }
            int i15 = xVar2.f2510j;
            int i16 = xVar.f2510j;
            if ((i15 > i16 && j11 < j14) || (i15 < i16 && j11 >= this.f47727i)) {
                w9 = i13;
            }
        }
        if (w9 != i13) {
            i12 = 3;
        }
        this.f47737s = i12;
        this.f47736r = w9;
    }

    @Override
    public final int n() {
        return this.f47737s;
    }

    @Override
    public final void p(float f7) {
        this.f47735q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j10) {
        long j11;
        long j12;
        y2.f fVar = (y2.f) this.f47726g;
        synchronized (fVar) {
            j11 = fVar.f48531l;
        }
        this.f47726g.getClass();
        long j13 = (((float) j11) * this.f47731m) / this.f47735q;
        if (!this.f47733o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f47733o.size() - 1 && ((a) this.f47733o.get(i11)).f47724a < j13) {
                i11++;
            }
            a aVar = (a) this.f47733o.get(i11 - 1);
            a aVar2 = (a) this.f47733o.get(i11);
            long j14 = aVar.f47724a;
            float f7 = ((float) (j13 - j14)) / ((float) (aVar2.f47724a - j14));
            j13 = aVar.f47725b + (f7 * ((float) (aVar2.f47725b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f47741b; i13++) {
            if (j10 == Long.MIN_VALUE || !a(i13, j10)) {
                x xVar = this.d[i13];
                int max = Math.max(xVar.f2525z, xVar.A);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    x xVar2 = this.d[num.intValue()];
                    boolean z10 = xVar2.f2514n;
                    if ((!z10 || xVar.f2514n) && ((!z10 && xVar.f2514n) || xVar.f2510j < xVar2.f2510j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
            }
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].f2514n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i12 = ((Integer) obj2).intValue();
            x xVar3 = this.d[i12];
            int i16 = xVar3.f2510j;
            if (xVar3.f2514n) {
                break;
            } else if (i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
