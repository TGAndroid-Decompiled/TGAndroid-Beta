package org.telegram.ui;

import android.text.TextUtils;
public final class y2 extends org.telegram.ui.ActionBar.n3 {
    @Override
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.f19615b;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.getTitle())) {
            return this.f19615b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f35226f;
            j3Var.M();
            this.f19615b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.z0 z0Var = this.f19615b;
            if (z0Var != null) {
                z0Var.onPause();
                this.E = this.f19615b.getTitle();
                this.F = this.f19615b.getFavicon();
                this.f19633x = this.f19615b.getUrl();
                this.f19627q = l3Var.f35230w;
                this.f19628r = l3Var.f35231x;
            }
        }
    }
}
