package org.telegram.ui;
public final class rq implements Runnable {
    public final int f50997a;
    public final sq f50998b;

    public rq(sq sqVar, int i7) {
        this.f50997a = i7;
        this.f50998b = sqVar;
    }

    @Override
    public final void run() {
        switch (this.f50997a) {
            case 0:
                bi.v3 v3Var = this.f50998b.f38882a;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    return;
                }
                return;
            default:
                bi.v3 v3Var2 = this.f50998b.f38882a;
                if (v3Var2 != null) {
                    v3Var2.f39895g3.O(true);
                    return;
                }
                return;
        }
    }
}
