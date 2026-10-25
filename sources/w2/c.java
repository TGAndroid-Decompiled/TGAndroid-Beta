package w2;

import a8.yb;
import f9.f0;
import f9.g0;
import f9.i0;
import f9.n;
import f9.n1;
import f9.s1;
import f9.x;
import java.util.ArrayList;
public final class c implements a {
    public static final x f50651b = new x(new n(new vg.d(7), n1.f10307b), new n(new vg.d(8), n1.f10308c));
    public final ArrayList f50652a = new ArrayList();

    @Override
    public final long a(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f50652a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j12 = ((z3.a) arrayList.get(i10)).f52640b;
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
    public final i0 b(long j10) {
        ArrayList arrayList = this.f50652a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.a) arrayList.get(0)).f52640b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.a aVar = (z3.a) arrayList.get(i10);
                    if (j10 >= aVar.f52640b && j10 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j10 < aVar.f52640b) {
                        break;
                    }
                }
                s1 A = i0.A(f50651b, arrayList2);
                f0 t10 = i0.t();
                for (int i11 = 0; i11 < A.d; i11++) {
                    t10.d(((z3.a) A.get(i11)).f52639a);
                }
                return t10.f();
            }
        }
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final boolean c(z3.a aVar, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j11 = aVar.f52640b;
        if (j11 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        if (aVar.f52641c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        if (j11 <= j10 && j10 < aVar.d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f50652a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((z3.a) arrayList.get(size)).f52640b) {
                arrayList.add(size + 1, aVar);
                return z12;
            }
        }
        arrayList.add(0, aVar);
        return z12;
    }

    @Override
    public final void clear() {
        this.f50652a.clear();
    }

    @Override
    public final long d(long j10) {
        ArrayList arrayList = this.f50652a;
        if (!arrayList.isEmpty()) {
            if (j10 >= ((z3.a) arrayList.get(0)).f52640b) {
                long j11 = ((z3.a) arrayList.get(0)).f52640b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long j12 = ((z3.a) arrayList.get(i10)).f52640b;
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
            ArrayList arrayList = this.f50652a;
            if (i10 < arrayList.size()) {
                int i11 = (j10 > ((z3.a) arrayList.get(i10)).f52640b ? 1 : (j10 == ((z3.a) arrayList.get(i10)).f52640b ? 0 : -1));
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
