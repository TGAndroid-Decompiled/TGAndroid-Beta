package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class u81 extends FrameLayout {
    public final int f52475a;
    public float f52476b;
    public boolean f52477c;
    public Object d;

    public u81(Context context, int i7) {
        super(context);
        this.f52475a = i7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f52475a) {
            case 0:
                float f10 = ((1.0f - this.f52476b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.f52476b;
                    if (f11 != 1.0f) {
                        this.f52476b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i7 = 1;
                if (this.f52477c) {
                    float f12 = this.f52476b + 0.013333334f;
                    this.f52476b = f12;
                    if (f12 > 1.0f) {
                        this.f52477c = false;
                        this.f52476b = 1.0f;
                    }
                } else {
                    float f13 = this.f52476b - 0.013333334f;
                    this.f52476b = f13;
                    if (f13 < 0.0f) {
                        this.f52477c = true;
                        this.f52476b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.nr.f37956f.getInterpolation(this.f52476b) * org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.gd.f24241a0) {
                    i7 = -1;
                }
                textView.setTranslationX(interpolation * i7);
                invalidate();
                return;
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.f52475a) {
            case 0:
                super.setPressed(z10);
                if (this.f52477c != z10) {
                    this.f52477c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f10 = this.f52476b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new iz0(this, 12));
                            ((ValueAnimator) this.d).addListener(new k71(this, 1));
                            org.telegram.ui.Cells.c0.q(5.0f, (ValueAnimator) this.d);
                            ((ValueAnimator) this.d).setDuration(350L);
                            ((ValueAnimator) this.d).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setPressed(z10);
                return;
        }
    }
}
