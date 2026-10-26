package org.telegram.ui;

import android.view.ViewGroup;
public final class ws extends org.telegram.ui.ActionBar.o1 {
    public final bt f45547o;

    public ws(bt btVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f45547o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f45547o.f38158a;
        ftVar.f39458k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
