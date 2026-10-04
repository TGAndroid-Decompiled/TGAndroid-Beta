package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class se1 extends FrameLayout {
    public ValueAnimator f40473a;
    public boolean f40474b;
    public float f40475c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f40475c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f40475c;
            if (f10 != 1.0f) {
                this.f40475c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f40474b != z10) {
            this.f40474b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f40473a) != null) {
                valueAnimator.removeAllListeners();
                this.f40473a.cancel();
            }
            if (!z10) {
                float f7 = this.f40475c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f40473a = ofFloat;
                    ofFloat.addUpdateListener(new b21(this, 15));
                    this.f40473a.addListener(new ap0(this, 24));
                    this.f40473a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f40473a.setDuration(350L);
                    this.f40473a.start();
                }
            }
        }
    }
}
