package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uf1 extends FrameLayout {
    public TextView f41086a;
    public float f41087b;
    public boolean f41088c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f41088c) {
            float f7 = this.f41087b + 0.013333334f;
            this.f41087b = f7;
            if (f7 > 1.0f) {
                this.f41088c = false;
                this.f41087b = 1.0f;
            }
        } else {
            float f10 = this.f41087b - 0.013333334f;
            this.f41087b = f10;
            if (f10 < 0.0f) {
                this.f41088c = true;
                this.f41087b = 0.0f;
            }
        }
        TextView textView = this.f41086a;
        float interpolation = org.telegram.ui.Components.pr.f29467f.getInterpolation(this.f41087b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
