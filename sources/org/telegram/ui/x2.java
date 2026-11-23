package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.e3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28876b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28876b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f49139f;
            i3Var.M();
            this.f28876b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28876b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28876b.getTitle();
                this.F = this.f28876b.getFavicon();
                this.f28895x = this.f28876b.getUrl();
                this.f28889q = k3Var.f49144x;
                this.f28890r = k3Var.f49145y;
            }
        }
    }
}
