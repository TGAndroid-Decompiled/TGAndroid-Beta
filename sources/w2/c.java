package w2;

import e9.a0;
import e9.a1;
import e9.f0;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.ArrayList;
public final class c implements a {
    public static final a0 f47942b = new a0(new p(new t0.a(16), x0.f9050b), new p(new t0.a(17), x0.f9051c));
    public final ArrayList f47943a = new ArrayList();

    @Override
    public final long a(long j3) {
        int i10 = 0;
        long j10 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f47943a;
            if (i10 >= arrayList.size()) {
                break;
            }
            long j11 = ((z3.a) arrayList.get(i10)).f50712b;
            long j12 = ((z3.a) arrayList.get(i10)).d;
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
                i10++;
            }
        }
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final i0 b(long j3) {
        ArrayList arrayList = this.f47943a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((z3.a) arrayList.get(0)).f50712b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    z3.a aVar = (z3.a) arrayList.get(i10);
                    if (j3 >= aVar.f50712b && j3 < aVar.d) {
                        arrayList2.add(aVar);
                    }
                    if (j3 < aVar.f50712b) {
                        break;
                    }
                }
                a1 B = i0.B(f47942b, arrayList2);
                f0 u10 = i0.u();
                for (int i11 = 0; i11 < B.d; i11++) {
                    u10.d(((z3.a) B.get(i11)).f50711a);
                }
                return u10.i();
            }
        }
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
    }

    @Override
    public final boolean c(z3.a aVar, long j3) {
        boolean z10;
        boolean z11;
        boolean z12;
        long j10 = aVar.f50712b;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (aVar.f50713c != -9223372036854775807L) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        if (j10 <= j3 && j3 < aVar.d) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = this.f47943a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((z3.a) arrayList.get(size)).f50712b) {
                arrayList.add(size + 1, aVar);
                return z12;
            }
        }
        arrayList.add(0, aVar);
        return z12;
    }

    @Override
    public final void clear() {
        this.f47943a.clear();
    }

    @Override
    public final long d(long j3) {
        ArrayList arrayList = this.f47943a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((z3.a) arrayList.get(0)).f50712b) {
                long j10 = ((z3.a) arrayList.get(0)).f50712b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long j11 = ((z3.a) arrayList.get(i10)).f50712b;
                    long j12 = ((z3.a) arrayList.get(i10)).d;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47943a;
            if (i10 < arrayList.size()) {
                int i11 = (j3 > ((z3.a) arrayList.get(i10)).f50712b ? 1 : (j3 == ((z3.a) arrayList.get(i10)).f50712b ? 0 : -1));
                if (i11 > 0 && j3 > ((z3.a) arrayList.get(i10)).d) {
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
