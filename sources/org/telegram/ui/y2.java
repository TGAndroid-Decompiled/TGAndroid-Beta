package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.r3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f23003b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f23003b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f41442f;
            k3Var.L();
            this.f23003b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f23003b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f23003b.getTitle();
                this.F = this.f23003b.getFavicon();
                this.f23021x = this.f23003b.getUrl();
                this.f23015q = m3Var.f41446w;
                this.f23016r = m3Var.f41447x;
            }
        }
    }
}
