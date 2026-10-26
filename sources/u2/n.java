package u2;

import a8.yb;
import java.util.List;
public final class n implements f1 {
    public final f9.s1 f49368a;
    public long f49369b;

    public n(List list, List list2) {
        boolean z10;
        f9.f0 t10 = f9.i0.t();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.c(new m((f1) list.get(i10), (List) list2.get(i10)));
        }
        this.f49368a = t10.f();
        this.f49369b = -9223372036854775807L;
    }

    @Override
    public final long b() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            f9.s1 s1Var = this.f49368a;
            if (i10 >= s1Var.d) {
                break;
            }
            long b10 = ((m) s1Var.get(i10)).f49349a.b();
            if (b10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b10);
            }
            i10++;
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public final boolean c() {
        int i10 = 0;
        while (true) {
            f9.s1 s1Var = this.f49368a;
            if (i10 >= s1Var.d) {
                return false;
            }
            if (((m) s1Var.get(i10)).f49349a.c()) {
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
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                return z12;
            }
            int i10 = 0;
            z10 = false;
            while (true) {
                f9.s1 s1Var = this.f49368a;
                if (i10 < s1Var.d) {
                    long b11 = ((m) s1Var.get(i10)).f49349a.b();
                    if (b11 != Long.MIN_VALUE && b11 <= w0Var.f13783a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (b11 == b10 || z11) {
                        z10 |= ((m) s1Var.get(i10)).f49349a.m(w0Var);
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
    public final long q() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        while (true) {
            f9.s1 s1Var = this.f49368a;
            if (i10 >= s1Var.d) {
                break;
            }
            m mVar = (m) s1Var.get(i10);
            long q5 = mVar.f49349a.q();
            f9.i0 i0Var = mVar.f49350b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && q5 != Long.MIN_VALUE) {
                j10 = Math.min(j10, q5);
            }
            if (q5 != Long.MIN_VALUE) {
                j11 = Math.min(j11, q5);
            }
            i10++;
        }
        if (j10 != Long.MAX_VALUE) {
            this.f49369b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f49369b;
            if (j12 != -9223372036854775807L) {
                return j12;
            }
            return j11;
        }
    }

    @Override
    public final void s(long j10) {
        int i10 = 0;
        while (true) {
            f9.s1 s1Var = this.f49368a;
            if (i10 < s1Var.d) {
                ((m) s1Var.get(i10)).s(j10);
                i10++;
            } else {
                return;
            }
        }
    }
}
