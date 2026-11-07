package z2;

import a8.ia;
import h9.f0;
import h9.g0;
import h9.i0;
import h9.n;
import h9.o1;
import h9.t1;
import h9.x;
import java.util.ArrayList;
import v0.j;
public final class c implements a {
    public static final x f59480b = new x(new n(new j(27), o1.f14359b), new n(new j(28), o1.f14360c));
    public final ArrayList f59481a = new ArrayList();

    @Override
    public final long a(long j3) {
        int i7 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f59481a;
            if (i7 >= arrayList.size()) {
                break;
            }
            long j11 = ((c4.a) arrayList.get(i7)).f5270b;
            long j12 = ((c4.a) arrayList.get(i7)).d;
            if (j3 < j11) {
                if (j10 == -9223372036854775807L) {
                    j10 = j11;
                } else {
                    j10 = Math.min(j10, j11);
                }
            } else {
                if (j3 < j12) {
                    if (j10 == -9223372036854775807L) {
                        j10 = j12;
                    } else {
                        j10 = Math.min(j10, j12);
                    }
                }
                i7++;
            }
        }
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final i0 b(long j3) {
        ArrayList arrayList = this.f59481a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((c4.a) arrayList.get(0)).f5270b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    c4.a aVar = (c4.a) arrayList.get(i7);
                    if (j3 >= aVar.f5270b && j3 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j3 < aVar.f5270b) {
                        break;
                    }
                }
                t1 w10 = i0.w(f59480b, arrayList2);
                f0 p10 = i0.p();
                for (int i10 = 0; i10 < w10.d; i10++) {
                    p10.d(((c4.a) w10.get(i10)).f5269a);
                }
                return p10.f();
            }
        }
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
    }

    @Override
    public final boolean c(c4.a aVar, long j3) {
        boolean z9;
        boolean z10;
        boolean z11;
        long j10 = aVar.f5270b;
        if (j10 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (aVar.f5271c != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        if (j10 <= j3 && j3 < aVar.d) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = this.f59481a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((c4.a) arrayList.get(size)).f5270b) {
                arrayList.add(size + 1, aVar);
                return z11;
            }
        }
        arrayList.add(0, aVar);
        return z11;
    }

    @Override
    public final void clear() {
        this.f59481a.clear();
    }

    @Override
    public final long d(long j3) {
        ArrayList arrayList = this.f59481a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((c4.a) arrayList.get(0)).f5270b) {
                long j10 = ((c4.a) arrayList.get(0)).f5270b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    long j11 = ((c4.a) arrayList.get(i7)).f5270b;
                    long j12 = ((c4.a) arrayList.get(i7)).d;
                    if (j12 <= j3) {
                        j10 = Math.max(j10, j12);
                    } else if (j11 > j3) {
                        break;
                    } else {
                        j10 = Math.max(j10, j11);
                    }
                }
                return j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final void e(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59481a;
            if (i7 < arrayList.size()) {
                int i10 = (j3 > ((c4.a) arrayList.get(i7)).f5270b ? 1 : (j3 == ((c4.a) arrayList.get(i7)).f5270b ? 0 : -1));
                if (i10 > 0 && j3 > ((c4.a) arrayList.get(i7)).d) {
                    arrayList.remove(i7);
                    i7--;
                } else if (i10 < 0) {
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
