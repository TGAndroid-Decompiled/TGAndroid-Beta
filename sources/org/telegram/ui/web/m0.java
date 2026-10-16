package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f41117a;
    public final n0 f41118b;

    public m0(n0 n0Var, int i10) {
        this.f41117a = i10;
        this.f41118b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f41117a) {
            case 0:
                z0 z0Var = this.f41118b.e;
                c1 c1Var = z0Var.Q;
                if (c1Var != null) {
                    z0Var.h = false;
                    c1Var.D(false, null);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f41118b.e;
                c1 c1Var2 = z0Var2.Q;
                if (c1Var2 != null) {
                    c1Var2.I(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                pf.d.r(this.f41118b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
