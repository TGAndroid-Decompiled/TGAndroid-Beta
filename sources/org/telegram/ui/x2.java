package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.c3 {
    @Override
    public final String b() {
        org.telegram.ui.web.u0 u0Var = this.f27375b;
        if (u0Var != null && !TextUtils.isEmpty(u0Var.getTitle())) {
            return this.f27375b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f47088f;
            i3Var.M();
            this.f27375b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.u0 u0Var = this.f27375b;
            if (u0Var != null) {
                u0Var.onPause();
                this.E = this.f27375b.getTitle();
                this.F = this.f27375b.getFavicon();
                this.f27394x = this.f27375b.getUrl();
                this.f27388q = k3Var.f47093x;
                this.f27389r = k3Var.f47094y;
            }
        }
    }
}
