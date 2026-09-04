package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f42324a;
    public final d1 f42325b;
    public final String f42326c;

    public z(d1 d1Var, String str, int i10) {
        this.f42324a = i10;
        this.f42325b = d1Var;
        this.f42326c = str;
    }

    @Override
    public final void run() {
        switch (this.f42324a) {
            case 0:
                z0 z0Var = this.f42325b.f42035a;
                if (z0Var != null) {
                    z0Var.d(this.f42326c);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f42325b;
                d1Var.N = false;
                d1Var.P = 0L;
                d1Var.T = false;
                String str = this.f42326c;
                d1Var.f42037b = str;
                d1Var.c();
                z0 z0Var2 = d1Var.f42035a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    d1Var.f42035a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
