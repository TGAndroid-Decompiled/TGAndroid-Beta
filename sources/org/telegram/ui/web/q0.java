package org.telegram.ui.web;

import android.webkit.WebView;
public final class q0 implements WebView.FindListener {
    public final s0 f53519a;

    public q0(s0 s0Var) {
        this.f53519a = s0Var;
    }

    @Override
    public final void onFindResultReceived(int i7, int i10, boolean z10) {
        s0 s0Var = this.f53519a;
        s0Var.H = i7;
        s0Var.I = i10;
        s0Var.getClass();
        Runnable runnable = s0Var.J;
        if (runnable != null) {
            runnable.run();
        }
    }
}
