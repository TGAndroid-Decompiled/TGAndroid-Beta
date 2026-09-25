package org.telegram.ui;

import android.view.View;
public final class yw extends org.telegram.ui.Components.r6 {
    public final int f40264b;
    public final qy f40265c;

    public yw(qy qyVar, int i10) {
        super("animationValue", 0);
        this.f40264b = i10;
        switch (i10) {
            case 1:
                this.f40265c = qyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40265c = qyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f40264b) {
            case 0:
                ((qy) obj).C4(f7);
                return;
            default:
                qy qyVar = this.f40265c;
                qyVar.I0 = f7;
                ((View) obj).setTranslationY(qyVar.J0 + f7);
                qyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40264b) {
            case 0:
                qy qyVar = (qy) obj;
                return Float.valueOf(this.f40265c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40265c.I0);
        }
    }
}
