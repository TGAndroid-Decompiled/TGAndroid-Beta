package org.telegram.ui.web;

import android.webkit.WebView;
public final class t0 implements WebView.FindListener {
    public final v0 f42999a;

    public t0(v0 v0Var) {
        this.f42999a = v0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        v0 v0Var = this.f42999a;
        v0Var.G = i10;
        v0Var.H = i11;
        v0Var.getClass();
        Runnable runnable = v0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
