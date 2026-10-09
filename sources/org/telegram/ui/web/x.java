package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43531a;
    public final b1 f43532b;
    public final String f43533c;

    public x(b1 b1Var, String str, int i10) {
        this.f43531a = i10;
        this.f43532b = b1Var;
        this.f43533c = str;
    }

    @Override
    public final void run() {
        switch (this.f43531a) {
            case 0:
                y0 y0Var = this.f43532b.f43237a;
                if (y0Var != null) {
                    y0Var.d(this.f43533c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43532b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43533c;
                b1Var.f43239b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43237a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43237a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
