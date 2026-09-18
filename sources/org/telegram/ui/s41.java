package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class s41 extends org.telegram.ui.Components.n6 {
    public boolean f37386s;
    public final org.telegram.ui.Components.c6 v;
    public final SaveToGallerySettingsActivity f37387w;

    public s41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37387w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.c6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37386s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.c6 c6Var = this.v;
        c6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f19245y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37387w;
        setTextColor(i0.a.d(c6Var.f22940c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19048n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37386s != z10) {
            this.f37386s = z10;
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
