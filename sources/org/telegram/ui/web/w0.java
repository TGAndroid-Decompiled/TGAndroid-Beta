package org.telegram.ui.web;

import android.webkit.WebView;
public final class w0 implements WebView.FindListener {
    public final y0 f39638a;

    public w0(y0 y0Var) {
        this.f39638a = y0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        y0 y0Var = this.f39638a;
        y0Var.D = i10;
        y0Var.E = i11;
        y0Var.getClass();
        Runnable runnable = y0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
