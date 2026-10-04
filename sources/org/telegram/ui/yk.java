package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class yk implements ViewTreeObserver.OnPreDrawListener {
    public final int f43253a;
    public final Object f43254b;

    public yk(Object obj, int i10) {
        this.f43253a = i10;
        this.f43254b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f43253a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) ((zk) this.f43254b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((va1) this.f43254b).n0();
                return true;
        }
    }
}
