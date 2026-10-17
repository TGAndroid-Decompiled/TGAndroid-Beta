package org.telegram.ui;

import android.view.ViewGroup;
public final class xs extends org.telegram.ui.ActionBar.m1 {
    public final ct f43242o;

    public xs(ct ctVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f43242o = ctVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        gt gtVar = this.f43242o.f35984a;
        gtVar.f37321k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
    }
}
