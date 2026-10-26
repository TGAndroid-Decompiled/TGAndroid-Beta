package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f45456a;
    public final a1 f45457b;
    public final String f45458c;

    public y(a1 a1Var, String str, int i10) {
        this.f45456a = i10;
        this.f45457b = a1Var;
        this.f45458c = str;
    }

    @Override
    public final void run() {
        switch (this.f45456a) {
            case 0:
                x0 x0Var = this.f45457b.f45154a;
                if (x0Var != null) {
                    x0Var.d(this.f45458c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f45457b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f45458c;
                a1Var.f45156b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f45154a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f45154a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
