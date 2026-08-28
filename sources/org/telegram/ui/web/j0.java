package org.telegram.ui.web;
public final class j0 implements Runnable {
    public final int f43900a;
    public final k0 f43901b;

    public j0(k0 k0Var, int i9) {
        this.f43900a = i9;
        this.f43901b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f43900a) {
            case 0:
                v0 v0Var = this.f43901b.f43919e;
                y0 y0Var = v0Var.M;
                if (y0Var != null) {
                    v0Var.h = false;
                    y0Var.A(null, false);
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f43901b.f43919e;
                y0 y0Var2 = v0Var2.M;
                if (y0Var2 != null) {
                    y0Var2.F(!v0Var2.canGoBack(), !v0Var2.canGoForward());
                    return;
                }
                return;
            default:
                ve.e.s(this.f43901b.f43919e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
