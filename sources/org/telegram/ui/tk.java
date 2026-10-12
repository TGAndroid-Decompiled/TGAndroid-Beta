package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class tk extends org.telegram.ui.Components.sd {
    public final eo d;

    public tk(eo eoVar, Context context) {
        super(context);
        this.d = eoVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        eo eoVar = this.d;
        sk skVar = eoVar.Y;
        if (skVar != null) {
            skVar.invalidate();
        }
        if (getVisibility() != 8) {
            eoVar.m9(true);
            FrameLayout frameLayout = eoVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            eoVar.t9();
            eoVar.w9();
            View view = eoVar.fragmentView;
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
