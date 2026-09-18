package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39003a;
    public final d1 f39004b;
    public final String f39005c;

    public y(d1 d1Var, String str, int i10) {
        this.f39003a = i10;
        this.f39004b = d1Var;
        this.f39005c = str;
    }

    @Override
    public final void run() {
        switch (this.f39003a) {
            case 0:
                z0 z0Var = this.f39004b.f38741a;
                if (z0Var != null) {
                    z0Var.d(this.f39005c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f39004b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f39005c;
                d1Var.f38743b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f38741a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f38741a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
