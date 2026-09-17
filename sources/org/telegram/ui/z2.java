package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f21218b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f21218b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f38555f;
            k3Var.M();
            this.f21218b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f21218b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f21218b.getTitle();
                this.F = this.f21218b.getFavicon();
                this.f21237x = this.f21218b.getUrl();
                this.f21231q = m3Var.f38559w;
                this.f21232r = m3Var.f38560x;
            }
        }
    }
}
