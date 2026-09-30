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
    public final y2.c f45527g;
    public final long h;
    public final long f45528i;
    public final long f45529j;
    public final int f45530k;
    public final int f45531l;
    public final float f45532m;
    public final float f45533n;
    public final i0 f45534o;
    public final x f45535p;
    public float f45536q;
    public int f45537r;
    public int f45538s;
    public long f45539t;
    public v2.k f45540u;

    public b(l1 l1Var, int[] iArr, y2.c cVar, long j3, long j10, long j11, i0 i0Var) {
        super(l1Var, iArr);
        if (j11 < j3) {
            e2.a.n("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.f45527g = cVar;
        this.h = j3 * 1000;
        this.f45528i = j10 * 1000;
        this.f45529j = j11 * 1000;
        this.f45530k = 1279;
        this.f45531l = 719;
        this.f45532m = 0.7f;
        this.f45533n = 0.75f;
        this.f45534o = i0.v(i0Var);
        this.f45535p = x.f7934a;
        this.f45536q = 1.0f;
        this.f45538s = 0;
        this.f45539t = -9223372036854775807L;
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
                long j10 = kVar.f44236n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f45537r;
    }

    @Override
    public final void g() {
        this.f45539t = -9223372036854775807L;
        this.f45540u = null;
    }

    @Override
    public final int i(long j3, List list) {
        v2.k kVar;
        int i10;
        int i11;
        this.f45535p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f45539t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((v2.k) e9.q.l(list)).equals(this.f45540u))) {
            return list.size();
        }
        this.f45539t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (v2.k) e9.q.l(list);
        }
        this.f45540u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D = d0.D(((v2.k) list.get(size - 1)).h - j3, this.f45536q);
        long j11 = this.f45529j;
        if (D >= j11) {
            x(list);
            b2.s sVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.k kVar2 = (v2.k) list.get(i12);
                b2.s sVar2 = kVar2.d;
                if (d0.D(kVar2.h - j3, this.f45536q) >= j11 && sVar2.f3300j < sVar.f3300j && (i10 = sVar2.f3315z) != -1 && i10 <= this.f45531l && (i11 = sVar2.f3314y) != -1 && i11 <= this.f45530k && i10 < sVar.f3315z) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f45540u = null;
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long x10;
        int s10;
        long j12;
        this.f45535p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f45537r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            v2.l lVar = lVarArr[this.f45537r];
            x10 = lVar.g() - lVar.a();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        x10 = lVar2.g() - lVar2.a();
                        break;
                    }
                    i11++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f45538s;
        if (i12 == 0) {
            this.f45538s = 1;
            this.f45537r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f45537r;
        if (list.isEmpty()) {
            s10 = -1;
        } else {
            s10 = s(((v2.k) e9.q.l(list)).d);
        }
        if (s10 != -1) {
            i12 = ((v2.k) e9.q.l(list)).e;
            i13 = s10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i13 && !a(i13, elapsedRealtime)) {
            b2.s[] sVarArr = this.d;
            b2.s sVar = sVarArr[i13];
            b2.s sVar2 = sVarArr[w10];
            long j13 = this.h;
            if (j11 != -9223372036854775807L) {
                if (x10 != -9223372036854775807L) {
                    j12 = j11 - x10;
                } else {
                    j12 = j11;
                }
                j13 = Math.min(((float) j12) * this.f45533n, j13);
            }
            int i14 = sVar2.f3300j;
            int i15 = sVar.f3300j;
            if ((i14 > i15 && j10 < j13) || (i14 < i15 && j10 >= this.f45528i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.f45538s = i12;
        this.f45537r = w10;
    }

    @Override
    public final int n() {
        return this.f45538s;
    }

    @Override
    public final void p(float f7) {
        this.f45536q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j3) {
        long j10;
        long j11;
        y2.f fVar = (y2.f) this.f45527g;
        synchronized (fVar) {
            j10 = fVar.f46670l;
        }
        this.f45527g.getClass();
        long j12 = (((float) j10) * this.f45532m) / this.f45536q;
        if (!this.f45534o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f45534o.size() - 1 && ((a) this.f45534o.get(i11)).f45525a < j12) {
                i11++;
            }
            a aVar = (a) this.f45534o.get(i11 - 1);
            a aVar2 = (a) this.f45534o.get(i11);
            long j13 = aVar.f45525a;
            float f7 = ((float) (j12 - j13)) / ((float) (aVar2.f45525a - j13));
            j12 = aVar.f45526b + (f7 * ((float) (aVar2.f45526b - j11)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f45542b; i13++) {
            if (j3 == Long.MIN_VALUE || !a(i13, j3)) {
                b2.s sVar = this.d[i13];
                int max = Math.max(sVar.f3314y, sVar.f3315z);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    b2.s sVar2 = this.d[num.intValue()];
                    boolean z10 = sVar2.f3303m;
                    if ((!z10 || sVar.f3303m) && ((!z10 && sVar.f3303m) || sVar.f3300j < sVar2.f3300j)) {
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
                if (this.d[intValue].f3303m) {
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
            int i16 = sVar3.f3300j;
            if (sVar3.f3303m) {
                break;
            } else if (i16 <= j12) {
                break;
            }
        }
        return i12;
    }
}
