package org.telegram.ui;

import android.view.View;
public final class yw extends org.telegram.ui.Components.m6 {
    public final int f43721b;
    public final py f43722c;

    public yw(py pyVar, int i10) {
        super("animationValue", 0);
        this.f43721b = i10;
        switch (i10) {
            case 1:
                this.f43722c = pyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f43722c = pyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f43721b) {
            case 0:
                ((py) obj).C4(f10);
                return;
            default:
                py pyVar = this.f43722c;
                pyVar.F0 = f10;
                ((View) obj).setTranslationY(pyVar.G0 + f10);
                pyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43721b) {
            case 0:
                py pyVar = (py) obj;
                return Float.valueOf(this.f43722c.K);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f43722c.F0);
        }
    }
}
