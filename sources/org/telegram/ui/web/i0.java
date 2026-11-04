package org.telegram.ui.web;
public final class i0 implements Runnable {
    public final int f50868a;
    public final j0 f50869b;

    public i0(j0 j0Var, int i3) {
        this.f50868a = i3;
        this.f50869b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f50868a) {
            case 0:
                t0 t0Var = this.f50869b.f50915e;
                w0 w0Var = t0Var.R;
                if (w0Var != null) {
                    t0Var.h = false;
                    w0Var.D(false, null);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f50869b.f50915e;
                w0 w0Var2 = t0Var2.R;
                if (w0Var2 != null) {
                    w0Var2.I(!t0Var2.canGoBack(), !t0Var2.canGoForward());
                    return;
                }
                return;
            default:
                sf.c.t(this.f50869b.f50915e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
