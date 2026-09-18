package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ze1 extends FrameLayout {
    public ValueAnimator f40243a;
    public boolean f40244b;
    public float f40245c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f40245c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f40245c;
            if (f10 != 1.0f) {
                this.f40245c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f40244b != z10) {
            this.f40244b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f40243a) != null) {
                valueAnimator.removeAllListeners();
                this.f40243a.cancel();
            }
            if (!z10) {
                float f7 = this.f40245c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f40243a = ofFloat;
                    ofFloat.addUpdateListener(new k21(this, 15));
                    this.f40243a.addListener(new er0(this, 23));
                    this.f40243a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f40243a.setDuration(350L);
                    this.f40243a.start();
                }
            }
        }
    }
}
