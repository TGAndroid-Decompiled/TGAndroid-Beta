package org.telegram.ui.web;
public final class z implements Runnable {
    public final int f43056a;
    public final z0 f43057b;
    public final String f43058c;

    public z(z0 z0Var, String str, int i10) {
        this.f43056a = i10;
        this.f43057b = z0Var;
        this.f43058c = str;
    }

    @Override
    public final void run() {
        switch (this.f43056a) {
            case 0:
                v0 v0Var = this.f43057b.f43059a;
                if (v0Var != null) {
                    v0Var.d(this.f43058c);
                    return;
                }
                return;
            default:
                z0 z0Var = this.f43057b;
                z0Var.N = false;
                z0Var.P = 0L;
                z0Var.T = false;
                String str = this.f43058c;
                z0Var.f43061b = str;
                z0Var.c();
                v0 v0Var2 = z0Var.f43059a;
                if (v0Var2 != null) {
                    v0Var2.onResume();
                    z0Var.f43059a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
