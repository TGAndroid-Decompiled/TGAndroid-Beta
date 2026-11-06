package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.c3 {
    @Override
    public final String b() {
        org.telegram.ui.web.u0 u0Var = this.f27372b;
        if (u0Var != null && !TextUtils.isEmpty(u0Var.getTitle())) {
            return this.f27372b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f47090f;
            i3Var.M();
            this.f27372b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.u0 u0Var = this.f27372b;
            if (u0Var != null) {
                u0Var.onPause();
                this.E = this.f27372b.getTitle();
                this.F = this.f27372b.getFavicon();
                this.f27391x = this.f27372b.getUrl();
                this.f27385q = k3Var.f47095x;
                this.f27386r = k3Var.f47096y;
            }
        }
    }
}
