package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.a3 {
    @Override
    public final String b() {
        org.telegram.ui.web.t0 t0Var = this.f27352b;
        if (t0Var != null && !TextUtils.isEmpty(t0Var.getTitle())) {
            return this.f27352b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f47086f;
            j3Var.L();
            this.f27352b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.t0 t0Var = this.f27352b;
            if (t0Var != null) {
                t0Var.onPause();
                this.E = this.f27352b.getTitle();
                this.F = this.f27352b.getFavicon();
                this.f27371x = this.f27352b.getUrl();
                this.f27365q = l3Var.f47091x;
                this.f27366r = l3Var.f47092y;
            }
        }
    }
}
