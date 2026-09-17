package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.o3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f19454b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f19454b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f35432f;
            j3Var.M();
            this.f19454b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f19454b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f19454b.getTitle();
                this.F = this.f19454b.getFavicon();
                this.f19472x = this.f19454b.getUrl();
                this.f19466q = l3Var.f35436w;
                this.f19467r = l3Var.f35437x;
            }
        }
    }
}
