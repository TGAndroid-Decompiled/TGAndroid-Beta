package org.telegram.ui.web;

import android.webkit.WebView;
public final class x0 implements WebView.FindListener {
    public final z0 f42315a;

    public x0(z0 z0Var) {
        this.f42315a = z0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        z0 z0Var = this.f42315a;
        z0Var.G = i10;
        z0Var.H = i11;
        z0Var.getClass();
        Runnable runnable = z0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
