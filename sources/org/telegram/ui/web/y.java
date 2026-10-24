package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f43314a;
    public final b1 f43315b;
    public final String f43316c;

    public y(b1 b1Var, String str, int i10) {
        this.f43314a = i10;
        this.f43315b = b1Var;
        this.f43316c = str;
    }

    @Override
    public final void run() {
        switch (this.f43314a) {
            case 0:
                y0 y0Var = this.f43315b.f43032a;
                if (y0Var != null) {
                    y0Var.d(this.f43316c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43315b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43316c;
                b1Var.f43034b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43032a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43032a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
