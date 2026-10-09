package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43529a;
    public final b1 f43530b;
    public final String f43531c;

    public x(b1 b1Var, String str, int i10) {
        this.f43529a = i10;
        this.f43530b = b1Var;
        this.f43531c = str;
    }

    @Override
    public final void run() {
        switch (this.f43529a) {
            case 0:
                y0 y0Var = this.f43530b.f43235a;
                if (y0Var != null) {
                    y0Var.d(this.f43531c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43530b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43531c;
                b1Var.f43237b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43235a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43235a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
