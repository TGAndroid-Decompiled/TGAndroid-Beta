package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43717a;
    public final b1 f43718b;
    public final String f43719c;

    public x(b1 b1Var, String str, int i10) {
        this.f43717a = i10;
        this.f43718b = b1Var;
        this.f43719c = str;
    }

    @Override
    public final void run() {
        switch (this.f43717a) {
            case 0:
                y0 y0Var = this.f43718b.f43426a;
                if (y0Var != null) {
                    y0Var.d(this.f43719c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43718b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43719c;
                b1Var.f43428b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43426a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43426a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
