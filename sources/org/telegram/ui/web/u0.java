package org.telegram.ui.web;

import android.webkit.WebView;

public final class u0 implements WebView.FindListener {

    public final w0 f44006a;

    public u0(w0 w0Var) {
        this.f44006a = w0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z10) {
        w0 w0Var = this.f44006a;
        w0Var.C = i10;
        w0Var.D = i11;
        w0Var.getClass();
        Runnable runnable = w0Var.E;
        if (runnable != null) {
            runnable.run();
        }
    }
}
