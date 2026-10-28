package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f44967a;
    public final a1 f44968b;
    public final String f44969c;

    public y(a1 a1Var, String str, int i10) {
        this.f44967a = i10;
        this.f44968b = a1Var;
        this.f44969c = str;
    }

    @Override
    public final void run() {
        switch (this.f44967a) {
            case 0:
                x0 x0Var = this.f44968b.f44665a;
                if (x0Var != null) {
                    x0Var.d(this.f44969c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f44968b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f44969c;
                a1Var.f44667b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f44665a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f44665a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
