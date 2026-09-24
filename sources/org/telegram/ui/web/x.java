package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39252a;
    public final b1 f39253b;
    public final String f39254c;

    public x(b1 b1Var, String str, int i10) {
        this.f39252a = i10;
        this.f39253b = b1Var;
        this.f39254c = str;
    }

    @Override
    public final void run() {
        switch (this.f39252a) {
            case 0:
                y0 y0Var = this.f39253b.f38982a;
                if (y0Var != null) {
                    y0Var.d(this.f39254c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f39253b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f39254c;
                b1Var.f38984b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f38982a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f38982a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
