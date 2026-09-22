package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39159a;
    public final d1 f39160b;
    public final String f39161c;

    public y(d1 d1Var, String str, int i10) {
        this.f39159a = i10;
        this.f39160b = d1Var;
        this.f39161c = str;
    }

    @Override
    public final void run() {
        switch (this.f39159a) {
            case 0:
                z0 z0Var = this.f39160b.f38899a;
                if (z0Var != null) {
                    z0Var.d(this.f39161c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f39160b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39161c;
                d1Var.f38901b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38899a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38899a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
