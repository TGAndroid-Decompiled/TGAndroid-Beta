package org.telegram.ui;

import android.view.ViewGroup;
public final class ys extends org.telegram.ui.ActionBar.m1 {
    public final dt f43943o;

    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f43943o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f43943o.f36721a;
        htVar.f37995k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
