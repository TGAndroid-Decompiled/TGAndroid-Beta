package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.r3 {
    @Override
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.f23005b;
        if (x0Var != null && !TextUtils.isEmpty(x0Var.getTitle())) {
            return this.f23005b.getTitle();
        }
        return super.b();
    }

    public final void c(m3 m3Var) {
        if (m3Var != null) {
            k3 k3Var = m3Var.f41445f;
            k3Var.L();
            this.f23005b = k3Var.getWebView();
            this.d = k3Var.getProxy();
            org.telegram.ui.web.x0 x0Var = this.f23005b;
            if (x0Var != null) {
                x0Var.onPause();
                this.E = this.f23005b.getTitle();
                this.F = this.f23005b.getFavicon();
                this.f23023x = this.f23005b.getUrl();
                this.f23017q = m3Var.f41449w;
                this.f23018r = m3Var.f41450x;
            }
        }
    }
}
