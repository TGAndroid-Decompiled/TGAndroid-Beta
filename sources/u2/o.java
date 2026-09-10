package u2;

import java.util.List;
public final class o implements f1 {
    public final e9.a1 f42402a;
    public long f42403b;

    public o(List list, List list2) {
        boolean z10;
        e9.f0 u10 = e9.i0.u();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            u10.b(new n((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.f42402a = u10.i();
        this.f42403b = -9223372036854775807L;
    }

    @Override
    public final boolean c() {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.f42402a;
            if (i10 >= a1Var.d) {
                return false;
            }
            if (((n) a1Var.get(i10)).f42390a.c()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final long d() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.f42402a;
            if (i10 >= a1Var.d) {
                break;
            }
            long d = ((n) a1Var.get(i10)).f42390a.d();
            if (d != Long.MIN_VALUE) {
                j3 = Math.min(j3, d);
            }
            i10++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
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
                e9.a1 a1Var = this.f42402a;
                if (i10 < a1Var.d) {
                    long d10 = ((n) a1Var.get(i10)).f42390a.d();
                    if (d10 != Long.MIN_VALUE && d10 <= q0Var.f10347a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d10 == d || z11) {
                        z10 |= ((n) a1Var.get(i10)).f42390a.n(q0Var);
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
    public final long r() {
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.f42402a;
            if (i10 >= a1Var.d) {
                break;
            }
            n nVar = (n) a1Var.get(i10);
            long r10 = nVar.f42390a.r();
            e9.i0 i0Var = nVar.f42391b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && r10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, r10);
            }
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
            i10++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f42403b = j3;
            return j3;
        } else if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j11 = this.f42403b;
            if (j11 != -9223372036854775807L) {
                return j11;
            }
            return j10;
        }
    }

    @Override
    public final void u(long j3) {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.f42402a;
            if (i10 < a1Var.d) {
                ((n) a1Var.get(i10)).u(j3);
                i10++;
            } else {
                return;
            }
        }
    }
}
