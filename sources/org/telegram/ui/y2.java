package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f19647b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f19647b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f35289f;
            j3Var.M();
            this.f19647b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f19647b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f19647b.getTitle();
                this.F = this.f19647b.getFavicon();
                this.f19665x = this.f19647b.getUrl();
                this.f19659q = l3Var.f35293w;
                this.f19660r = l3Var.f35294x;
            }
        }
    }
}
