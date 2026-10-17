package org.telegram.ui.web;
public final class l0 implements Runnable {
    public final int f42662a;
    public final m0 f42663b;

    public l0(m0 m0Var, int i10) {
        this.f42662a = i10;
        this.f42663b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f42662a) {
            case 0:
                x0 x0Var = this.f42663b.e;
                a1 a1Var = x0Var.Q;
                if (a1Var != null) {
                    x0Var.h = false;
                    a1Var.D(false, null);
                    return;
                }
                return;
            case 1:
                x0 x0Var2 = this.f42663b.e;
                a1 a1Var2 = x0Var2.Q;
                if (a1Var2 != null) {
                    a1Var2.I(!x0Var2.canGoBack(), !x0Var2.canGoForward());
                    return;
                }
                return;
            default:
                pf.d.r(this.f42663b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
