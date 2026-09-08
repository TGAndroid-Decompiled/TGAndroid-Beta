package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ye1 extends FrameLayout {
    public ValueAnimator f43120a;
    public boolean f43121b;
    public float f43122c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f43122c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f43122c;
            if (f10 != 1.0f) {
                this.f43122c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f43121b != z10) {
            this.f43121b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f43120a) != null) {
                valueAnimator.removeAllListeners();
                this.f43120a.cancel();
            }
            if (!z10) {
                float f7 = this.f43122c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f43120a = ofFloat;
                    ofFloat.addUpdateListener(new b21(this, 16));
                    this.f43120a.addListener(new gk0(this, 26));
                    this.f43120a.setInterpolator(new OvershootInterpolator(5.0f));
                    this.f43120a.setDuration(350L);
                    this.f43120a.start();
                }
            }
        }
    }
}
