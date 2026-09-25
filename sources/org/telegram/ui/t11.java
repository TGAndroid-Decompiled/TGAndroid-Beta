package org.telegram.ui;

import android.view.View;
public final class t11 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f37947a;

    public t11(ProxyListActivity proxyListActivity) {
        this.f37947a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37947a;
        if (i10 >= proxyListActivity.f31709n && i10 < proxyListActivity.f31710r) {
            proxyListActivity.f31705a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f37947a);
    }
}
