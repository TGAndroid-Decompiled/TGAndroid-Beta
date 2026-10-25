package org.telegram.ui;

import android.view.ViewGroup;
public final class ws extends org.telegram.ui.ActionBar.o1 {
    public final bt f45544o;

    public ws(bt btVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f45544o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f45544o.f38155a;
        ftVar.f39455k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
