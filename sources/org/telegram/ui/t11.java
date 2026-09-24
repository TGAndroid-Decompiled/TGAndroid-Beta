package org.telegram.ui;

import android.view.View;
public final class t11 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f37929a;

    public t11(ProxyListActivity proxyListActivity) {
        this.f37929a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37929a;
        if (i10 >= proxyListActivity.f31694n && i10 < proxyListActivity.f31695r) {
            proxyListActivity.f31690a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f37929a);
    }
}
