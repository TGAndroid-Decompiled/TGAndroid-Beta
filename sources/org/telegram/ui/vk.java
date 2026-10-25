package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class vk implements ViewTreeObserver.OnPreDrawListener {
    public final int f44849a;
    public final Object f44850b;

    public vk(Object obj, int i10) {
        this.f44849a = i10;
        this.f44850b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f44849a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) ((wk) this.f44850b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((w91) this.f44850b).p0();
                return true;
        }
    }
}
