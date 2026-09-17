package org.telegram.ui.web;
public final class n0 implements Runnable {
    public final int f42212a;
    public final o0 f42213b;

    public n0(o0 o0Var, int i10) {
        this.f42212a = i10;
        this.f42213b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f42212a) {
            case 0:
                z0 z0Var = this.f42213b.f42227e;
                d1 d1Var = z0Var.Q;
                if (d1Var != null) {
                    z0Var.h = false;
                    d1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f42213b.f42227e;
                d1 d1Var2 = z0Var2.Q;
                if (d1Var2 != null) {
                    d1Var2.J(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                of.f.s(this.f42213b.f42227e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
