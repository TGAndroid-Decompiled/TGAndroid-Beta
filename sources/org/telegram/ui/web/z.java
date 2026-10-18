package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f42818a;
    public final b1 f42819b;
    public final String f42820c;

    public z(b1 b1Var, String str, int i10) {
        this.f42818a = i10;
        this.f42819b = b1Var;
        this.f42820c = str;
    }

    @Override
    public final void run() {
        switch (this.f42818a) {
            case 0:
                y0 y0Var = this.f42819b.f42519a;
                if (y0Var != null) {
                    y0Var.d(this.f42820c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f42819b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f42820c;
                b1Var.f42521b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f42519a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f42519a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
