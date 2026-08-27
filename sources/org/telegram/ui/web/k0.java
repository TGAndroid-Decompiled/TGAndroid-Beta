package org.telegram.ui.web;

public final class k0 implements Runnable {

    public final int f43887a;

    public final l0 f43888b;

    public k0(l0 l0Var, int i10) {
        this.f43887a = i10;
        this.f43888b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f43887a) {
            case 0:
                w0 w0Var = this.f43888b.f43906e;
                z0 z0Var = w0Var.M;
                if (z0Var != null) {
                    w0Var.h = false;
                    z0Var.A(null, false);
                }
                break;
            case 1:
                w0 w0Var2 = this.f43888b.f43906e;
                z0 z0Var2 = w0Var2.M;
                if (z0Var2 != null) {
                    z0Var2.F(!w0Var2.canGoBack(), !w0Var2.canGoForward());
                }
                break;
            default:
                we.e.s(this.f43888b.f43906e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
