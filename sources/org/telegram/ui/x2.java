package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.e3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28910b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28910b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f49185f;
            i3Var.M();
            this.f28910b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28910b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28910b.getTitle();
                this.F = this.f28910b.getFavicon();
                this.f28929x = this.f28910b.getUrl();
                this.f28923q = k3Var.f49190x;
                this.f28924r = k3Var.f49191y;
            }
        }
    }
}
