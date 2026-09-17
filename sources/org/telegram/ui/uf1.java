package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uf1 extends FrameLayout {
    public TextView f41113a;
    public float f41114b;
    public boolean f41115c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f41115c) {
            float f7 = this.f41114b + 0.013333334f;
            this.f41114b = f7;
            if (f7 > 1.0f) {
                this.f41115c = false;
                this.f41114b = 1.0f;
            }
        } else {
            float f10 = this.f41114b - 0.013333334f;
            this.f41114b = f10;
            if (f10 < 0.0f) {
                this.f41115c = true;
                this.f41114b = 0.0f;
            }
        }
        TextView textView = this.f41113a;
        float interpolation = org.telegram.ui.Components.pr.f29494f.getInterpolation(this.f41114b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
