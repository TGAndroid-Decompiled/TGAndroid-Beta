package org.telegram.ui.web;

import android.webkit.WebView;
public final class v0 implements WebView.FindListener {
    public final x0 f42745a;

    public v0(x0 x0Var) {
        this.f42745a = x0Var;
    }

    @Override
    public final void onFindResultReceived(int i10, int i11, boolean z4) {
        x0 x0Var = this.f42745a;
        x0Var.D = i10;
        x0Var.E = i11;
        x0Var.getClass();
        Runnable runnable = x0Var.F;
        if (runnable != null) {
            runnable.run();
        }
    }
}
