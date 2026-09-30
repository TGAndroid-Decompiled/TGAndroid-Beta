package org.telegram.ui;

import android.text.TextUtils;
public final class z2 extends org.telegram.ui.ActionBar.l3 {
    @Override
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.f19615b;
        if (y0Var != null && !TextUtils.isEmpty(y0Var.getTitle())) {
            return this.f19615b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f35552f;
            k3Var.M();
            this.f19615b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.y0 y0Var = this.f19615b;
            if (y0Var != null) {
                y0Var.onPause();
                this.E = this.f19615b.getTitle();
                this.F = this.f19615b.getFavicon();
                this.f19633x = this.f19615b.getUrl();
                this.f19627q = m3Var.f35556w;
                this.f19628r = m3Var.f35557x;
            }
        }
    }
}
