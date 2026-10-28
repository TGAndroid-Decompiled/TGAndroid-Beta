package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.r3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f23006b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f23006b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f41314f;
            k3Var.L();
            this.f23006b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f23006b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f23006b.getTitle();
                this.F = this.f23006b.getFavicon();
                this.f23024x = this.f23006b.getUrl();
                this.f23018q = m3Var.f41318w;
                this.f23019r = m3Var.f41319x;
            }
        }
    }
}
