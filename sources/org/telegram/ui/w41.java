package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class w41 extends org.telegram.ui.Components.o6 {
    public boolean f37701s;
    public final org.telegram.ui.Components.d6 v;
    public final SaveToGallerySettingsActivity f37702w;

    public w41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37702w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.d6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37701s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.v;
        d6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f18306y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37702w;
        setTextColor(i0.a.d(d6Var.f22295c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f18110n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37701s != z10) {
            this.f37701s = z10;
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
