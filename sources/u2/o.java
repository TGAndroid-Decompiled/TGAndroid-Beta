package u2;

import e9.x1;
import java.util.List;
import v7.u6;
public final class o implements f1 {
    public final x1 f47408a;
    public long f47409b;

    public o(List list, List list2) {
        boolean z10;
        e9.k0 t10 = e9.n0.t();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.c(new n((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.f47408a = t10.f();
        this.f47409b = -9223372036854775807L;
    }

    @Override
    public final boolean c() {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.f47408a;
            if (i10 >= x1Var.d) {
                return false;
            }
            if (((n) x1Var.get(i10)).f47396a.c()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final long d() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.f47408a;
            if (i10 >= x1Var.d) {
                break;
            }
            long d = ((n) x1Var.get(i10)).f47396a.d();
            if (d != Long.MIN_VALUE) {
                j10 = Math.min(j10, d);
            }
            i10++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public final boolean p(i2.t0 t0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long d = d();
            if (d == Long.MIN_VALUE) {
                return z12;
            }
            int i10 = 0;
            z10 = false;
            while (true) {
                x1 x1Var = this.f47408a;
                if (i10 < x1Var.d) {
                    long d10 = ((n) x1Var.get(i10)).f47396a.d();
                    if (d10 != Long.MIN_VALUE && d10 <= t0Var.f12594a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d10 == d || z11) {
                        z10 |= ((n) x1Var.get(i10)).f47396a.p(t0Var);
                    }
                    i10++;
                } else {
                    z12 |= z10;
                }
            }
        } while (z10);
        return z12;
    }

    @Override
    public final long s() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.f47408a;
            if (i10 >= x1Var.d) {
                break;
            }
            n nVar = (n) x1Var.get(i10);
            long s10 = nVar.f47396a.s();
            e9.n0 n0Var = nVar.f47397b;
            if ((n0Var.contains(1) || n0Var.contains(2) || n0Var.contains(4)) && s10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s10);
            }
            if (s10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, s10);
            }
            i10++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.f47409b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f47409b;
            if (j12 != -9223372036854775807L) {
                return j12;
            }
            return j11;
        }
    }

    @Override
    public final void u(long j10) {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.f47408a;
            if (i10 < x1Var.d) {
                ((n) x1Var.get(i10)).u(j10);
                i10++;
            } else {
                return;
            }
        }
    }
}
