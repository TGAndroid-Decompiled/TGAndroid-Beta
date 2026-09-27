package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39224a;
    public final c1 f39225b;
    public final String f39226c;

    public x(c1 c1Var, String str, int i10) {
        this.f39224a = i10;
        this.f39225b = c1Var;
        this.f39226c = str;
    }

    @Override
    public final void run() {
        switch (this.f39224a) {
            case 0:
                z0 z0Var = this.f39225b.f38958a;
                if (z0Var != null) {
                    z0Var.d(this.f39226c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f39225b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f39226c;
                c1Var.f38960b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f38958a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f38958a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
