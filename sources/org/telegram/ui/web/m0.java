package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f38982a;
    public final n0 f38983b;

    public m0(n0 n0Var, int i10) {
        this.f38982a = i10;
        this.f38983b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f38982a) {
            case 0:
                z0 z0Var = this.f38983b.e;
                d1 d1Var = z0Var.Q;
                if (d1Var != null) {
                    z0Var.h = false;
                    d1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f38983b.e;
                d1 d1Var2 = z0Var2.Q;
                if (d1Var2 != null) {
                    d1Var2.J(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                nf.f.s(this.f38983b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
