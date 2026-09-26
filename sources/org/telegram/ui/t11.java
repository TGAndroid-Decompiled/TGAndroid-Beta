package org.telegram.ui;

import android.view.View;
public final class t11 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.z1 {
    public final ProxyListActivity f37946a;

    public t11(ProxyListActivity proxyListActivity) {
        this.f37946a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37946a;
        if (i10 >= proxyListActivity.f31708n && i10 < proxyListActivity.f31709r) {
            proxyListActivity.f31704a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ProxyListActivity.V(this.f37946a);
    }
}
