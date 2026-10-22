package org.telegram.ui.web;

import android.webkit.WebView;
public final class v0 implements WebView.FindListener {
    public final x0 f42834a;

    public v0(x0 x0Var) {
        this.f42834a = x0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        x0 x0Var = this.f42834a;
        x0Var.G = i10;
        x0Var.H = i11;
        x0Var.getClass();
        Runnable runnable = x0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
