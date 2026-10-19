package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42851a;
    public final a1 f42852b;
    public final String f42853c;

    public y(a1 a1Var, String str, int i10) {
        this.f42851a = i10;
        this.f42852b = a1Var;
        this.f42853c = str;
    }

    @Override
    public final void run() {
        switch (this.f42851a) {
            case 0:
                x0 x0Var = this.f42852b.f42555a;
                if (x0Var != null) {
                    x0Var.d(this.f42853c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42852b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42853c;
                a1Var.f42557b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42555a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42555a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
