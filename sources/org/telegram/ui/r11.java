package org.telegram.ui;

import android.view.View;
public final class r11 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final ProxyListActivity f37677a;

    public r11(ProxyListActivity proxyListActivity) {
        this.f37677a = proxyListActivity;
    }

    @Override
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.f37677a;
        if (i10 >= proxyListActivity.f32185r && i10 < proxyListActivity.f32186s) {
            proxyListActivity.f32180a.G(i10);
            return true;
        }
        return false;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ProxyListActivity.V(this.f37677a);
    }
}
