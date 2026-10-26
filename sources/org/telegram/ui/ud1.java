package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ud1 extends FrameLayout {
    public ValueAnimator f44112a;
    public boolean f44113b;
    public float f44114c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f44114c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f44114c;
            if (f10 != 1.0f) {
                this.f44114c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f44113b != z10) {
            this.f44113b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f44112a) != null) {
                valueAnimator.removeAllListeners();
                this.f44112a.cancel();
            }
            if (!z10) {
                float f7 = this.f44114c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f44112a = ofFloat;
                    ofFloat.addUpdateListener(new v11(this, 13));
                    this.f44112a.addListener(new fc1(this, 1));
                    d3.m(5.0f, this.f44112a);
                    this.f44112a.setDuration(350L);
                    this.f44112a.start();
                }
            }
        }
    }
}
