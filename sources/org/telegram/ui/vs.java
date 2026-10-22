package org.telegram.ui;

import android.view.ViewGroup;
public final class vs extends org.telegram.ui.ActionBar.m1 {
    public final at f42367o;

    public vs(at atVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f42367o = atVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        et etVar = this.f42367o.f35419a;
        etVar.f36789k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
    }
}
