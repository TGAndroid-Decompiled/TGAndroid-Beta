package org.telegram.ui.web;
public final class n0 implements Runnable {
    public final int f42184a;
    public final o0 f42185b;

    public n0(o0 o0Var, int i10) {
        this.f42184a = i10;
        this.f42185b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f42184a) {
            case 0:
                z0 z0Var = this.f42185b.f42199e;
                d1 d1Var = z0Var.Q;
                if (d1Var != null) {
                    z0Var.h = false;
                    d1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f42185b.f42199e;
                d1 d1Var2 = z0Var2.Q;
                if (d1Var2 != null) {
                    d1Var2.J(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                of.f.s(this.f42185b.f42199e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
