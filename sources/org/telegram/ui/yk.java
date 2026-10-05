package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class yk implements ViewTreeObserver.OnPreDrawListener {
    public final int f43246a;
    public final Object f43247b;

    public yk(Object obj, int i10) {
        this.f43246a = i10;
        this.f43247b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f43246a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) ((zk) this.f43247b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((ta1) this.f43247b).n0();
                return true;
        }
    }
}
