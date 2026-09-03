package z2;

import android.content.Context;
import h7.u;
import o4.n0;
import s5.m;
public final class d implements a3.b, n0 {
    public final Object f50999a;

    public d(Object obj) {
        this.f50999a = obj;
    }

    @Override
    public boolean b() {
        for (n0 n0Var : (n0[]) this.f50999a) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public long e() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f50999a) {
            long e6 = n0Var.e();
            if (e6 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e6);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public Object mo38get() {
        return new m((Context) ((a3.c) this.f50999a).f49a, new z9.d(7), new u(7), 13);
    }

    @Override
    public boolean m(long j10) {
        n0[] n0VarArr;
        boolean z4;
        boolean z10;
        boolean z11 = false;
        do {
            long e6 = e();
            if (e6 == Long.MIN_VALUE) {
                return z11;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.f50999a) {
                long e10 = n0Var.e();
                if (e10 != Long.MIN_VALUE && e10 <= j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e10 == e6 || z10) {
                    z4 |= n0Var.m(j10);
                }
            }
            z11 |= z4;
        } while (z4);
        return z11;
    }

    @Override
    public long r() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.f50999a) {
            long r10 = n0Var.r();
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override
    public void t(long j10) {
        for (n0 n0Var : (n0[]) this.f50999a) {
            n0Var.t(j10);
        }
    }
}
