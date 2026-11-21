package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class sj extends org.telegram.ui.Components.cd {
    public final bn d;

    public sj(bn bnVar, Context context) {
        super(context);
        this.d = bnVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        bn bnVar = this.d;
        rj rjVar = bnVar.f45946a0;
        if (rjVar != null) {
            rjVar.invalidate();
        }
        if (getVisibility() != 8) {
            bnVar.G9(true);
            FrameLayout frameLayout = bnVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            bnVar.M9();
            bnVar.O9();
            View view = bnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i7) {
        FrameLayout frameLayout;
        super.setVisibility(i7);
        if (i7 == 8 && (frameLayout = this.d.R) != null) {
            frameLayout.setTranslationY(0.0f);
        }
    }
}
