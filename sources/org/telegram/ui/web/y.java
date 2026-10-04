package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42416a;
    public final c1 f42417b;
    public final String f42418c;

    public y(c1 c1Var, String str, int i10) {
        this.f42416a = i10;
        this.f42417b = c1Var;
        this.f42418c = str;
    }

    @Override
    public final void run() {
        switch (this.f42416a) {
            case 0:
                z0 z0Var = this.f42417b.f42119a;
                if (z0Var != null) {
                    z0Var.d(this.f42418c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f42417b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f42418c;
                c1Var.f42121b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f42119a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f42119a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
