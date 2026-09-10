package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class yf1 extends FrameLayout {
    public TextView f38992a;
    public float f38993b;
    public boolean f38994c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f38994c) {
            float f7 = this.f38993b + 0.013333334f;
            this.f38993b = f7;
            if (f7 > 1.0f) {
                this.f38994c = false;
                this.f38993b = 1.0f;
            }
        } else {
            float f10 = this.f38993b - 0.013333334f;
            this.f38993b = f10;
            if (f10 < 0.0f) {
                this.f38994c = true;
                this.f38993b = 0.0f;
            }
        }
        TextView textView = this.f38992a;
        float interpolation = org.telegram.ui.Components.wr.f28819f.getInterpolation(this.f38993b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
