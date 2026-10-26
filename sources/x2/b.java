package x2;

import android.os.SystemClock;
import b2.q1;
import b2.x;
import e2.g0;
import e2.n0;
import f9.f0;
import f9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final y2.c f51293g;
    public final long h;
    public final long f51294i;
    public final long f51295j;
    public final int f51296k;
    public final int f51297l;
    public final float f51298m;
    public final float f51299n;
    public final i0 f51300o;
    public final g0 f51301p;
    public float f51302q;
    public int f51303r;
    public int f51304s;
    public long f51305t;
    public v2.l f51306u;

    public b(q1 q1Var, int[] iArr, y2.c cVar, long j10, long j11, long j12, i0 i0Var) {
        super(q1Var, iArr);
        if (j12 < j10) {
            e2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f51293g = cVar;
        this.h = j10 * 1000;
        this.f51294i = j11 * 1000;
        this.f51295j = j12 * 1000;
        this.f51296k = 1279;
        this.f51297l = 719;
        this.f51298m = 0.7f;
        this.f51299n = 0.75f;
        this.f51300o = i0.u(i0Var);
        this.f51301p = g0.f9664a;
        this.f51302q = 1.0f;
        this.f51304s = 0;
        this.f51305t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f0 f0Var = (f0) arrayList.get(i10);
            if (f0Var != null) {
                f0Var.c(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            v2.l lVar = (v2.l) f9.o.m(list);
            long j10 = lVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = lVar.f50010n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f51303r;
    }

    @Override
    public final void g() {
        this.f51305t = -9223372036854775807L;
        this.f51306u = null;
    }

    @Override
    public final int i(long j10, List list) {
        v2.l lVar;
        int i10;
        int i11;
        this.f51301p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f51305t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((v2.l) f9.o.m(list)).equals(this.f51306u))) {
            return list.size();
        }
        this.f51305t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (v2.l) f9.o.m(list);
        }
        this.f51306u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = n0.F(((v2.l) list.get(size - 1)).h - j10, this.f51302q);
        long j12 = this.f51295j;
        if (F >= j12) {
            x(list);
            x xVar = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                v2.l lVar2 = (v2.l) list.get(i12);
                x xVar2 = lVar2.d;
                if (n0.F(lVar2.h - j10, this.f51302q) >= j12 && xVar2.f3577j < xVar.f3577j && (i10 = xVar2.A) != -1 && i10 <= this.f51297l && (i11 = xVar2.f3592z) != -1 && i11 <= this.f51296k && i10 < xVar.A) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void j() {
        this.f51306u = null;
    }

    @Override
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
        long x9;
        int s10;
        long j13;
        this.f51301p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f51303r;
        if (i10 < mVarArr.length && mVarArr[i10].next()) {
            v2.m mVar = mVarArr[this.f51303r];
            x9 = mVar.y() - mVar.k();
        } else {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    v2.m mVar2 = mVarArr[i11];
                    if (mVar2.next()) {
                        x9 = mVar2.y() - mVar2.k();
                        break;
                    }
                    i11++;
                } else {
                    x9 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f51304s;
        if (i12 == 0) {
            this.f51304s = 1;
            this.f51303r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f51303r;
        if (list.isEmpty()) {
            s10 = -1;
        } else {
            s10 = s(((v2.l) f9.o.m(list)).d);
        }
        if (s10 != -1) {
            i12 = ((v2.l) f9.o.m(list)).e;
            i13 = s10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i13 && !a(i13, elapsedRealtime)) {
            x[] xVarArr = this.d;
            x xVar = xVarArr[i13];
            x xVar2 = xVarArr[w10];
            int i14 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            long j14 = this.h;
            if (i14 != 0) {
                if (x9 != -9223372036854775807L) {
                    j13 = j12 - x9;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f51299n, j14);
            }
            int i15 = xVar2.f3577j;
            int i16 = xVar.f3577j;
            if ((i15 > i16 && j11 < j14) || (i15 < i16 && j11 >= this.f51294i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.f51304s = i12;
        this.f51303r = w10;
    }

    @Override
    public final int n() {
        return this.f51304s;
    }

    @Override
    public final void p(float f7) {
        this.f51302q = f7;
    }

    @Override
    public final Object q() {
        return null;
    }

    public final int w(int i10, long j10) {
        long j11;
        long j12;
        y2.f fVar = (y2.f) this.f51293g;
        synchronized (fVar) {
            j11 = fVar.f51952l;
        }
        this.f51293g.getClass();
        long j13 = (((float) j11) * this.f51298m) / this.f51302q;
        if (!this.f51300o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f51300o.size() - 1 && ((a) this.f51300o.get(i11)).f51291a < j13) {
                i11++;
            }
            a aVar = (a) this.f51300o.get(i11 - 1);
            a aVar2 = (a) this.f51300o.get(i11);
            long j14 = aVar.f51291a;
            float f7 = ((float) (j13 - j14)) / ((float) (aVar2.f51291a - j14));
            j13 = aVar.f51292b + (f7 * ((float) (aVar2.f51292b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f51308b; i13++) {
            if (j10 == Long.MIN_VALUE || !a(i13, j10)) {
                x xVar = this.d[i13];
                int max = Math.max(xVar.f3592z, xVar.A);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    x xVar2 = this.d[num.intValue()];
                    boolean z10 = xVar2.f3581n;
                    if ((!z10 || xVar.f3581n) && ((!z10 && xVar.f3581n) || xVar.f3577j < xVar2.f3577j)) {
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
                if (this.d[intValue].f3581n) {
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
            int i16 = xVar3.f3577j;
            if (xVar3.f3581n) {
                break;
            } else if (i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
