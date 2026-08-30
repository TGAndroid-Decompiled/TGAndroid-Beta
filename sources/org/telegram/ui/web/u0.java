package org.telegram.ui.web;

import android.webkit.WebView;
public final class u0 implements WebView.FindListener {
    public final w0 f39670a;

    public u0(w0 w0Var) {
        this.f39670a = w0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        w0 w0Var = this.f39670a;
        w0Var.D = i10;
        w0Var.E = i11;
        w0Var.getClass();
        Runnable runnable = w0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
