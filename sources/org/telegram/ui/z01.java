package org.telegram.ui;

import android.view.View;
public final class z01 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f45007a;

    public z01(ProxyListActivity proxyListActivity) {
        this.f45007a = proxyListActivity;
    }

    @Override
    public boolean c(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f45007a;
        if (i10 >= proxyListActivity.f36167r && i10 < proxyListActivity.f36168s) {
            proxyListActivity.f36161a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ProxyListActivity.V(this.f45007a);
    }
}
