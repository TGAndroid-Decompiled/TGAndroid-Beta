package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42435a;
    public final c1 f42436b;
    public final String f42437c;

    public y(c1 c1Var, String str, int i10) {
        this.f42435a = i10;
        this.f42436b = c1Var;
        this.f42437c = str;
    }

    @Override
    public final void run() {
        switch (this.f42435a) {
            case 0:
                z0 z0Var = this.f42436b.f42138a;
                if (z0Var != null) {
                    z0Var.d(this.f42437c);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f42436b;
                c1Var.N = false;
                c1Var.P = 0L;
                c1Var.T = false;
                String str = this.f42437c;
                c1Var.f42140b = str;
                c1Var.c();
                z0 z0Var2 = c1Var.f42138a;
                if (z0Var2 != null) {
                    z0Var2.onResume();
                    c1Var.f42138a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
