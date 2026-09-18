package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39115a;
    public final d1 f39116b;
    public final String f39117c;

    public y(d1 d1Var, String str, int i10) {
        this.f39115a = i10;
        this.f39116b = d1Var;
        this.f39117c = str;
    }

    @Override
    public final void run() {
        switch (this.f39115a) {
            case 0:
                z0 z0Var = this.f39116b.f38851a;
                if (z0Var != null) {
                    z0Var.d(this.f39117c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f39116b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39117c;
                d1Var.f38853b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38851a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38851a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
