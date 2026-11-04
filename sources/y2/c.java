package y2;

import b8.zb;
import g9.f0;
import g9.g0;
import g9.i0;
import g9.n;
import g9.n1;
import g9.s1;
import g9.x;
import java.util.ArrayList;
import u9.j;
public final class c implements a {
    public static final x f58898b = new x(new n(new j(25), n1.f12107b), new n(new j(26), n1.f12108c));
    public final ArrayList f58899a = new ArrayList();

    @Override
    public final long a(long j10) {
        int i3 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f58899a;
            if (i3 >= arrayList.size()) {
                break;
            }
            long j12 = ((b4.a) arrayList.get(i3)).f2353b;
            long j13 = ((b4.a) arrayList.get(i3)).d;
            if (j10 < j12) {
                if (j11 == -9223372036854775807L) {
                    j11 = j12;
                } else {
                    j11 = Math.min(j11, j12);
                }
            } else {
                if (j10 < j13) {
                    if (j11 == -9223372036854775807L) {
                        j11 = j13;
                    } else {
                        j11 = Math.min(j11, j13);
                    }
                }
                i3++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean b(b4.a aVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11 = aVar.f2353b;
        if (j11 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (aVar.f2354c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        if (j11 <= j10 && j10 < aVar.d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f58899a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((b4.a) arrayList.get(size)).f2353b) {
                arrayList.add(size + 1, aVar);
                return z12;
            }
        }
        arrayList.add(0, aVar);
        return z12;
    }

    @Override
    public final i0 c(long j10) {
        ArrayList arrayList = this.f58899a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((b4.a) arrayList.get(0)).f2353b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    b4.a aVar = (b4.a) arrayList.get(i3);
                    if (j10 >= aVar.f2353b && j10 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f2353b) {
                        break;
                    }
                }
                s1 w10 = i0.w(f58898b, arrayList2);
                f0 p10 = i0.p();
                for (int i10 = 0; i10 < w10.d; i10++) {
                    p10.d(((b4.a) w10.get(i10)).f2352a);
                }
                return p10.f();
            }
        }
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final void clear() {
        this.f58899a.clear();
    }

    @Override
    public final long d(long j10) {
        ArrayList arrayList = this.f58899a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((b4.a) arrayList.get(0)).f2353b) {
                long j11 = ((b4.a) arrayList.get(0)).f2353b;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long j12 = ((b4.a) arrayList.get(i3)).f2353b;
                    long j13 = ((b4.a) arrayList.get(i3)).d;
                    if (j13 <= j10) {
                        j11 = Math.max(j11, j13);
                    } else if (j12 > j10) {
                        break;
                    } else {
                        j11 = Math.max(j11, j12);
                    }
                }
                return j11;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final void e(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f58899a;
            if (i3 < arrayList.size()) {
                int i10 = (j10 > ((b4.a) arrayList.get(i3)).f2353b ? 1 : (j10 == ((b4.a) arrayList.get(i3)).f2353b ? 0 : -1));
                if (i10 > 0 && j10 > ((b4.a) arrayList.get(i3)).d) {
                    arrayList.remove(i3);
                    i3--;
                } else if (i10 < 0) {
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
