package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f38998a;
    public final d1 f38999b;
    public final String f39000c;

    public y(d1 d1Var, String str, int i10) {
        this.f38998a = i10;
        this.f38999b = d1Var;
        this.f39000c = str;
    }

    @Override
    public final void run() {
        switch (this.f38998a) {
            case 0:
                z0 z0Var = this.f38999b.f38736a;
                if (z0Var != null) {
                    z0Var.d(this.f39000c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f38999b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39000c;
                d1Var.f38738b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38736a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38736a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
