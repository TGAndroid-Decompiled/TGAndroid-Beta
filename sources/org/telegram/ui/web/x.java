package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39356a;
    public final b1 f39357b;
    public final String f39358c;

    public x(b1 b1Var, String str, int i10) {
        this.f39356a = i10;
        this.f39357b = b1Var;
        this.f39358c = str;
    }

    @Override
    public final void run() {
        switch (this.f39356a) {
            case 0:
                y0 y0Var = this.f39357b.f39086a;
                if (y0Var != null) {
                    y0Var.d(this.f39358c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f39357b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f39358c;
                b1Var.f39088b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f39086a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f39086a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
