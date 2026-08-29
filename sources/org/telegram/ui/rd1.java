package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class rd1 extends FrameLayout {
    public ValueAnimator f42075a;
    public boolean f42076b;
    public float f42077c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9 = ((1.0f - this.f42077c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f9, f9, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f42077c;
            if (f10 != 1.0f) {
                this.f42077c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f42076b != z10) {
            this.f42076b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f42075a) != null) {
                valueAnimator.removeAllListeners();
                this.f42075a.cancel();
            }
            if (!z10) {
                float f9 = this.f42077c;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.f42075a = ofFloat;
                    ofFloat.addUpdateListener(new w01(this, 16));
                    this.f42075a.addListener(new cc1(this, 1));
                    this.f42075a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f42075a.setDuration(350L);
                    this.f42075a.start();
                }
            }
        }
    }
}
