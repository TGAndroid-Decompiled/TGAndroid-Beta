package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f51389a;
    public final x0 f51390b;
    public final String f51391c;

    public z(x0 x0Var, String str, int i7) {
        this.f51389a = i7;
        this.f51390b = x0Var;
        this.f51391c = str;
    }

    @Override
    public final void run() {
        switch (this.f51389a) {
            case 0:
                u0 u0Var = this.f51390b.f51341a;
                if (u0Var != null) {
                    u0Var.d(this.f51391c);
                    return;
                }
                return;
            default:
                x0 x0Var = this.f51390b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.f51391c;
                x0Var.f51343b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.f51341a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.f51341a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
