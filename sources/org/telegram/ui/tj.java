package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class tj extends org.telegram.ui.Components.yc {
    public final cn d;

    public tj(cn cnVar, Context context) {
        super(context);
        this.d = cnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cn cnVar = this.d;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            sjVar.invalidate();
        }
        if (getVisibility() != 8) {
            cnVar.F9(true);
            FrameLayout frameLayout = cnVar.Q;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            cnVar.L9();
            cnVar.N9();
            View view = cnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i7) {
        FrameLayout frameLayout;
        super.setVisibility(i7);
        if (i7 == 8 && (frameLayout = this.d.Q) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
