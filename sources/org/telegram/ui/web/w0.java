package org.telegram.ui.web;

import android.webkit.WebView;
public final class w0 implements WebView.FindListener {
    public final y0 f38139a;

    public w0(y0 y0Var) {
        this.f38139a = y0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        y0 y0Var = this.f38139a;
        y0Var.G = i10;
        y0Var.H = i11;
        y0Var.getClass();
        Runnable runnable = y0Var.I;
        if (runnable != null) {
            runnable.run();
        }
    }
}
