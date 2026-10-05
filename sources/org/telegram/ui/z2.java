package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f21378b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f21378b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f38456f;
            k3Var.M();
            this.f21378b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f21378b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f21378b.getTitle();
                this.F = this.f21378b.getFavicon();
                this.f21397x = this.f21378b.getUrl();
                this.f21391q = m3Var.f38460w;
                this.f21392r = m3Var.f38461x;
            }
        }
    }
}
