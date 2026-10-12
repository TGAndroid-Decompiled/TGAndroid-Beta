package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f21105b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f21105b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f39895f;
            k3Var.L();
            this.f21105b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f21105b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f21105b.getTitle();
                this.F = this.f21105b.getFavicon();
                this.f21124x = this.f21105b.getUrl();
                this.f21118q = m3Var.f39899w;
                this.f21119r = m3Var.f39900x;
            }
        }
    }
}
