package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f39648a;
    public final c1 f39649b;
    public final String f39650c;

    public y(c1 c1Var, String str, int i10) {
        this.f39648a = i10;
        this.f39649b = c1Var;
        this.f39650c = str;
    }

    @Override
    public final void run() {
        switch (this.f39648a) {
            case 0:
                y0 y0Var = this.f39649b.f39381a;
                if (y0Var != null) {
                    y0Var.d(this.f39650c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f39649b;
                c1Var.K = false;
                c1Var.M = 0L;
                c1Var.Q = false;
                String str = this.f39650c;
                c1Var.f39383b = str;
                c1Var.c();
                y0 y0Var2 = c1Var.f39381a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    c1Var.f39381a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
