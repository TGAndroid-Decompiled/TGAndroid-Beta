package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.e3 {
    @Override
    public final String b() {
        org.telegram.ui.web.s0 s0Var = this.f28953b;
        if (s0Var != null && !TextUtils.isEmpty(s0Var.getTitle())) {
            return this.f28953b.getTitle();
        }
        return super.b();
    }

    public final void c(k3 k3Var) {
        if (k3Var != null) {
            i3 i3Var = k3Var.f49291f;
            i3Var.M();
            this.f28953b = i3Var.getWebView();
            this.d = i3Var.getProxy();
            org.telegram.ui.web.s0 s0Var = this.f28953b;
            if (s0Var != null) {
                s0Var.onPause();
                this.E = this.f28953b.getTitle();
                this.F = this.f28953b.getFavicon();
                this.f28972x = this.f28953b.getUrl();
                this.f28966q = k3Var.f49296x;
                this.f28967r = k3Var.f49297y;
            }
        }
    }
}
