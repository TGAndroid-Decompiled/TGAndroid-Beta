package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42861a;
    public final a1 f42862b;
    public final String f42863c;

    public y(a1 a1Var, String str, int i10) {
        this.f42861a = i10;
        this.f42862b = a1Var;
        this.f42863c = str;
    }

    @Override
    public final void run() {
        switch (this.f42861a) {
            case 0:
                x0 x0Var = this.f42862b.f42565a;
                if (x0Var != null) {
                    x0Var.d(this.f42863c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42862b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42863c;
                a1Var.f42567b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42565a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42565a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
