package org.telegram.ui.web;

public final class q implements Runnable {

    public final int f43940a;

    public final z0 f43941b;

    public final String f43942c;

    public q(z0 z0Var, String str, int i10) {
        this.f43940a = i10;
        this.f43941b = z0Var;
        this.f43942c = str;
    }

    @Override
    public final void run() {
        switch (this.f43940a) {
            case 0:
                w0 w0Var = this.f43941b.f44057a;
                if (w0Var != null) {
                    w0Var.d(this.f43942c);
                    break;
                }
                break;
            default:
                z0 z0Var = this.f43941b;
                z0Var.J = false;
                z0Var.L = 0L;
                z0Var.P = false;
                String str = this.f43942c;
                z0Var.f44059b = str;
                z0Var.c();
                w0 w0Var2 = z0Var.f44057a;
                if (w0Var2 != null) {
                    w0Var2.onResume();
                    z0Var.f44057a.loadUrl(str);
                }
                break;
        }
    }
}
