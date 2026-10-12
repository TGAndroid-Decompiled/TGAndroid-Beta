package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21106b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21106b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f39898f;
            k3Var.L();
            this.f21106b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21106b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21106b.getTitle();
                this.F = this.f21106b.getFavicon();
                this.f21125x = this.f21106b.getUrl();
                this.f21119q = m3Var.f39902w;
                this.f21120r = m3Var.f39903x;
            }
        }
    }
}
