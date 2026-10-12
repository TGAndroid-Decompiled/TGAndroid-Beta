package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class v41 extends org.telegram.ui.Components.r6 {
    public boolean f42670s;
    public final org.telegram.ui.Components.g6 v;
    public final SaveToGallerySettingsActivity f42671w;

    public v41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f42671w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.g6(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f42670s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var = this.v;
        g6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.h6.f20945y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f42671w;
        setTextColor(i0.a.d(g6Var.f26303c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20744n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f42670s != z10) {
            this.f42670s = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.v.d(f7, z11);
            invalidate();
        }
    }
}
