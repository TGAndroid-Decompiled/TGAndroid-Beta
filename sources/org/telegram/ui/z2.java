package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f21374b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f21374b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f38402f;
            k3Var.M();
            this.f21374b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f21374b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f21374b.getTitle();
                this.F = this.f21374b.getFavicon();
                this.f21393x = this.f21374b.getUrl();
                this.f21387q = m3Var.f38406w;
                this.f21388r = m3Var.f38407x;
            }
        }
    }
}
