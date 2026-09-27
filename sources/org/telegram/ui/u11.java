package org.telegram.ui;

import android.view.View;
public final class u11 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f38105a;

    public u11(ProxyListActivity proxyListActivity) {
        this.f38105a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f38105a;
        if (i10 >= proxyListActivity.f31710n && i10 < proxyListActivity.f31711r) {
            proxyListActivity.f31706a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ProxyListActivity.V(this.f38105a);
    }
}
