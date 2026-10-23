package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class rd1 extends FrameLayout {
    public ValueAnimator f41104a;
    public boolean f41105b;
    public float f41106c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f41106c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f41106c;
            if (f10 != 1.0f) {
                this.f41106c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f41105b != z10) {
            this.f41105b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f41104a) != null) {
                valueAnimator.removeAllListeners();
                this.f41104a.cancel();
            }
            if (!z10) {
                float f7 = this.f41106c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f41104a = ofFloat;
                    ofFloat.addUpdateListener(new g11(this, 14));
                    this.f41104a.addListener(new v70(this, 29));
                    org.telegram.messenger.sl.l(5.0f, this.f41104a);
                    this.f41104a.setDuration(350L);
                    this.f41104a.start();
                }
            }
        }
    }
}
