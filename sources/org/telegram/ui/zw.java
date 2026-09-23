package org.telegram.ui;

import android.view.View;
public final class zw extends org.telegram.ui.Components.r6 {
    public final int f40259b;
    public final ry f40260c;

    public zw(ry ryVar, int i10) {
        super("animationValue", 0);
        this.f40259b = i10;
        switch (i10) {
            case 1:
                this.f40260c = ryVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40260c = ryVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f40259b) {
            case 0:
                ((ry) obj).C4(f7);
                return;
            default:
                ry ryVar = this.f40260c;
                ryVar.I0 = f7;
                ((View) obj).setTranslationY(ryVar.J0 + f7);
                ryVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40259b) {
            case 0:
                ry ryVar = (ry) obj;
                return Float.valueOf(this.f40260c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40260c.I0);
        }
    }
}
