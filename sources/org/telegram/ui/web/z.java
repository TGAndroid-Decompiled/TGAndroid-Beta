package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f42351a;
    public final d1 f42352b;
    public final String f42353c;

    public z(d1 d1Var, String str, int i10) {
        this.f42351a = i10;
        this.f42352b = d1Var;
        this.f42353c = str;
    }

    @Override
    public final void run() {
        switch (this.f42351a) {
            case 0:
                z0 z0Var = this.f42352b.f42062a;
                if (z0Var != null) {
                    z0Var.d(this.f42353c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f42352b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f42353c;
                d1Var.f42064b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f42062a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f42062a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
