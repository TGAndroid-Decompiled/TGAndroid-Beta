package org.telegram.ui;

import android.view.ViewTreeObserver;
public final class vk implements ViewTreeObserver.OnPreDrawListener {
    public final int f44852a;
    public final Object f44853b;

    public vk(Object obj, int i10) {
        this.f44852a = i10;
        this.f44853b = obj;
    }

    @Override
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f44852a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) ((wk) this.f44853b).d).actionBar;
                kVar.invalidate();
                return true;
            default:
                ((w91) this.f44853b).p0();
                return true;
        }
    }
}
