package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f39025a;
    public final n0 f39026b;

    public m0(n0 n0Var, int i10) {
        this.f39025a = i10;
        this.f39026b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f39025a) {
            case 0:
                z0 z0Var = this.f39026b.e;
                d1 d1Var = z0Var.Q;
                if (d1Var != null) {
                    z0Var.h = false;
                    d1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f39026b.e;
                d1 d1Var2 = z0Var2.Q;
                if (d1Var2 != null) {
                    d1Var2.J(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                nf.f.s(this.f39026b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
