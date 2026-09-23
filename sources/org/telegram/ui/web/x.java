package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f38894a;
    public final b1 f38895b;
    public final String f38896c;

    public x(b1 b1Var, String str, int i10) {
        this.f38894a = i10;
        this.f38895b = b1Var;
        this.f38896c = str;
    }

    @Override
    public final void run() {
        switch (this.f38894a) {
            case 0:
                y0 y0Var = this.f38895b.f38629a;
                if (y0Var != null) {
                    y0Var.d(this.f38896c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f38895b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f38896c;
                b1Var.f38631b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f38629a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f38629a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
