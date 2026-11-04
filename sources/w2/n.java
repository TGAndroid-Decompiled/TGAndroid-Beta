package w2;

import b8.zb;
import java.util.List;
public final class n implements f1 {
    public final g9.s1 f57156a;
    public long f57157b;

    public n(List list, List list2) {
        boolean z10;
        g9.f0 p10 = g9.i0.p();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        for (int i3 = 0; i3 < list.size(); i3++) {
            p10.c(new m((f1) list.get(i3), (List) list2.get(i3)));
        }
        this.f57156a = p10.f();
        this.f57157b = -9223372036854775807L;
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z12;
            }
            int i3 = 0;
            z10 = false;
            while (true) {
                g9.s1 s1Var = this.f57156a;
                if (i3 < s1Var.d) {
                    long e11 = ((m) s1Var.get(i3)).f57135a.e();
                    if (e11 != Long.MIN_VALUE && e11 <= v0Var.f16753a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (e11 == e10 || z11) {
                        z10 |= ((m) s1Var.get(i3)).f57135a.c(v0Var);
                    }
                    i3++;
                } else {
                    z12 |= z10;
                }
            }
        } while (z10);
        return z12;
    }

    @Override
    public final boolean d() {
        int i3 = 0;
        while (true) {
            g9.s1 s1Var = this.f57156a;
            if (i3 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i3)).f57135a.d()) {
                return true;
            }
            i3++;
        }
    }

    @Override
    public final long e() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            g9.s1 s1Var = this.f57156a;
            if (i3 >= s1Var.d) {
                break;
            }
            long e10 = ((m) s1Var.get(i3)).f57135a.e();
            if (e10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e10);
            }
            i3++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public final long q() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            g9.s1 s1Var = this.f57156a;
            if (i3 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i3);
            long q10 = mVar.f57135a.q();
            g9.i0 i0Var = mVar.f57136b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && q10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, q10);
            }
            if (q10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, q10);
            }
            i3++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.f57157b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f57157b;
            if (j12 != -9223372036854775807L) {
                return j12;
            }
            return j11;
        }
    }

    @Override
    public final void t(long j10) {
        int i3 = 0;
        while (true) {
            g9.s1 s1Var = this.f57156a;
            if (i3 < s1Var.d) {
                ((m) s1Var.get(i3)).t(j10);
                i3++;
            } else {
                return;
            }
        }
    }
}
