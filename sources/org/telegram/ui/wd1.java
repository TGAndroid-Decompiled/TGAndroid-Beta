package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class wd1 extends FrameLayout {
    public ValueAnimator f44647a;
    public boolean f44648b;
    public float f44649c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f44649c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f44649c;
            if (f10 != 1.0f) {
                this.f44649c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f44648b != z10) {
            this.f44648b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f44647a) != null) {
                valueAnimator.removeAllListeners();
                this.f44647a.cancel();
            }
            if (!z10) {
                float f7 = this.f44649c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f44647a = ofFloat;
                    ofFloat.addUpdateListener(new x11(this, 13));
                    this.f44647a.addListener(new hc1(this, 1));
                    d3.m(5.0f, this.f44647a);
                    this.f44647a.setDuration(350L);
                    this.f44647a.start();
                }
            }
        }
    }
}
