package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uf1 extends FrameLayout {
    public TextView f41085a;
    public float f41086b;
    public boolean f41087c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f41087c) {
            float f7 = this.f41086b + 0.013333334f;
            this.f41086b = f7;
            if (f7 > 1.0f) {
                this.f41087c = false;
                this.f41086b = 1.0f;
            }
        } else {
            float f10 = this.f41086b - 0.013333334f;
            this.f41086b = f10;
            if (f10 < 0.0f) {
                this.f41087c = true;
                this.f41086b = 0.0f;
            }
        }
        TextView textView = this.f41085a;
        float interpolation = org.telegram.ui.Components.pr.f29466f.getInterpolation(this.f41086b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
