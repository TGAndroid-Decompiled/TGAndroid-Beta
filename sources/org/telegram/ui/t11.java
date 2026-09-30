package org.telegram.ui;

import android.view.View;
public final class t11 implements org.telegram.ui.Components.pl0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f38054a;

    public t11(ProxyListActivity proxyListActivity) {
        this.f38054a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f38054a;
        if (i10 >= proxyListActivity.f31782n && i10 < proxyListActivity.f31783r) {
            proxyListActivity.f31778a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f38054a);
    }
}
