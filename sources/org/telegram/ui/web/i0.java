package org.telegram.ui.web;
public final class i0 implements Runnable {
    public final int f43060a;
    public final j0 f43061b;

    public i0(j0 j0Var, int i10) {
        this.f43060a = i10;
        this.f43061b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f43060a) {
            case 0:
                v0 v0Var = this.f43061b.e;
                z0 z0Var = v0Var.Q;
                if (z0Var != null) {
                    v0Var.h = false;
                    z0Var.D(false, null);
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f43061b.e;
                z0 z0Var2 = v0Var2.Q;
                if (z0Var2 != null) {
                    z0Var2.I(!v0Var2.canGoBack(), !v0Var2.canGoForward());
                    return;
                }
                return;
            default:
                gf.f.r(this.f43061b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
