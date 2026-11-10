package org.telegram.ui;

import android.view.View;
public final class qx0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final ProxyListActivity f49174a;

    public qx0(ProxyListActivity proxyListActivity) {
        this.f49174a = proxyListActivity;
    }

    @Override
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.f49174a;
        if (i7 >= proxyListActivity.f41879n && i7 < proxyListActivity.f41880r) {
            proxyListActivity.f41874a.M(i7);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.f49174a);
    }
}
