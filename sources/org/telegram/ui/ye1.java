package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ye1 extends FrameLayout {
    public ValueAnimator f44346a;
    public boolean f44347b;
    public float f44348c;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7 = ((1.0f - this.f44348c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f10 = this.f44348c;
            if (f10 != 1.0f) {
                this.f44348c = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.f44347b != z10) {
            this.f44347b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.f44346a) != null) {
                valueAnimator.removeAllListeners();
                this.f44346a.cancel();
            }
            if (!z10) {
                float f7 = this.f44348c;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f44346a = ofFloat;
                    ofFloat.addUpdateListener(new x11(this, 16));
                    this.f44346a.addListener(new dp0(this, 24));
                    org.telegram.messenger.ai.l(5.0f, this.f44346a);
                    this.f44346a.setDuration(350L);
                    this.f44346a.start();
                }
            }
        }
    }
}
