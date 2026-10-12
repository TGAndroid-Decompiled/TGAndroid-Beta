package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xf1 extends FrameLayout {
    public TextView f43926a;
    public float f43927b;
    public boolean f43928c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f43928c) {
            float f7 = this.f43927b + 0.013333334f;
            this.f43927b = f7;
            if (f7 > 1.0f) {
                this.f43928c = false;
                this.f43927b = 1.0f;
            }
        } else {
            float f10 = this.f43927b - 0.013333334f;
            this.f43927b = f10;
            if (f10 < 0.0f) {
                this.f43928c = true;
                this.f43927b = 0.0f;
            }
        }
        TextView textView = this.f43926a;
        float interpolation = org.telegram.ui.Components.js.f27627f.getInterpolation(this.f43927b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
