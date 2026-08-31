package org.telegram.ui;

import android.view.View;
public final class yw extends org.telegram.ui.Components.m6 {
    public final int f43720b;
    public final py f43721c;

    public yw(py pyVar, int i10) {
        super("animationValue", 0);
        this.f43720b = i10;
        switch (i10) {
            case 1:
                this.f43721c = pyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f43721c = pyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f43720b) {
            case 0:
                ((py) obj).C4(f10);
                return;
            default:
                py pyVar = this.f43721c;
                pyVar.F0 = f10;
                ((View) obj).setTranslationY(pyVar.G0 + f10);
                pyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43720b) {
            case 0:
                py pyVar = (py) obj;
                return Float.valueOf(this.f43721c.K);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f43721c.F0);
        }
    }
}
