package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f41549a;
    public final b1 f41550b;
    public final String f41551c;

    public x(b1 b1Var, String str, int i10) {
        this.f41549a = i10;
        this.f41550b = b1Var;
        this.f41551c = str;
    }

    @Override
    public final void run() {
        switch (this.f41549a) {
            case 0:
                y0 y0Var = this.f41550b.f41282a;
                if (y0Var != null) {
                    y0Var.d(this.f41551c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f41550b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f41551c;
                b1Var.f41284b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f41282a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f41282a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
