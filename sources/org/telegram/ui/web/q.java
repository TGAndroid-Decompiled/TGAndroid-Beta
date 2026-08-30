package org.telegram.ui.web;
public final class q implements Runnable {
    public final int f39607a;
    public final a1 f39608b;
    public final String f39609c;

    public q(a1 a1Var, String str, int i10) {
        this.f39607a = i10;
        this.f39608b = a1Var;
        this.f39609c = str;
    }

    @Override
    public final void run() {
        switch (this.f39607a) {
            case 0:
                w0 w0Var = this.f39608b.f39420a;
                if (w0Var != null) {
                    w0Var.d(this.f39609c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f39608b;
                a1Var.K = false;
                a1Var.M = 0L;
                a1Var.Q = false;
                String str = this.f39609c;
                a1Var.f39422b = str;
                a1Var.c();
                w0 w0Var2 = a1Var.f39420a;
                if (w0Var2 != null) {
                    w0Var2.onResume();
                    a1Var.f39420a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
