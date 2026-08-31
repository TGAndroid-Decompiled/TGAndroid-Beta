package org.telegram.ui.web;
public final class q implements Runnable {
    public final int f42670a;
    public final a1 f42671b;
    public final String f42672c;

    public q(a1 a1Var, String str, int i10) {
        this.f42670a = i10;
        this.f42671b = a1Var;
        this.f42672c = str;
    }

    @Override
    public final void run() {
        switch (this.f42670a) {
            case 0:
                x0 x0Var = this.f42671b.f42465a;
                if (x0Var != null) {
                    x0Var.d(this.f42672c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42671b;
                a1Var.K = false;
                a1Var.M = 0L;
                a1Var.Q = false;
                String str = this.f42672c;
                a1Var.f42467b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42465a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42465a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
