package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39136a;
    public final d1 f39137b;
    public final String f39138c;

    public y(d1 d1Var, String str, int i10) {
        this.f39136a = i10;
        this.f39137b = d1Var;
        this.f39138c = str;
    }

    @Override
    public final void run() {
        switch (this.f39136a) {
            case 0:
                z0 z0Var = this.f39137b.f38872a;
                if (z0Var != null) {
                    z0Var.d(this.f39138c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f39137b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39138c;
                d1Var.f38874b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38872a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38872a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
