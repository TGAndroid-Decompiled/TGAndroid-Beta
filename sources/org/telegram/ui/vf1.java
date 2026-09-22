package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vf1 extends FrameLayout {
    public TextView f38562a;
    public float f38563b;
    public boolean f38564c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f38564c) {
            float f7 = this.f38563b + 0.013333334f;
            this.f38563b = f7;
            if (f7 > 1.0f) {
                this.f38564c = false;
                this.f38563b = 1.0f;
            }
        } else {
            float f10 = this.f38563b - 0.013333334f;
            this.f38563b = f10;
            if (f10 < 0.0f) {
                this.f38564c = true;
                this.f38563b = 0.0f;
            }
        }
        TextView textView = this.f38562a;
        float interpolation = org.telegram.ui.Components.qr.f27653f.getInterpolation(this.f38563b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
