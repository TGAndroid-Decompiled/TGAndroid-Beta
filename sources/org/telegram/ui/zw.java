package org.telegram.ui;

import android.view.View;
public final class zw extends org.telegram.ui.Components.m6 {
    public final int f40884b;
    public final qy f40885c;

    public zw(qy qyVar, int i10) {
        super("animationValue", 0);
        this.f40884b = i10;
        switch (i10) {
            case 1:
                this.f40885c = qyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40885c = qyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f40884b) {
            case 0:
                ((qy) obj).C4(f10);
                return;
            default:
                qy qyVar = this.f40885c;
                qyVar.F0 = f10;
                ((View) obj).setTranslationY(qyVar.G0 + f10);
                qyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40884b) {
            case 0:
                qy qyVar = (qy) obj;
                return Float.valueOf(this.f40885c.K);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40885c.F0);
        }
    }
}
