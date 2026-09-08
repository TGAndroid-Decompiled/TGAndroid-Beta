package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f21244b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f21244b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f38581f;
            k3Var.M();
            this.f21244b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f21244b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f21244b.getTitle();
                this.F = this.f21244b.getFavicon();
                this.f21263x = this.f21244b.getUrl();
                this.f21257q = m3Var.f38585w;
                this.f21258r = m3Var.f38586x;
            }
        }
    }
}
