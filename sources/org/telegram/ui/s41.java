package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class s41 extends org.telegram.ui.Components.r6 {
    public boolean f41581s;
    public final org.telegram.ui.Components.g6 v;
    public final SaveToGallerySettingsActivity f41582w;

    public s41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f41582w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.g6(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f41581s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var = this.v;
        g6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.h6.f21171y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f41582w;
        setTextColor(i0.a.d(g6Var.f26613c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20971n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f41581s != z10) {
            this.f41581s = z10;
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
