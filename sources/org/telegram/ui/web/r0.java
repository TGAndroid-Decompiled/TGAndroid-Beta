package org.telegram.ui.web;

import android.webkit.WebView;
public final class r0 implements WebView.FindListener {
    public final t0 f50999a;

    public r0(t0 t0Var) {
        this.f50999a = t0Var;
    }

    @Override
    public final void onFindResultReceived(int i3, int i10, boolean z10) {
        t0 t0Var = this.f50999a;
        t0Var.H = i3;
        t0Var.I = i10;
        t0Var.getClass();
        Runnable runnable = t0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
