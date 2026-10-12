package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f41430a;
    public final n0 f41431b;

    public m0(n0 n0Var, int i10) {
        this.f41430a = i10;
        this.f41431b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f41430a) {
            case 0:
                y0 y0Var = this.f41431b.e;
                b1 b1Var = y0Var.Q;
                if (b1Var != null) {
                    y0Var.h = false;
                    b1Var.D(false, null);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f41431b.e;
                b1 b1Var2 = y0Var2.Q;
                if (b1Var2 != null) {
                    b1Var2.I(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                pf.d.s(this.f41431b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
