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
    public final y2.c f44481g;
    public final long h;
    public final long f44482i;
    public final long f44483j;
    public final int f44484k;
    public final int f44485l;
    public final float f44486m;
    public final float f44487n;
    public final i0 f44488o;
    public final x f44489p;
    public float f44490q;
    public int f44491r;
    public int f44492s;
    public long f44493t;
    public v2.k f44494u;

    public b(l1 l1Var, int[] iArr, y2.c cVar, long j3, long j10, long j11, i0 i0Var) {
        super(l1Var, iArr);
        if (j11 < j3) {
            e2.a.n("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.f44481g = cVar;
        this.h = j3 * 1000;
        this.f44482i = j10 * 1000;
        this.f44483j = j11 * 1000;
        this.f44484k = 1279;
        this.f44485l = 719;
        this.f44486m = 0.7f;
        this.f44487n = 0.75f;
        this.f44488o = i0.v(i0Var);
        this.f44489p = x.f7240a;
        this.f44490q = 1.0f;
        this.f44492s = 0;
        this.f44493t = -9223372036854775807L;
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
                long j10 = kVar.f42866n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f44491r;
    }

    @Override
    public final void g() {
        this.f44493t = -9223372036854775807L;
        this.f44494u = null;
    }

    @Override
    public final int i(long j3, List list) {
        v2.k kVar;
        int i10;
        int i11;
        this.f44489p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f44493t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((v2.k) e9.q.l(list)).equals(this.f44494u))) {
            return list.size();
        }
        this.f44493t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (v2.k) e9.q.l(list);
        }
        this.f44494u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long D = d0.D(((v2.k) list.get(size - 1)).h - j3, this.f44490q);
        long j11 = this.f44483j;
        if (D >= j11) {
            x(list);
            b2.s sVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.k kVar2 = (v2.k) list.get(i12);
                b2.s sVar2 = kVar2.d;
                if (d0.D(kVar2.h - j3, this.f44490q) >= j11 && sVar2.f1994j < sVar.f1994j && (i10 = sVar2.f2009z) != -1 && i10 <= this.f44485l && (i11 = sVar2.f2008y) != -1 && i11 <= this.f44484k && i10 < sVar.f2009z) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f44494u = null;
    }

    @Override
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long x10;
        int s10;
        long j12;
        this.f44489p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f44491r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            v2.l lVar = lVarArr[this.f44491r];
            x10 = lVar.d() - lVar.b();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        x10 = lVar2.d() - lVar2.b();
                        break;
                    }
                    i11++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f44492s;
        if (i12 == 0) {
            this.f44492s = 1;
            this.f44491r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f44491r;
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
                j13 = Math.min(((float) j12) * this.f44487n, j13);
            }
            int i14 = sVar2.f1994j;
            int i15 = sVar.f1994j;
            if ((i14 > i15 && j10 < j13) || (i14 < i15 && j10 >= this.f44482i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.f44492s = i12;
        this.f44491r = w10;
    }

    @Override
    public final int n() {
        return this.f44492s;
    }

    @Override
    public final void p(float f7) {
        this.f44490q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j3) {
        long j10;
        long j11;
        y2.f fVar = (y2.f) this.f44481g;
        synchronized (fVar) {
            j10 = fVar.f46429l;
        }
        this.f44481g.getClass();
        long j12 = (((float) j10) * this.f44486m) / this.f44490q;
        if (!this.f44488o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f44488o.size() - 1 && ((a) this.f44488o.get(i11)).f44479a < j12) {
                i11++;
            }
            a aVar = (a) this.f44488o.get(i11 - 1);
            a aVar2 = (a) this.f44488o.get(i11);
            long j13 = aVar.f44479a;
            float f7 = ((float) (j12 - j13)) / ((float) (aVar2.f44479a - j13));
            j12 = aVar.f44480b + (f7 * ((float) (aVar2.f44480b - j11)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f44496b; i13++) {
            if (j3 == Long.MIN_VALUE || !a(i13, j3)) {
                b2.s sVar = this.d[i13];
                int max = Math.max(sVar.f2008y, sVar.f2009z);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    b2.s sVar2 = this.d[num.intValue()];
                    boolean z10 = sVar2.f1997m;
                    if ((!z10 || sVar.f1997m) && ((!z10 && sVar.f1997m) || sVar.f1994j < sVar2.f1994j)) {
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
                if (this.d[intValue].f1997m) {
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
            int i16 = sVar3.f1994j;
            if (sVar3.f1997m) {
                break;
            } else if (i16 <= j12) {
                break;
            }
        }
        return i12;
    }
}
