package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.m3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f21369b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f21369b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f38396f;
            k3Var.M();
            this.f21369b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f21369b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f21369b.getTitle();
                this.F = this.f21369b.getFavicon();
                this.f21388x = this.f21369b.getUrl();
                this.f21382q = m3Var.f38400w;
                this.f21383r = m3Var.f38401x;
            }
        }
    }
}
