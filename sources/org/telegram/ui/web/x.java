package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43575a;
    public final b1 f43576b;
    public final String f43577c;

    public x(b1 b1Var, String str, int i10) {
        this.f43575a = i10;
        this.f43576b = b1Var;
        this.f43577c = str;
    }

    @Override
    public final void run() {
        switch (this.f43575a) {
            case 0:
                y0 y0Var = this.f43576b.f43281a;
                if (y0Var != null) {
                    y0Var.d(this.f43577c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43576b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43577c;
                b1Var.f43283b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43281a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43281a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
