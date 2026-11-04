package z2;

import android.os.SystemClock;
import d2.o1;
import d2.v;
import g2.h0;
import g2.n0;
import g9.f0;
import g9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final a3.d f59573g;
    public final long h;
    public final long f59574i;
    public final long f59575j;
    public final int f59576k;
    public final int f59577l;
    public final float f59578m;
    public final float f59579n;
    public final i0 f59580o;
    public final h0 f59581p;
    public float f59582q;
    public int f59583r;
    public int f59584s;
    public long f59585t;
    public x2.l f59586u;

    public b(o1 o1Var, int[] iArr, a3.d dVar, long j10, long j11, long j12, i0 i0Var) {
        super(o1Var, iArr);
        if (j12 < j10) {
            g2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f59573g = dVar;
        this.h = j10 * 1000;
        this.f59574i = j11 * 1000;
        this.f59575j = j12 * 1000;
        this.f59576k = 1279;
        this.f59577l = 719;
        this.f59578m = 0.7f;
        this.f59579n = 0.75f;
        this.f59580o = i0.q(i0Var);
        this.f59581p = h0.f11849a;
        this.f59582q = 1.0f;
        this.f59584s = 0;
        this.f59585t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f0 f0Var = (f0) arrayList.get(i3);
            if (f0Var != null) {
                f0Var.c(new a(j10, jArr[i3]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            x2.l lVar = (x2.l) g9.o.n(list);
            long j10 = lVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = lVar.f58153n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int c() {
        return this.f59583r;
    }

    @Override
    public final void d(long j10, long j11, long j12, List list, x2.m[] mVarArr) {
        long x10;
        int e10;
        long j13;
        this.f59581p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.f59583r;
        if (i3 < mVarArr.length && mVarArr[i3].next()) {
            x2.m mVar = mVarArr[this.f59583r];
            x10 = mVar.D() - mVar.t();
        } else {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    x2.m mVar2 = mVarArr[i10];
                    if (mVar2.next()) {
                        x10 = mVar2.D() - mVar2.t();
                        break;
                    }
                    i10++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i11 = this.f59584s;
        if (i11 == 0) {
            this.f59584s = 1;
            this.f59583r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.f59583r;
        if (list.isEmpty()) {
            e10 = -1;
        } else {
            e10 = e(((x2.l) g9.o.n(list)).d);
        }
        if (e10 != -1) {
            i11 = ((x2.l) g9.o.n(list)).f58151e;
            i12 = e10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            v[] vVarArr = this.d;
            v vVar = vVarArr[i12];
            v vVar2 = vVarArr[w10];
            int i13 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            long j14 = this.h;
            if (i13 != 0) {
                if (x10 != -9223372036854775807L) {
                    j13 = j12 - x10;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f59579n, j14);
            }
            int i14 = vVar2.f8480j;
            int i15 = vVar.f8480j;
            if ((i14 > i15 && j11 < j14) || (i14 < i15 && j11 >= this.f59574i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.f59584s = i11;
        this.f59583r = w10;
    }

    @Override
    public final void h() {
        this.f59585t = -9223372036854775807L;
        this.f59586u = null;
    }

    @Override
    public final int j(long j10, List list) {
        x2.l lVar;
        int i3;
        int i10;
        this.f59581p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f59585t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((x2.l) g9.o.n(list)).equals(this.f59586u))) {
            return list.size();
        }
        this.f59585t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (x2.l) g9.o.n(list);
        }
        this.f59586u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = n0.F(((x2.l) list.get(size - 1)).h - j10, this.f59582q);
        long j12 = this.f59575j;
        if (F >= j12) {
            x(list);
            v vVar = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                x2.l lVar2 = (x2.l) list.get(i11);
                v vVar2 = lVar2.d;
                if (n0.F(lVar2.h - j10, this.f59582q) >= j12 && vVar2.f8480j < vVar.f8480j && (i3 = vVar2.A) != -1 && i3 <= this.f59577l && (i10 = vVar2.f8495z) != -1 && i10 <= this.f59576k && i3 < vVar.A) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override
    public final void k() {
        this.f59586u = null;
    }

    @Override
    public final int o() {
        return this.f59584s;
    }

    @Override
    public final void q(float f10) {
        this.f59582q = f10;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(int i3, long j10) {
        a3.d dVar;
        v[] vVarArr;
        long j11;
        this.f59573g.getClass();
        long a10 = (((float) ((a3.g) dVar).a()) * this.f59578m) / this.f59582q;
        i0 i0Var = this.f59580o;
        if (!i0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < i0Var.size() - 1 && ((a) i0Var.get(i10)).f59571a < a10) {
                i10++;
            }
            a aVar = (a) i0Var.get(i10 - 1);
            a aVar2 = (a) i0Var.get(i10);
            long j12 = aVar.f59571a;
            a10 = ((((float) (a10 - j12)) / ((float) (aVar2.f59571a - j12))) * ((float) (aVar2.f59572b - j11))) + aVar.f59572b;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f59588b;
            vVarArr = this.d;
            if (i12 >= i13) {
                break;
            }
            if (j10 == Long.MIN_VALUE || !a(i12, j10)) {
                v vVar = vVarArr[i12];
                int max = Math.max(vVar.f8495z, vVar.A);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    v vVar2 = vVarArr[num.intValue()];
                    boolean z10 = vVar2.f8484n;
                    if ((!z10 || vVar.f8484n) && ((!z10 && vVar.f8484n) || vVar.f8480j < vVar2.f8480j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
            }
            i12++;
        }
        if (i3 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (vVarArr[intValue].f8484n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i11 = ((Integer) obj2).intValue();
            v vVar3 = vVarArr[i11];
            int i16 = vVar3.f8480j;
            if (!vVar3.f8484n) {
                if (i16 <= a10) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11;
    }
}
