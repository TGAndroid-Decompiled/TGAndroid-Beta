package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21367b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21367b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f39533f;
            j3Var.L();
            this.f21367b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21367b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21367b.getTitle();
                this.F = this.f21367b.getFavicon();
                this.f21386x = this.f21367b.getUrl();
                this.f21380q = l3Var.f39537w;
                this.f21381r = l3Var.f39538x;
            }
        }
    }
}
