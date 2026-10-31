package org.telegram.ui;

import android.text.TextUtils;
public final class x2 extends org.telegram.ui.ActionBar.h3 {
    @Override
    public final String b() {
        org.telegram.ui.web.v0 v0Var = this.f20355b;
        if (v0Var != null && !TextUtils.isEmpty(v0Var.getTitle())) {
            return this.f20355b.getTitle();
        }
        return super.b();
    }

    public final void c(l3 l3Var) {
        if (l3Var != null) {
            j3 j3Var = l3Var.f39040f;
            j3Var.L();
            this.f20355b = j3Var.getWebView();
            this.d = j3Var.getProxy();
            org.telegram.ui.web.v0 v0Var = this.f20355b;
            if (v0Var != null) {
                v0Var.onPause();
                this.E = this.f20355b.getTitle();
                this.F = this.f20355b.getFavicon();
                this.f20373x = this.f20355b.getUrl();
                this.f20367q = l3Var.f39045x;
                this.f20368r = l3Var.f39046y;
            }
        }
    }
}
