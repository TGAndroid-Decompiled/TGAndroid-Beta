package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43751a;
    public final b1 f43752b;
    public final String f43753c;

    public x(b1 b1Var, String str, int i10) {
        this.f43751a = i10;
        this.f43752b = b1Var;
        this.f43753c = str;
    }

    @Override
    public final void run() {
        switch (this.f43751a) {
            case 0:
                y0 y0Var = this.f43752b.f43460a;
                if (y0Var != null) {
                    y0Var.d(this.f43753c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43752b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43753c;
                b1Var.f43462b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43460a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43460a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
