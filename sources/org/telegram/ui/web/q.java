package org.telegram.ui.web;
public final class q implements Runnable {
    public final int f44143a;
    public final z0 f44144b;
    public final String f44145c;

    public q(z0 z0Var, String str, int i10) {
        this.f44143a = i10;
        this.f44144b = z0Var;
        this.f44145c = str;
    }

    @Override
    public final void run() {
        switch (this.f44143a) {
            case 0:
                w0 w0Var = this.f44144b.f44260a;
                if (w0Var != null) {
                    w0Var.d(this.f44145c);
                    return;
                }
                return;
            default:
                z0 z0Var = this.f44144b;
                z0Var.J = false;
                z0Var.L = 0L;
                z0Var.P = false;
                String str = this.f44145c;
                z0Var.f44262b = str;
                z0Var.c();
                w0 w0Var2 = z0Var.f44260a;
                if (w0Var2 != null) {
                    w0Var2.onResume();
                    z0Var.f44260a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
