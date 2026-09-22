package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class r41 extends org.telegram.ui.Components.n6 {
    public boolean f37023s;
    public final org.telegram.ui.Components.c6 v;
    public final SaveToGallerySettingsActivity f37024w;

    public r41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37024w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.c6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37023s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var = this.v;
        c6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.i6.f19215y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37024w;
        setTextColor(i0.a.d(c6Var.f22951c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f19018n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37023s != z10) {
            this.f37023s = z10;
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
