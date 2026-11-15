package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class rj extends org.telegram.ui.Components.tc {
    public final an d;

    public rj(an anVar, Context context) {
        super(context);
        this.d = anVar;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        an anVar = this.d;
        qj qjVar = anVar.f45117a0;
        if (qjVar != null) {
            qjVar.invalidate();
        }
        if (getVisibility() != 8) {
            anVar.G9(true);
            FrameLayout frameLayout = anVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            anVar.M9();
            anVar.O9();
            View view = anVar.fragmentView;
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
