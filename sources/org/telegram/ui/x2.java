package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.d3 {
    @Override
    public final String b() {
        org.telegram.ui.web.u0 u0Var = this.f27393b;
        if (u0Var != null && !TextUtils.isEmpty(u0Var.getTitle())) {
            return this.f27393b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f47145f;
            i3Var.M();
            this.f27393b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.u0 u0Var = this.f27393b;
            if (u0Var != null) {
                u0Var.onPause();
                this.E = this.f27393b.getTitle();
                this.F = this.f27393b.getFavicon();
                this.f27412x = this.f27393b.getUrl();
                this.f27406q = k3Var.f47150x;
                this.f27407r = k3Var.f47151y;
            }
        }
    }
}
