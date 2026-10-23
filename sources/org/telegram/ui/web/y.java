package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f43325a;
    public final b1 f43326b;
    public final String f43327c;

    public y(b1 b1Var, String str, int i10) {
        this.f43325a = i10;
        this.f43326b = b1Var;
        this.f43327c = str;
    }

    @Override
    public final void run() {
        switch (this.f43325a) {
            case 0:
                y0 y0Var = this.f43326b.f43043a;
                if (y0Var != null) {
                    y0Var.d(this.f43327c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43326b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43327c;
                b1Var.f43045b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43043a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43043a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
