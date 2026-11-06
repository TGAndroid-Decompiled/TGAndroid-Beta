package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f51401a;
    public final x0 f51402b;
    public final String f51403c;

    public z(x0 x0Var, String str, int i7) {
        this.f51401a = i7;
        this.f51402b = x0Var;
        this.f51403c = str;
    }

    @Override
    public final void run() {
        switch (this.f51401a) {
            case 0:
                u0 u0Var = this.f51402b.f51353a;
                if (u0Var != null) {
                    u0Var.d(this.f51403c);
                    return;
                }
                return;
            default:
                x0 x0Var = this.f51402b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.f51403c;
                x0Var.f51355b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.f51353a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.f51353a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
