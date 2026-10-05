package org.telegram.ui.web;
public final class m0 implements Runnable {
    public final int f42290a;
    public final n0 f42291b;

    public m0(n0 n0Var, int i10) {
        this.f42290a = i10;
        this.f42291b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f42290a) {
            case 0:
                z0 z0Var = this.f42291b.f42299e;
                c1 c1Var = z0Var.Q;
                if (c1Var != null) {
                    z0Var.h = false;
                    c1Var.E(null, false);
                    return;
                }
                return;
            case 1:
                z0 z0Var2 = this.f42291b.f42299e;
                c1 c1Var2 = z0Var2.Q;
                if (c1Var2 != null) {
                    c1Var2.J(!z0Var2.canGoBack(), !z0Var2.canGoForward());
                    return;
                }
                return;
            default:
                nf.f.s(this.f42291b.f42299e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
