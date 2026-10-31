package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f43254a;
    public final z0 f43255b;
    public final String f43256c;

    public z(z0 z0Var, String str, int i10) {
        this.f43254a = i10;
        this.f43255b = z0Var;
        this.f43256c = str;
    }

    @Override
    public final void run() {
        switch (this.f43254a) {
            case 0:
                v0 v0Var = this.f43255b.f43257a;
                if (v0Var != null) {
                    v0Var.d(this.f43256c);
                    return;
                }
                return;
            default:
                z0 z0Var = this.f43255b;
                z0Var.N = false;
                z0Var.P = 0L;
                z0Var.T = false;
                String str = this.f43256c;
                z0Var.f43259b = str;
                z0Var.c();
                v0 v0Var2 = z0Var.f43257a;
                if (v0Var2 != null) {
                    v0Var2.onResume();
                    z0Var.f43257a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
