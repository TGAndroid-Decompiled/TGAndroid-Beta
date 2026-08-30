package org.telegram.ui;

import android.view.View;
public final class xw extends org.telegram.ui.Components.m6 {
    public final int f40318b;
    public final oy f40319c;

    public xw(oy oyVar, int i10) {
        super("animationValue", 0);
        this.f40318b = i10;
        switch (i10) {
            case 1:
                this.f40319c = oyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40319c = oyVar;
                return;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f40318b) {
            case 0:
                ((oy) obj).C4(f10);
                return;
            default:
                oy oyVar = this.f40319c;
                oyVar.F0 = f10;
                ((View) obj).setTranslationY(oyVar.G0 + f10);
                oyVar.F3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40318b) {
            case 0:
                oy oyVar = (oy) obj;
                return Float.valueOf(this.f40319c.K);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40319c.F0);
        }
    }
}
