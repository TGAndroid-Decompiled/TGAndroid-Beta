package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f51396a;
    public final x0 f51397b;
    public final String f51398c;

    public z(x0 x0Var, String str, int i7) {
        this.f51396a = i7;
        this.f51397b = x0Var;
        this.f51398c = str;
    }

    @Override
    public final void run() {
        switch (this.f51396a) {
            case 0:
                u0 u0Var = this.f51397b.f51348a;
                if (u0Var != null) {
                    u0Var.d(this.f51398c);
                    return;
                }
                return;
            default:
                x0 x0Var = this.f51397b;
                x0Var.N = false;
                x0Var.P = 0L;
                x0Var.T = false;
                String str = this.f51398c;
                x0Var.f51350b = str;
                x0Var.c();
                u0 u0Var2 = x0Var.f51348a;
                if (u0Var2 != null) {
                    u0Var2.onResume();
                    x0Var.f51348a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
