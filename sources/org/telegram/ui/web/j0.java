package org.telegram.ui.web;
public final class j0 implements Runnable {
    public final int f39541a;
    public final k0 f39542b;

    public j0(k0 k0Var, int i10) {
        this.f39541a = i10;
        this.f39542b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f39541a) {
            case 0:
                w0 w0Var = this.f39542b.e;
                a1 a1Var = w0Var.N;
                if (a1Var != null) {
                    w0Var.h = false;
                    a1Var.A(null, false);
                    return;
                }
                return;
            case 1:
                w0 w0Var2 = this.f39542b.e;
                a1 a1Var2 = w0Var2.N;
                if (a1Var2 != null) {
                    a1Var2.F(!w0Var2.canGoBack(), !w0Var2.canGoForward());
                    return;
                }
                return;
            default:
                af.g.s(this.f39542b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
