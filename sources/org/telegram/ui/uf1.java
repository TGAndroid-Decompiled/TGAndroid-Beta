package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uf1 extends FrameLayout {
    public TextView f37967a;
    public float f37968b;
    public boolean f37969c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 1;
        if (this.f37969c) {
            float f7 = this.f37968b + 0.013333334f;
            this.f37968b = f7;
            if (f7 > 1.0f) {
                this.f37969c = false;
                this.f37968b = 1.0f;
            }
        } else {
            float f10 = this.f37968b - 0.013333334f;
            this.f37968b = f10;
            if (f10 < 0.0f) {
                this.f37969c = true;
                this.f37968b = 0.0f;
            }
        }
        TextView textView = this.f37967a;
        float interpolation = org.telegram.ui.Components.qr.f27420f.getInterpolation(this.f37968b) * AndroidUtilities.dp(8.0f);
        if (LocaleController.isRTL) {
            i10 = -1;
        }
        textView.setTranslationX(interpolation * i10);
        invalidate();
    }
}
