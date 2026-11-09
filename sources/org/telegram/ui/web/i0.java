package org.telegram.ui.web;
public final class i0 implements Runnable {
    public final int f51141a;
    public final j0 f51142b;

    public i0(j0 j0Var, int i7) {
        this.f51141a = i7;
        this.f51142b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f51141a) {
            case 0:
                u0 u0Var = this.f51142b.f51159e;
                x0 x0Var = u0Var.Q;
                if (x0Var != null) {
                    u0Var.h = false;
                    x0Var.E(false, null);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f51142b.f51159e;
                x0 x0Var2 = u0Var2.Q;
                if (x0Var2 != null) {
                    x0Var2.J(!u0Var2.canGoBack(), !u0Var2.canGoForward());
                    return;
                }
                return;
            default:
                vf.c.t(this.f51142b.f51159e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
