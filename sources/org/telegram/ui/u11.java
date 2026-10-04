package org.telegram.ui;

import android.view.View;
public final class u11 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f41020a;

    public u11(ProxyListActivity proxyListActivity) {
        this.f41020a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f41020a;
        if (i10 >= proxyListActivity.f34388n && i10 < proxyListActivity.f34389r) {
            proxyListActivity.f34383a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.T(this.f41020a);
    }
}
