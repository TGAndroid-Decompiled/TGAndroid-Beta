package org.telegram.ui.web;

import android.webkit.WebView;
public final class t0 implements WebView.FindListener {
    public final v0 f44019a;

    public t0(v0 v0Var) {
        this.f44019a = v0Var;
    }

    @Override
    public final void onFindResultReceived(int i9, int i10, boolean z10) {
        v0 v0Var = this.f44019a;
        v0Var.C = i9;
        v0Var.D = i10;
        v0Var.getClass();
        Runnable runnable = v0Var.E;
        if (runnable != null) {
            runnable.run();
        }
    }
}
