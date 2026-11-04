package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class ry0 extends org.telegram.ui.Components.h6 {
    public boolean f49304s;
    public final org.telegram.ui.Components.u5 f49305w;
    public final SaveToGallerySettingsActivity f49306x;

    public ry0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f49306x = saveToGallerySettingsActivity;
        this.f49305w = new org.telegram.ui.Components.u5(this);
        getDrawable().J = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f49304s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.u5 u5Var = this.f49305w;
        u5Var.e(false, f10);
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f49306x;
        setTextColor(i0.a.f(u5Var.f38645c, saveToGallerySettingsActivity.getThemedColor(i3), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f28062n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        if (this.f49304s != z10) {
            this.f49304s = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f49305w.e(z11, f10);
            invalidate();
        }
    }
}
