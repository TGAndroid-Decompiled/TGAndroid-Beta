package x2;

import a8.ia;
import h9.t1;
import java.util.List;
public final class n implements e1 {
    public final t1 f58290a;
    public long f58291b;

    public n(List list, List list2) {
        boolean z9;
        h9.f0 p10 = h9.i0.p();
        if (list.size() == list2.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        for (int i7 = 0; i7 < list.size(); i7++) {
            p10.c(new m((e1) list.get(i7), (List) list2.get(i7)));
        }
        this.f58290a = p10.f();
        this.f58291b = -9223372036854775807L;
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z11;
            }
            int i7 = 0;
            z9 = false;
            while (true) {
                t1 t1Var = this.f58290a;
                if (i7 < t1Var.d) {
                    long e11 = ((m) t1Var.get(i7)).f58272a.e();
                    if (e11 != Long.MIN_VALUE && e11 <= v0Var.f18064a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (e11 == e10 || z10) {
                        z9 |= ((m) t1Var.get(i7)).f58272a.c(v0Var);
                    }
                    i7++;
                } else {
                    z11 |= z9;
                }
            }
        } while (z9);
        return z11;
    }

    @Override
    public final long e() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            t1 t1Var = this.f58290a;
            if (i7 >= t1Var.d) {
                break;
            }
            long e10 = ((m) t1Var.get(i7)).f58272a.e();
            if (e10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, e10);
            }
            i7++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override
    public final boolean g() {
        int i7 = 0;
        while (true) {
            t1 t1Var = this.f58290a;
            if (i7 >= t1Var.d) {
                return false;
            }
            if (((m) t1Var.get(i7)).f58272a.g()) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final long p() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            t1 t1Var = this.f58290a;
            if (i7 >= t1Var.d) {
                break;
            }
            m mVar = (m) t1Var.get(i7);
            long p10 = mVar.f58272a.p();
            h9.i0 i0Var = mVar.f58273b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && p10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, p10);
            }
            if (p10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, p10);
            }
            i7++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f58291b = j3;
            return j3;
        } else if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j11 = this.f58291b;
            if (j11 != -9223372036854775807L) {
                return j11;
            }
            return j10;
        }
    }

    @Override
    public final void r(long j3) {
        int i7 = 0;
        while (true) {
            t1 t1Var = this.f58290a;
            if (i7 < t1Var.d) {
                ((m) t1Var.get(i7)).r(j3);
                i7++;
            } else {
                return;
            }
        }
    }
}
