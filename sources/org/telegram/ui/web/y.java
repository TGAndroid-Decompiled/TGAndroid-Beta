package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42415a;
    public final c1 f42416b;
    public final String f42417c;

    public y(c1 c1Var, String str, int i10) {
        this.f42415a = i10;
        this.f42416b = c1Var;
        this.f42417c = str;
    }

    @Override
    public final void run() {
        switch (this.f42415a) {
            case 0:
                z0 z0Var = this.f42416b.f42118a;
                if (z0Var != null) {
                    z0Var.d(this.f42417c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f42416b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f42417c;
                c1Var.f42120b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f42118a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f42118a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
