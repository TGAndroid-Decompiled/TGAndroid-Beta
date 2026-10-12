package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class tk extends org.telegram.ui.Components.qd {
    public final fo d;

    public tk(fo foVar, Context context) {
        super(context);
        this.d = foVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        fo foVar = this.d;
        sk skVar = foVar.Y;
        if (skVar != null) {
            skVar.invalidate();
        }
        if (getVisibility() != 8) {
            foVar.m9(true);
            FrameLayout frameLayout = foVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            foVar.t9();
            foVar.w9();
            View view = foVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 == 8 && (frameLayout = this.d.P) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
