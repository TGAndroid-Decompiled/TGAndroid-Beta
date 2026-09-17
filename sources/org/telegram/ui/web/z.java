package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f42325a;
    public final d1 f42326b;
    public final String f42327c;

    public z(d1 d1Var, String str, int i10) {
        this.f42325a = i10;
        this.f42326b = d1Var;
        this.f42327c = str;
    }

    @Override
    public final void run() {
        switch (this.f42325a) {
            case 0:
                z0 z0Var = this.f42326b.f42036a;
                if (z0Var != null) {
                    z0Var.d(this.f42327c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f42326b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f42327c;
                d1Var.f42038b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f42036a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f42036a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
