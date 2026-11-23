package org.telegram.ui.web;
public final class h0 implements Runnable {
    public final int f53387a;
    public final i0 f53388b;

    public h0(i0 i0Var, int i7) {
        this.f53387a = i7;
        this.f53388b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f53387a) {
            case 0:
                s0 s0Var = this.f53388b.f53400e;
                v0 v0Var = s0Var.R;
                if (v0Var != null) {
                    s0Var.h = false;
                    v0Var.E(false, null);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f53388b.f53400e;
                v0 v0Var2 = s0Var2.R;
                if (v0Var2 != null) {
                    v0Var2.J(!s0Var2.canGoBack(), !s0Var2.canGoForward());
                    return;
                }
                return;
            default:
                vf.c.t(this.f53388b.f53400e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
