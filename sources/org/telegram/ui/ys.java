package org.telegram.ui;

import android.view.ViewGroup;
public final class ys extends org.telegram.ui.ActionBar.o1 {
    public final dt f44962o;

    public ys(dt dtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f44962o = dtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ht htVar = this.f44962o.f37629a;
        htVar.f39031k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.n();
        }
    }
}
