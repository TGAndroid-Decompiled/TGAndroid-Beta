package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f42834a;
    public final a1 f42835b;
    public final String f42836c;

    public y(a1 a1Var, String str, int i10) {
        this.f42834a = i10;
        this.f42835b = a1Var;
        this.f42836c = str;
    }

    @Override
    public final void run() {
        switch (this.f42834a) {
            case 0:
                x0 x0Var = this.f42835b.f42538a;
                if (x0Var != null) {
                    x0Var.d(this.f42836c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f42835b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f42836c;
                a1Var.f42540b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f42538a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f42538a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
