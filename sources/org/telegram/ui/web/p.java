package org.telegram.ui.web;
public final class p implements Runnable {
    public final int f43953a;
    public final y0 f43954b;
    public final String f43955c;

    public p(y0 y0Var, String str, int i9) {
        this.f43953a = i9;
        this.f43954b = y0Var;
        this.f43955c = str;
    }

    @Override
    public final void run() {
        switch (this.f43953a) {
            case 0:
                v0 v0Var = this.f43954b.f44070a;
                if (v0Var != null) {
                    v0Var.d(this.f43955c);
                    return;
                }
                return;
            default:
                y0 y0Var = this.f43954b;
                y0Var.J = false;
                y0Var.L = 0L;
                y0Var.P = false;
                String str = this.f43955c;
                y0Var.f44072b = str;
                y0Var.c();
                v0 v0Var2 = y0Var.f44070a;
                if (v0Var2 != null) {
                    v0Var2.onResume();
                    y0Var.f44070a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
