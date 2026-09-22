package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ze1 extends FrameLayout {
    public ValueAnimator f40225a;
    public boolean f40226b;
    public float f40227c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f40227c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f40227c;
            if (f10 != 1.0f) {
                this.f40227c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f40226b != z10) {
            this.f40226b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f40225a) != null) {
                valueAnimator.removeAllListeners();
                this.f40225a.cancel();
            }
            if (!z10) {
                float f7 = this.f40227c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f40225a = ofFloat;
                    ofFloat.addUpdateListener(new i21(this, 15));
                    this.f40225a.addListener(new gp0(this, 24));
                    this.f40225a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f40225a.setDuration(350L);
                    this.f40225a.start();
                }
            }
        }
    }
}
