package org.telegram.ui;

import android.view.View;
public final class u11 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final ProxyListActivity f41082a;

    public u11(ProxyListActivity proxyListActivity) {
        this.f41082a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f41082a;
        if (i10 >= proxyListActivity.f34407n && i10 < proxyListActivity.f34408r) {
            proxyListActivity.f34402a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.T(this.f41082a);
    }
}
