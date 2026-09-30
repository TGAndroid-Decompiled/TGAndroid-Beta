package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39267a;
    public final b1 f39268b;
    public final String f39269c;

    public x(b1 b1Var, String str, int i10) {
        this.f39267a = i10;
        this.f39268b = b1Var;
        this.f39269c = str;
    }

    @Override
    public final void run() {
        switch (this.f39267a) {
            case 0:
                y0 y0Var = this.f39268b.f38997a;
                if (y0Var != null) {
                    y0Var.d(this.f39269c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f39268b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f39269c;
                b1Var.f38999b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f38997a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f38997a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
