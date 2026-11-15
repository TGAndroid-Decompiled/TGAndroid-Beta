package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.b3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28425b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28425b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f48552f;
            i3Var.M();
            this.f28425b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28425b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28425b.getTitle();
                this.F = this.f28425b.getFavicon();
                this.f28444x = this.f28425b.getUrl();
                this.f28438q = k3Var.f48557x;
                this.f28439r = k3Var.f48558y;
            }
        }
    }
}
