package org.telegram.ui;

import android.view.View;
public final class y01 implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final ProxyListActivity f44666a;

    public y01(ProxyListActivity proxyListActivity) {
        this.f44666a = proxyListActivity;
    }

    @Override
    public boolean a(int i9, View view) {
        ProxyListActivity proxyListActivity = this.f44666a;
        if (i9 >= proxyListActivity.f36102r && i9 < proxyListActivity.f36103s) {
            proxyListActivity.f36096a.G(i9);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ProxyListActivity.U(this.f44666a);
    }
}
