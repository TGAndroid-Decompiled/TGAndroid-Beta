package org.telegram.ui;

import android.view.View;
public final class v11 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f38266a;

    public v11(ProxyListActivity proxyListActivity) {
        this.f38266a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f38266a;
        if (i10 >= proxyListActivity.f31393n && i10 < proxyListActivity.f31394r) {
            proxyListActivity.f31389a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f38266a);
    }
}
