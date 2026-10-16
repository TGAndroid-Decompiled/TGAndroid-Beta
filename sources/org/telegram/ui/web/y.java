package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f41250a;
    public final c1 f41251b;
    public final String f41252c;

    public y(c1 c1Var, String str, int i10) {
        this.f41250a = i10;
        this.f41251b = c1Var;
        this.f41252c = str;
    }

    @Override
    public final void run() {
        switch (this.f41250a) {
            case 0:
                z0 z0Var = this.f41251b.f40981a;
                if (z0Var != null) {
                    z0Var.d(this.f41252c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f41251b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f41252c;
                c1Var.f40983b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f40981a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f40981a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
