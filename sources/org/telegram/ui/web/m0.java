package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f38015a;
    public final n0 f38016b;

    public m0(n0 n0Var, int i10) {
        this.f38015a = i10;
        this.f38016b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f38015a) {
            case 0:
                y0 y0Var = this.f38016b.e;
                c1 c1Var = y0Var.Q;
                if (c1Var != null) {
                    y0Var.h = false;
                    c1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f38016b.e;
                c1 c1Var2 = y0Var2.Q;
                if (c1Var2 != null) {
                    c1Var2.J(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                nf.f.s(this.f38016b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
