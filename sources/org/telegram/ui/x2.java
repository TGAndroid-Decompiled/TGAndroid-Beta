package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.f3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28928b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28928b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f49161f;
            i3Var.M();
            this.f28928b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28928b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28928b.getTitle();
                this.F = this.f28928b.getFavicon();
                this.f28947x = this.f28928b.getUrl();
                this.f28941q = k3Var.f49166x;
                this.f28942r = k3Var.f49167y;
            }
        }
    }
}
