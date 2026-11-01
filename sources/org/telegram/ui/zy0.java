package org.telegram.ui;

import android.view.View;
public final class zy0 implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.u1 {
    public final ProxyListActivity f44255a;

    public zy0(ProxyListActivity proxyListActivity) {
        this.f44255a = proxyListActivity;
    }

    @Override
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f44255a;
        if (i10 >= proxyListActivity.f33968n && i10 < proxyListActivity.f33969r) {
            proxyListActivity.f33964a.M(i10);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ProxyListActivity.a0(this.f44255a);
    }
}
