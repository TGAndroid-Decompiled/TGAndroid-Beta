package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42850a;
    public final a1 f42851b;
    public final String f42852c;

    public y(a1 a1Var, String str, int i10) {
        this.f42850a = i10;
        this.f42851b = a1Var;
        this.f42852c = str;
    }

    @Override
    public final void run() {
        switch (this.f42850a) {
            case 0:
                x0 x0Var = this.f42851b.f42554a;
                if (x0Var != null) {
                    x0Var.d(this.f42852c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42851b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42852c;
                a1Var.f42556b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42554a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42554a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
