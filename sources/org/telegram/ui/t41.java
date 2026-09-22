package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class t41 extends org.telegram.ui.Components.o6 {
    public boolean f37642s;
    public final org.telegram.ui.Components.d6 v;
    public final SaveToGallerySettingsActivity f37643w;

    public t41(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f37643w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.d6(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f37642s) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.v;
        d6Var.d(f7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f19492y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37643w;
        setTextColor(i0.a.d(d6Var.f23570c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19294n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f7;
        if (this.f37642s != z10) {
            this.f37642s = z10;
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
