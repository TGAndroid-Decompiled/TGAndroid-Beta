package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42857a;
    public final a1 f42858b;
    public final String f42859c;

    public y(a1 a1Var, String str, int i10) {
        this.f42857a = i10;
        this.f42858b = a1Var;
        this.f42859c = str;
    }

    @Override
    public final void run() {
        switch (this.f42857a) {
            case 0:
                x0 x0Var = this.f42858b.f42561a;
                if (x0Var != null) {
                    x0Var.d(this.f42859c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42858b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42859c;
                a1Var.f42563b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42561a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42561a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
