package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class y31 extends org.telegram.ui.Components.k6 {
    public boolean f40377s;
    public final org.telegram.ui.Components.z5 v;
    public final SaveToGallerySettingsActivity f40378w;

    public y31(SaveToGallerySettingsActivity saveToGallerySettingsActivity, Activity activity) {
        super(activity, true, true, false);
        this.f40378w = saveToGallerySettingsActivity;
        this.v = new org.telegram.ui.Components.z5(this);
        getDrawable().D = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.f40377s) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.z5 z5Var = this.v;
        z5Var.d(f10, false);
        int i10 = org.telegram.ui.ActionBar.j6.f20281y6;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f40378w;
        setTextColor(i0.a.d(z5Var.f31241c, saveToGallerySettingsActivity.getThemedColor(i10), saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f20085n6)));
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        float f10;
        if (this.f40377s != z4) {
            this.f40377s = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.v.d(f10, z10);
            invalidate();
        }
    }
}
