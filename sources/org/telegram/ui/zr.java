package org.telegram.ui;

import android.view.ViewGroup;
public final class zr extends org.telegram.ui.ActionBar.f1 {
    public final es f52742o;

    public zr(es esVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f52742o = esVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        is isVar = this.f52742o.f45025a;
        isVar.f46395k = null;
        isVar.K = false;
        if (isVar.R) {
            isVar.m();
        }
    }
}
