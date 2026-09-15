package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39155a;
    public final d1 f39156b;
    public final String f39157c;

    public y(d1 d1Var, String str, int i10) {
        this.f39155a = i10;
        this.f39156b = d1Var;
        this.f39157c = str;
    }

    @Override
    public final void run() {
        switch (this.f39155a) {
            case 0:
                z0 z0Var = this.f39156b.f38893a;
                if (z0Var != null) {
                    z0Var.d(this.f39157c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f39156b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39157c;
                d1Var.f38895b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38893a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38893a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
