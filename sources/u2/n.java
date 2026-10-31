package u2;

import e9.x1;
import java.util.List;
import v7.t6;
public final class n implements f1 {
    public final x1 f49946a;
    public long f49947b;

    public n(List list, List list2) {
        boolean z10;
        e9.k0 t10 = e9.n0.t();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.c(new m((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.f49946a = t10.f();
        this.f49947b = -9223372036854775807L;
    }

    @Override
    public final long c() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            x1 x1Var = this.f49946a;
            if (i10 >= x1Var.d) {
                break;
            }
            long c10 = ((m) x1Var.get(i10)).f49927a.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
            i10++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public final boolean d() {
        int i10 = 0;
        while (true) {
            x1 x1Var = this.f49946a;
            if (i10 >= x1Var.d) {
                return false;
            }
            if (((m) x1Var.get(i10)).f49927a.d()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean m(i2.w0 w0Var) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                return z12;
            }
            int i10 = 0;
            z10 = false;
            while (true) {
                x1 x1Var = this.f49946a;
                if (i10 < x1Var.d) {
                    long c11 = ((m) x1Var.get(i10)).f49927a.c();
                    if (c11 != Long.MIN_VALUE && c11 <= w0Var.f8107a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c11 == c10 || z11) {
                        z10 |= ((m) x1Var.get(i10)).f49927a.m(w0Var);
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
            x1 x1Var = this.f49946a;
            if (i10 >= x1Var.d) {
                break;
            }
            m mVar = (m) x1Var.get(i10);
            long s10 = mVar.f49927a.s();
            e9.n0 n0Var = mVar.f49928b;
            if ((n0Var.contains(1) || n0Var.contains(2) || n0Var.contains(4)) && s10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, s10);
            }
            if (s10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, s10);
            }
            i10++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.f49947b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f49947b;
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
            x1 x1Var = this.f49946a;
            if (i10 < x1Var.d) {
                ((m) x1Var.get(i10)).u(j10);
                i10++;
            } else {
                return;
            }
        }
    }
}
