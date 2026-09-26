package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39266a;
    public final b1 f39267b;
    public final String f39268c;

    public x(b1 b1Var, String str, int i10) {
        this.f39266a = i10;
        this.f39267b = b1Var;
        this.f39268c = str;
    }

    @Override
    public final void run() {
        switch (this.f39266a) {
            case 0:
                y0 y0Var = this.f39267b.f38996a;
                if (y0Var != null) {
                    y0Var.d(this.f39268c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f39267b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f39268c;
                b1Var.f38998b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f38996a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f38996a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
