package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.o3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f19455b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f19455b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f35437f;
            j3Var.M();
            this.f19455b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f19455b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f19455b.getTitle();
                this.F = this.f19455b.getFavicon();
                this.f19473x = this.f19455b.getUrl();
                this.f19467q = l3Var.f35441w;
                this.f19468r = l3Var.f35442x;
            }
        }
    }
}
