package u2;

import java.util.List;
public final class n implements d1 {
    public final e9.a1 f46781a;
    public long f46782b;

    public n(List list, List list2) {
        boolean z10;
        e9.f0 u10 = e9.i0.u();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            u10.b(new m((d1) list.get(i10), (List) list2.get(i10)));
        }
        this.f46781a = u10.i();
        this.f46782b = -9223372036854775807L;
    }

    @Override
    public final boolean c() {
        int i10 = 0;
        while (true) {
            e9.a1 a1Var = this.f46781a;
            if (i10 >= a1Var.d) {
                return false;
            }
            if (((m) a1Var.get(i10)).f46769a.c()) {
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
            e9.a1 a1Var = this.f46781a;
            if (i10 >= a1Var.d) {
                break;
            }
            long d = ((m) a1Var.get(i10)).f46769a.d();
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
    public final boolean p(i2.r0 r0Var) {
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
                e9.a1 a1Var = this.f46781a;
                if (i10 < a1Var.d) {
                    long d10 = ((m) a1Var.get(i10)).f46769a.d();
                    if (d10 != Long.MIN_VALUE && d10 <= r0Var.f11753a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d10 == d || z11) {
                        z10 |= ((m) a1Var.get(i10)).f46769a.p(r0Var);
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
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            e9.a1 a1Var = this.f46781a;
            if (i10 >= a1Var.d) {
                break;
            }
            m mVar = (m) a1Var.get(i10);
            long s10 = mVar.f46769a.s();
            e9.i0 i0Var = mVar.f46770b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && s10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, s10);
            }
            if (s10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s10);
            }
            i10++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f46782b = j3;
            return j3;
        } else if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j11 = this.f46782b;
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
            e9.a1 a1Var = this.f46781a;
            if (i10 < a1Var.d) {
                ((m) a1Var.get(i10)).u(j3);
                i10++;
            } else {
                return;
            }
        }
    }
}
