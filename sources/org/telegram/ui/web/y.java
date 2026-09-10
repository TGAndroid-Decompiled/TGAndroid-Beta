package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f38149a;
    public final c1 f38150b;
    public final String f38151c;

    public y(c1 c1Var, String str, int i10) {
        this.f38149a = i10;
        this.f38150b = c1Var;
        this.f38151c = str;
    }

    @Override
    public final void run() {
        switch (this.f38149a) {
            case 0:
                y0 y0Var = this.f38150b.f37876a;
                if (y0Var != null) {
                    y0Var.d(this.f38151c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f38150b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f38151c;
                c1Var.f37878b = str;
                c1Var.c();
                y0 y0Var2 = c1Var.f37876a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    c1Var.f37876a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
