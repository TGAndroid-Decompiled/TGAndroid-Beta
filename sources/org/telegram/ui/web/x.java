package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f39268a;
    public final b1 f39269b;
    public final String f39270c;

    public x(b1 b1Var, String str, int i10) {
        this.f39268a = i10;
        this.f39269b = b1Var;
        this.f39270c = str;
    }

    @Override
    public final void run() {
        switch (this.f39268a) {
            case 0:
                y0 y0Var = this.f39269b.f38998a;
                if (y0Var != null) {
                    y0Var.d(this.f39270c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f39269b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f39270c;
                b1Var.f39000b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f38998a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f38998a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
