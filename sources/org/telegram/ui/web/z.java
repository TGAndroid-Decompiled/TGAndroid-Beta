package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f51408a;
    public final x0 f51409b;
    public final String f51410c;

    public z(x0 x0Var, String str, int i7) {
        this.f51408a = i7;
        this.f51409b = x0Var;
        this.f51410c = str;
    }

    @Override
    public final void run() {
        switch (this.f51408a) {
            case 0:
                u0 u0Var = this.f51409b.f51360a;
                if (u0Var != null) {
                    u0Var.d(this.f51410c);
                    return;
                }
                return;
            default:
                x0 x0Var = this.f51409b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.f51410c;
                x0Var.f51362b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.f51360a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.f51360a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
