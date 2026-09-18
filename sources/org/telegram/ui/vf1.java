package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vf1 extends FrameLayout {
    public TextView f38415a;
    public float f38416b;
    public boolean f38417c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f38417c) {
            float f7 = this.f38416b + 0.013333334f;
            this.f38416b = f7;
            if (f7 > 1.0f) {
                this.f38417c = false;
                this.f38416b = 1.0f;
            }
        } else {
            float f10 = this.f38416b - 0.013333334f;
            this.f38416b = f10;
            if (f10 < 0.0f) {
                this.f38417c = true;
                this.f38416b = 0.0f;
            }
        }
        TextView textView = this.f38415a;
        float interpolation = org.telegram.ui.Components.qr.f27383f.getInterpolation(this.f38416b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
