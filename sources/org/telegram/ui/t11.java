package org.telegram.ui;

import android.view.View;
public final class t11 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f37945a;

    public t11(ProxyListActivity proxyListActivity) {
        this.f37945a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37945a;
        if (i10 >= proxyListActivity.f31707n && i10 < proxyListActivity.f31708r) {
            proxyListActivity.f31703a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f37945a);
    }
}
