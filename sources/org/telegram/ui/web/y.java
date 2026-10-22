package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42860a;
    public final a1 f42861b;
    public final String f42862c;

    public y(a1 a1Var, String str, int i10) {
        this.f42860a = i10;
        this.f42861b = a1Var;
        this.f42862c = str;
    }

    @Override
    public final void run() {
        switch (this.f42860a) {
            case 0:
                x0 x0Var = this.f42861b.f42564a;
                if (x0Var != null) {
                    x0Var.d(this.f42862c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42861b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42862c;
                a1Var.f42566b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42564a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42564a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
