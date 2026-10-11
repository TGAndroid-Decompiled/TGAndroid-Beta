package org.telegram.ui.web;
public final class l0 implements Runnable {
    public final int f43608a;
    public final m0 f43609b;

    public l0(m0 m0Var, int i10) {
        this.f43608a = i10;
        this.f43609b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f43608a) {
            case 0:
                y0 y0Var = this.f43609b.f43617e;
                b1 b1Var = y0Var.Q;
                if (b1Var != null) {
                    y0Var.h = false;
                    b1Var.D(false, null);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f43609b.f43617e;
                b1 b1Var2 = y0Var2.Q;
                if (b1Var2 != null) {
                    b1Var2.I(!y0Var2.canGoBack(), !y0Var2.canGoForward());
                    return;
                }
                return;
            default:
                of.f.s(this.f43609b.f43617e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
