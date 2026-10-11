package x2;

import android.os.SystemClock;
import b2.l1;
import e2.d0;
import e2.x;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final y2.c f50582g;
    public final long h;
    public final long f50583i;
    public final long f50584j;
    public final int f50585k;
    public final int f50586l;
    public final float f50587m;
    public final float f50588n;
    public final i0 f50589o;
    public final x f50590p;
    public float f50591q;
    public int f50592r;
    public int f50593s;
    public long f50594t;
    public v2.k f50595u;

    public b(l1 l1Var, int[] iArr, y2.c cVar, long j3, long j10, long j11, i0 i0Var) {
        super(l1Var, iArr);
        if (j11 < j3) {
            e2.a.n("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.f50582g = cVar;
        this.h = j3 * 1000;
        this.f50583i = j10 * 1000;
        this.f50584j = j11 * 1000;
        this.f50585k = 1279;
        this.f50586l = 719;
        this.f50587m = 0.7f;
        this.f50588n = 0.75f;
        this.f50589o = i0.v(i0Var);
        this.f50590p = x.f8589a;
        this.f50591q = 1.0f;
        this.f50593s = 0;
        this.f50594t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f0 f0Var = (f0) arrayList.get(i10);
            if (f0Var != null) {
                f0Var.b(new a(j3, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            v2.k kVar = (v2.k) e9.q.l(list);
            long j3 = kVar.h;
            if (j3 != -9223372036854775807L) {
                long j10 = kVar.f49176n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f50592r;
    }

    @Override
    public final void g() {
        this.f50594t = -9223372036854775807L;
        this.f50595u = null;
    }

    @Override
    public final int i(long j3, List list) {
        v2.k kVar;
        int i10;
        int i11;
        this.f50590p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f50594t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((v2.k) e9.q.l(list)).equals(this.f50595u))) {
            return list.size();
        }
        this.f50594t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (v2.k) e9.q.l(list);
        }
        this.f50595u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long C = d0.C(((v2.k) list.get(size - 1)).h - j3, this.f50591q);
        long j11 = this.f50584j;
        if (C >= j11) {
            x(list);
            b2.s sVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.k kVar2 = (v2.k) list.get(i12);
                b2.s sVar2 = kVar2.d;
                if (d0.C(kVar2.h - j3, this.f50591q) >= j11 && sVar2.f3635j < sVar.f3635j && (i10 = sVar2.f3650z) != -1 && i10 <= this.f50586l && (i11 = sVar2.f3649y) != -1 && i11 <= this.f50585k && i10 < sVar.f3650z) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f50595u = null;
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long x10;
        int s10;
        long j12;
        this.f50590p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f50592r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            v2.l lVar = lVarArr[this.f50592r];
            x10 = lVar.l() - lVar.c();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        x10 = lVar2.l() - lVar2.c();
                        break;
                    }
                    i11++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f50593s;
        if (i12 == 0) {
            this.f50593s = 1;
            this.f50592r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f50592r;
        if (list.isEmpty()) {
            s10 = -1;
        } else {
            s10 = s(((v2.k) e9.q.l(list)).d);
        }
        if (s10 != -1) {
            i12 = ((v2.k) e9.q.l(list)).f49174e;
            i13 = s10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i13 && !a(i13, elapsedRealtime)) {
            b2.s[] sVarArr = this.d;
            b2.s sVar = sVarArr[i13];
            b2.s sVar2 = sVarArr[w10];
            int i14 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
            long j13 = this.h;
            if (i14 != 0) {
                if (x10 != -9223372036854775807L) {
                    j12 = j11 - x10;
                } else {
                    j12 = j11;
                }
                j13 = Math.min(((float) j12) * this.f50588n, j13);
            }
            int i15 = sVar2.f3635j;
            int i16 = sVar.f3635j;
            if ((i15 > i16 && j10 < j13) || (i15 < i16 && j10 >= this.f50583i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.f50593s = i12;
        this.f50592r = w10;
    }

    @Override
    public final int n() {
        return this.f50593s;
    }

    @Override
    public final void p(float f7) {
        this.f50591q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j3) {
        long j10;
        long j11;
        y2.f fVar = (y2.f) this.f50582g;
        synchronized (fVar) {
            j10 = fVar.f51803l;
        }
        this.f50582g.getClass();
        long j12 = (((float) j10) * this.f50587m) / this.f50591q;
        if (!this.f50589o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f50589o.size() - 1 && ((a) this.f50589o.get(i11)).f50580a < j12) {
                i11++;
            }
            a aVar = (a) this.f50589o.get(i11 - 1);
            a aVar2 = (a) this.f50589o.get(i11);
            long j13 = aVar.f50580a;
            float f7 = ((float) (j12 - j13)) / ((float) (aVar2.f50580a - j13));
            j12 = aVar.f50581b + (f7 * ((float) (aVar2.f50581b - j11)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f50597b; i13++) {
            if (j3 == Long.MIN_VALUE || !a(i13, j3)) {
                b2.s sVar = this.d[i13];
                int max = Math.max(sVar.f3649y, sVar.f3650z);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    b2.s sVar2 = this.d[num.intValue()];
                    boolean z10 = sVar2.f3638m;
                    if ((!z10 || sVar.f3638m) && ((!z10 && sVar.f3638m) || sVar.f3635j < sVar2.f3635j)) {
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
                if (this.d[intValue].f3638m) {
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
            b2.s sVar3 = this.d[i12];
            int i16 = sVar3.f3635j;
            if (sVar3.f3638m) {
                break;
            } else if (i16 <= j12) {
                break;
            }
        }
        return i12;
    }
}
