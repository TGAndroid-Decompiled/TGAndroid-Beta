package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class se1 extends FrameLayout {
    public TextView f43310a;
    public float f43311b;
    public boolean f43312c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f43312c) {
            float f7 = this.f43311b + 0.013333334f;
            this.f43311b = f7;
            if (f7 > 1.0f) {
                this.f43312c = false;
                this.f43311b = 1.0f;
            }
        } else {
            float f10 = this.f43311b - 0.013333334f;
            this.f43311b = f10;
            if (f10 < 0.0f) {
                this.f43312c = true;
                this.f43311b = 0.0f;
            }
        }
        TextView textView = this.f43310a;
        float interpolation = org.telegram.ui.Components.ds.f27530f.getInterpolation(this.f43311b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
