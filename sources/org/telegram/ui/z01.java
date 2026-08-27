package org.telegram.ui;

import android.view.View;

public final class z01 implements org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.a2 {

    public final ProxyListActivity f44987a;

    public z01(ProxyListActivity proxyListActivity) {
        this.f44987a = proxyListActivity;
    }

    @Override
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f44987a;
        if (i10 < proxyListActivity.f36105r || i10 >= proxyListActivity.f36106s) {
            return false;
        }
        proxyListActivity.f36099a.G(i10);
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.f44987a);
    }
}
