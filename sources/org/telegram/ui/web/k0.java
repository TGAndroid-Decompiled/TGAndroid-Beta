package org.telegram.ui.web;
public final class k0 implements Runnable {
    public final int f42577a;
    public final l0 f42578b;

    public k0(l0 l0Var, int i10) {
        this.f42577a = i10;
        this.f42578b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f42577a) {
            case 0:
                x0 x0Var = this.f42578b.f42587e;
                a1 a1Var = x0Var.N;
                if (a1Var != null) {
                    x0Var.h = false;
                    a1Var.A(null, false);
                    return;
                }
                return;
            case 1:
                x0 x0Var2 = this.f42578b.f42587e;
                a1 a1Var2 = x0Var2.N;
                if (a1Var2 != null) {
                    a1Var2.F(!x0Var2.canGoBack(), !x0Var2.canGoForward());
                    return;
                }
                return;
            default:
                af.g.s(this.f42578b.f42587e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
