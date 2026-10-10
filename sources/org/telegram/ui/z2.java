package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21380b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21380b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f39799f;
            k3Var.L();
            this.f21380b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21380b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21380b.getTitle();
                this.F = this.f21380b.getFavicon();
                this.f21399x = this.f21380b.getUrl();
                this.f21393q = m3Var.f39803w;
                this.f21394r = m3Var.f39804x;
            }
        }
    }
}
