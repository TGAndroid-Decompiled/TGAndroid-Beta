package org.telegram.ui.web;
public final class l0 implements Runnable {
    public final int f39513a;
    public final m0 f39514b;

    public l0(m0 m0Var, int i10) {
        this.f39513a = i10;
        this.f39514b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f39513a) {
            case 0:
                y0 y0Var = this.f39514b.e;
                c1 c1Var = y0Var.N;
                if (c1Var != null) {
                    y0Var.h = false;
                    c1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f39514b.e;
                c1 c1Var2 = y0Var2.N;
                if (c1Var2 != null) {
                    c1Var2.J(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                ze.d.s(this.f39514b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
