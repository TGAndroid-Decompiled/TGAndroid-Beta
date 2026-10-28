package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class xk implements ViewTreeObserver.OnPreDrawListener {
    public final int f45727a;
    public final Object f45728b;

    public xk(Object obj, int i10) {
        this.f45727a = i10;
        this.f45728b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f45727a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) ((yk) this.f45728b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((y91) this.f45728b).p0();
                return true;
        }
    }
}
