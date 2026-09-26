package org.telegram.ui.web;
public final class l0 implements Runnable {
    public final int f39135a;
    public final m0 f39136b;

    public l0(m0 m0Var, int i10) {
        this.f39135a = i10;
        this.f39136b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f39135a) {
            case 0:
                y0 y0Var = this.f39136b.e;
                b1 b1Var = y0Var.Q;
                if (b1Var != null) {
                    y0Var.h = false;
                    b1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f39136b.e;
                b1 b1Var2 = y0Var2.Q;
                if (b1Var2 != null) {
                    b1Var2.J(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                nf.f.s(this.f39136b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
