package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.f3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28926b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28926b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f49138f;
            i3Var.M();
            this.f28926b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28926b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28926b.getTitle();
                this.F = this.f28926b.getFavicon();
                this.f28945x = this.f28926b.getUrl();
                this.f28939q = k3Var.f49143x;
                this.f28940r = k3Var.f49144y;
            }
        }
    }
}
