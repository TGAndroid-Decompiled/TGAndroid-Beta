package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class yk implements ViewTreeObserver.OnPreDrawListener {
    public final int f43245a;
    public final Object f43246b;

    public yk(Object obj, int i10) {
        this.f43245a = i10;
        this.f43246b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f43245a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) ((zk) this.f43246b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((va1) this.f43246b).n0();
                return true;
        }
    }
}
