package org.telegram.ui;

import android.view.ViewGroup;
public final class ys extends org.telegram.ui.ActionBar.o1 {
    public final dt f46075o;

    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f46075o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f46075o.f38675a;
        htVar.f39973k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
