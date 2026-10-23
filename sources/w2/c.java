package w2;

import e9.c0;
import e9.k0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.ArrayList;
import sg.y;
import v7.u6;
public final class c implements a {
    public static final c0 f48470b = new c0(new r(new y(23), s1.f8497b), new r(new y(24), s1.f8498c));
    public final ArrayList f48471a = new ArrayList();

    @Override
    public final long a(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f48471a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j12 = ((z3.a) arrayList.get(i10)).f50646b;
            long j13 = ((z3.a) arrayList.get(i10)).d;
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
                i10++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final n0 b(long j10) {
        ArrayList arrayList = this.f48471a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.a) arrayList.get(0)).f50646b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.a aVar = (z3.a) arrayList.get(i10);
                    if (j10 >= aVar.f50646b && j10 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f50646b) {
                        break;
                    }
                }
                x1 A = n0.A(f48470b, arrayList2);
                k0 t10 = n0.t();
                for (int i11 = 0; i11 < A.d; i11++) {
                    t10.d(((z3.a) A.get(i11)).f50645a);
                }
                return t10.f();
            }
        }
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final boolean c(z3.a aVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11 = aVar.f50646b;
        if (j11 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (aVar.f50647c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        if (j11 <= j10 && j10 < aVar.d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f48471a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((z3.a) arrayList.get(size)).f50646b) {
                arrayList.add(size + 1, aVar);
                return z12;
            }
        }
        arrayList.add(0, aVar);
        return z12;
    }

    @Override
    public final void clear() {
        this.f48471a.clear();
    }

    @Override
    public final long d(long j10) {
        ArrayList arrayList = this.f48471a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.a) arrayList.get(0)).f50646b) {
                long j11 = ((z3.a) arrayList.get(0)).f50646b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long j12 = ((z3.a) arrayList.get(i10)).f50646b;
                    long j13 = ((z3.a) arrayList.get(i10)).d;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48471a;
            if (i10 < arrayList.size()) {
                int i11 = (j10 > ((z3.a) arrayList.get(i10)).f50646b ? 1 : (j10 == ((z3.a) arrayList.get(i10)).f50646b ? 0 : -1));
                if (i11 > 0 && j10 > ((z3.a) arrayList.get(i10)).d) {
                    arrayList.remove(i10);
                    i10--;
                } else if (i11 < 0) {
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
