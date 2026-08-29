package org.telegram.ui.web;
public final class k0 implements Runnable {
    public final int f44086a;
    public final l0 f44087b;

    public k0(l0 l0Var, int i10) {
        this.f44086a = i10;
        this.f44087b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f44086a) {
            case 0:
                w0 w0Var = this.f44087b.f44109e;
                z0 z0Var = w0Var.M;
                if (z0Var != null) {
                    w0Var.h = false;
                    z0Var.A(null, false);
                    return;
                }
                return;
            case 1:
                w0 w0Var2 = this.f44087b.f44109e;
                z0 z0Var2 = w0Var2.M;
                if (z0Var2 != null) {
                    z0Var2.F(!w0Var2.canGoBack(), !w0Var2.canGoForward());
                    return;
                }
                return;
            default:
                ye.d.s(this.f44087b.f44109e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
