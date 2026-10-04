package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42423a;
    public final c1 f42424b;
    public final String f42425c;

    public y(c1 c1Var, String str, int i10) {
        this.f42423a = i10;
        this.f42424b = c1Var;
        this.f42425c = str;
    }

    @Override
    public final void run() {
        switch (this.f42423a) {
            case 0:
                z0 z0Var = this.f42424b.f42126a;
                if (z0Var != null) {
                    z0Var.d(this.f42425c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f42424b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f42425c;
                c1Var.f42128b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f42126a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f42126a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
