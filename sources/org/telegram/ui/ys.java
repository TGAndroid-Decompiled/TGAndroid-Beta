package org.telegram.ui;

import android.view.ViewGroup;
public final class ys extends org.telegram.ui.ActionBar.o1 {
    public final dt f44938o;

    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f44938o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f44938o.f37593a;
        htVar.f38922k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
