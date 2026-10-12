package org.telegram.ui.web;
public final class x implements Runnable {
    public final int f43467a;
    public final b1 f43468b;
    public final String f43469c;

    public x(b1 b1Var, String str, int i10) {
        this.f43467a = i10;
        this.f43468b = b1Var;
        this.f43469c = str;
    }

    @Override
    public final void run() {
        switch (this.f43467a) {
            case 0:
                y0 y0Var = this.f43468b.f43179a;
                if (y0Var != null) {
                    y0Var.d(this.f43469c);
                    return;
                }
                return;
            default:
                b1 b1Var = this.f43468b;
                b1Var.N = false;
                b1Var.P = 0L;
                b1Var.T = false;
                String str = this.f43469c;
                b1Var.f43181b = str;
                b1Var.c();
                y0 y0Var2 = b1Var.f43179a;
                if (y0Var2 != null) {
                    y0Var2.onResume();
                    b1Var.f43179a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
