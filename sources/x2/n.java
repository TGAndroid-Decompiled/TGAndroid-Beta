package x2;

import a8.ma;
import java.util.List;
public final class n implements f1 {
    public final h9.s1 f60291a;
    public long f60292b;

    public n(List list, List list2) {
        boolean z10;
        h9.f0 p10 = h9.i0.p();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        for (int i7 = 0; i7 < list.size(); i7++) {
            p10.c(new m((f1) list.get(i7), (List) list2.get(i7)));
        }
        this.f60291a = p10.f();
        this.f60292b = -9223372036854775807L;
    }

    @Override
    public final boolean d(l2.t0 t0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long f10 = f();
            if (f10 == Long.MIN_VALUE) {
                return z12;
            }
            int i7 = 0;
            z10 = false;
            while (true) {
                h9.s1 s1Var = this.f60291a;
                if (i7 < s1Var.d) {
                    long f11 = ((m) s1Var.get(i7)).f60270a.f();
                    if (f11 != Long.MIN_VALUE && f11 <= t0Var.f19642a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (f11 == f10 || z11) {
                        z10 |= ((m) s1Var.get(i7)).f60270a.d(t0Var);
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
    public final long f() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.f60291a;
            if (i7 >= s1Var.d) {
                break;
            }
            long f10 = ((m) s1Var.get(i7)).f60270a.f();
            if (f10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, f10);
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
            h9.s1 s1Var = this.f60291a;
            if (i7 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i7)).f60270a.g()) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final long r() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        while (true) {
            h9.s1 s1Var = this.f60291a;
            if (i7 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i7);
            long r10 = mVar.f60270a.r();
            h9.i0 i0Var = mVar.f60271b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && r10 != Long.MIN_VALUE) {
                j3 = Math.min(j3, r10);
            }
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
            i7++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f60292b = j3;
            return j3;
        } else if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j11 = this.f60292b;
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
            h9.s1 s1Var = this.f60291a;
            if (i7 < s1Var.d) {
                ((m) s1Var.get(i7)).u(j3);
                i7++;
            } else {
                return;
            }
        }
    }
}
