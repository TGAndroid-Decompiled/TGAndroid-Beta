package x2;

import a8.ja;
import java.util.List;
public final class n implements d1 {
    public final h9.s1 f59607a;
    public long f59608b;

    public n(List list, List list2) {
        boolean z10;
        h9.f0 p10 = h9.i0.p();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        for (int i7 = 0; i7 < list.size(); i7++) {
            p10.c(new m((d1) list.get(i7), (List) list2.get(i7)));
        }
        this.f59607a = p10.f();
        this.f59608b = -9223372036854775807L;
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long e10 = e();
            if (e10 == Long.MIN_VALUE) {
                return z12;
            }
            int i7 = 0;
            z10 = false;
            while (true) {
                h9.s1 s1Var = this.f59607a;
                if (i7 < s1Var.d) {
                    long e11 = ((m) s1Var.get(i7)).f59601a.e();
                    if (e11 != Long.MIN_VALUE && e11 <= s0Var.f19177a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (e11 == e10 || z11) {
                        z10 |= ((m) s1Var.get(i7)).f59601a.c(s0Var);
                    }
                    i7++;
                } else {
                    z12 |= z10;
                }
            }
        } while (z10);
        return z12;
    }

    @Override
    public final long e() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.f59607a;
            if (i7 >= s1Var.d) {
                break;
            }
            long e10 = ((m) s1Var.get(i7)).f59601a.e();
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
            h9.s1 s1Var = this.f59607a;
            if (i7 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i7)).f59601a.g()) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final long s() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.f59607a;
            if (i7 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i7);
            long s5 = mVar.f59601a.s();
            h9.i0 i0Var = mVar.f59602b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && s5 != Long.MIN_VALUE) {
                j3 = Math.min(j3, s5);
            }
            if (s5 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s5);
            }
            i7++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f59608b = j3;
            return j3;
        } else if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j11 = this.f59608b;
            if (j11 != -9223372036854775807L) {
                return j11;
            }
            return j10;
        }
    }

    @Override
    public final void u(long j3) {
        int i7 = 0;
        while (true) {
            h9.s1 s1Var = this.f59607a;
            if (i7 < s1Var.d) {
                ((m) s1Var.get(i7)).u(j3);
                i7++;
            } else {
                return;
            }
        }
    }
}
