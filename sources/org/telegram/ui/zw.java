package org.telegram.ui;

import android.view.View;
public final class zw extends org.telegram.ui.Components.r6 {
    public final int f40600b;
    public final ty f40601c;

    public zw(ty tyVar, int i10) {
        super("animationValue", 0);
        this.f40600b = i10;
        switch (i10) {
            case 1:
                this.f40601c = tyVar;
                super("viewPagerTranslation", 0);
                return;
            default:
                this.f40601c = tyVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40600b) {
            case 0:
                ((ty) obj).L4(f7);
                return;
            default:
                ty tyVar = this.f40601c;
                tyVar.I0 = f7;
                ((View) obj).setTranslationY(tyVar.J0 + f7);
                tyVar.O3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40600b) {
            case 0:
                ty tyVar = (ty) obj;
                return Float.valueOf(this.f40601c.N);
            default:
                View view = (View) obj;
                return Float.valueOf(this.f40601c.I0);
        }
    }
}
