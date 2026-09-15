package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class xe1 extends FrameLayout {
    public ValueAnimator f39606a;
    public boolean f39607b;
    public float f39608c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f39608c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f39608c;
            if (f10 != 1.0f) {
                this.f39608c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f39607b != z10) {
            this.f39607b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f39606a) != null) {
                valueAnimator.removeAllListeners();
                this.f39606a.cancel();
            }
            if (!z10) {
                float f7 = this.f39608c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f39606a = ofFloat;
                    ofFloat.addUpdateListener(new z11(this, 16));
                    this.f39606a.addListener(new cr0(this, 23));
                    this.f39606a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f39606a.setDuration(350L);
                    this.f39606a.start();
                }
            }
        }
    }
}
