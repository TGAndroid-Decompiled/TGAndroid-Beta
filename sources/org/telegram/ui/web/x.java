package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f42794a;
    public final a1 f42795b;
    public final String f42796c;

    public x(a1 a1Var, String str, int i10) {
        this.f42794a = i10;
        this.f42795b = a1Var;
        this.f42796c = str;
    }

    @Override
    public final void run() {
        switch (this.f42794a) {
            case 0:
                x0 x0Var = this.f42795b.f42514a;
                if (x0Var != null) {
                    x0Var.d(this.f42796c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42795b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42796c;
                a1Var.f42516b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42514a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42514a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
