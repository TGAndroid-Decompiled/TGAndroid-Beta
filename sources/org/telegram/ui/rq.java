package org.telegram.ui;
public final class rq implements Runnable {
    public final int f50993a;
    public final sq f50994b;

    public rq(sq sqVar, int i7) {
        this.f50993a = i7;
        this.f50994b = sqVar;
    }

    @Override
    public final void run() {
        switch (this.f50993a) {
            case 0:
                bi.v3 v3Var = this.f50994b.f38880a;
                if (v3Var != null) {
                    v3Var.f39892g3.O(true);
                    return;
                }
                return;
            default:
                bi.v3 v3Var2 = this.f50994b.f38880a;
                if (v3Var2 != null) {
                    v3Var2.f39892g3.O(true);
                    return;
                }
                return;
        }
    }
}
