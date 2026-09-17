package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f42352a;
    public final d1 f42353b;
    public final String f42354c;

    public z(d1 d1Var, String str, int i10) {
        this.f42352a = i10;
        this.f42353b = d1Var;
        this.f42354c = str;
    }

    @Override
    public final void run() {
        switch (this.f42352a) {
            case 0:
                z0 z0Var = this.f42353b.f42063a;
                if (z0Var != null) {
                    z0Var.d(this.f42354c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f42353b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f42354c;
                d1Var.f42065b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f42063a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f42063a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
