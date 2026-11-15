package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class zy0 extends org.telegram.ui.Components.h6 {
    public boolean f54069s;
    public final org.telegram.ui.Components.u5 f54070w;
    public final SaveToGallerySettingsActivity f54071x;

    public zy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f54071x = saveToGallerySettingsActivity;
        this.f54070w = new org.telegram.ui.Components.u5(this);
        getDrawable().K = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f54069s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var = this.f54070w;
        u5Var.e(false, f10);
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f54071x;
        setTextColor(i0.a.f(u5Var.f39903c, saveToGallerySettingsActivity.getThemedColor(i7), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f29031n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f54069s != z10) {
            this.f54069s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f54070w.e(z11, f10);
            invalidate();
        }
    }
}
