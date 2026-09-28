package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f19598b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f19598b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f35462f;
            k3Var.M();
            this.f19598b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f19598b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f19598b.getTitle();
                this.F = this.f19598b.getFavicon();
                this.f19616x = this.f19598b.getUrl();
                this.f19610q = m3Var.f35466w;
                this.f19611r = m3Var.f35467x;
            }
        }
    }
}
