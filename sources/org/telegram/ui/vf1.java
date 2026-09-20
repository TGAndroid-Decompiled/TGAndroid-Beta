package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vf1 extends FrameLayout {
    public TextView f38541a;
    public float f38542b;
    public boolean f38543c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f38543c) {
            float f7 = this.f38542b + 0.013333334f;
            this.f38542b = f7;
            if (f7 > 1.0f) {
                this.f38543c = false;
                this.f38542b = 1.0f;
            }
        } else {
            float f10 = this.f38542b - 0.013333334f;
            this.f38542b = f10;
            if (f10 < 0.0f) {
                this.f38543c = true;
                this.f38542b = 0.0f;
            }
        }
        TextView textView = this.f38541a;
        float interpolation = org.telegram.ui.Components.qr.f27642f.getInterpolation(this.f38542b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
