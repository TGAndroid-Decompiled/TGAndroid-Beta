package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f19371b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f19371b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f35132f;
            k3Var.M();
            this.f19371b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f19371b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f19371b.getTitle();
                this.F = this.f19371b.getFavicon();
                this.f19389x = this.f19371b.getUrl();
                this.f19383q = m3Var.f35136w;
                this.f19384r = m3Var.f35137x;
            }
        }
    }
}
