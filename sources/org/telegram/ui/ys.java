package org.telegram.ui;

import android.view.ViewGroup;
public final class ys extends org.telegram.ui.ActionBar.m1 {
    public final dt f43961o;

    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f43961o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f43961o.f36729a;
        htVar.f37944k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
