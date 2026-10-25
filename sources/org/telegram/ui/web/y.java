package org.telegram.ui.web;
public final class y implements Runnable {
    public final int f45453a;
    public final a1 f45454b;
    public final String f45455c;

    public y(a1 a1Var, String str, int i10) {
        this.f45453a = i10;
        this.f45454b = a1Var;
        this.f45455c = str;
    }

    @Override
    public final void run() {
        switch (this.f45453a) {
            case 0:
                x0 x0Var = this.f45454b.f45151a;
                if (x0Var != null) {
                    x0Var.d(this.f45455c);
                    return;
                }
                return;
            default:
                a1 a1Var = this.f45454b;
                a1Var.N = false;
                a1Var.P = 0L;
                a1Var.T = false;
                String str = this.f45455c;
                a1Var.f45153b = str;
                a1Var.c();
                x0 x0Var2 = a1Var.f45151a;
                if (x0Var2 != null) {
                    x0Var2.onResume();
                    a1Var.f45151a.loadUrl(str);
                    return;
                }
                return;
        }
    }
}
