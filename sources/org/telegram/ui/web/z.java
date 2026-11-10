package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f51343a;
    public final x0 f51344b;
    public final String f51345c;

    public z(x0 x0Var, String str, int i7) {
        this.f51343a = i7;
        this.f51344b = x0Var;
        this.f51345c = str;
    }

    @Override
    public final void run() {
        switch (this.f51343a) {
            case 0:
                u0 u0Var = this.f51344b.f51295a;
                if (u0Var != null) {
                    u0Var.d(this.f51345c);
                    return;
                }
                return;
            default:
                x0 x0Var = this.f51344b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.f51345c;
                x0Var.f51297b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.f51295a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.f51295a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
