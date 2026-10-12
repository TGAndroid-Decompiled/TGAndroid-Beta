package org.telegram.ui.web;
public final class l0 implements Runnable {
    public final int f43325a;
    public final m0 f43326b;

    public l0(m0 m0Var, int i10) {
        this.f43325a = i10;
        this.f43326b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f43325a) {
            case 0:
                y0 y0Var = this.f43326b.f43340e;
                b1 b1Var = y0Var.Q;
                if (b1Var != null) {
                    y0Var.h = false;
                    b1Var.D(false, null);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f43326b.f43340e;
                b1 b1Var2 = y0Var2.Q;
                if (b1Var2 != null) {
                    b1Var2.I(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                of.f.s(this.f43326b.f43340e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
