package org.telegram.ui.web;

import android.webkit.WebView;
public final class s0 implements WebView.FindListener {
    public final u0 f51302a;

    public s0(u0 u0Var) {
        this.f51302a = u0Var;
    }

    @Override
    public final void onFindResultReceived(int i7, int i10, boolean z9) {
        u0 u0Var = this.f51302a;
        u0Var.G = i7;
        u0Var.H = i10;
        u0Var.getClass();
        Runnable runnable = u0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
