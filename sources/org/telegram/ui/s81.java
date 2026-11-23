package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class s81 extends FrameLayout {
    public final int f52003a;
    public float f52004b;
    public boolean f52005c;
    public Object d;

    public s81(Context context, int i7) {
        super(context);
        this.f52003a = i7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f52003a) {
            case 0:
                float f10 = ((1.0f - this.f52004b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.f52004b;
                    if (f11 != 1.0f) {
                        this.f52004b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i7 = 1;
                if (this.f52005c) {
                    float f12 = this.f52004b + 0.013333334f;
                    this.f52004b = f12;
                    if (f12 > 1.0f) {
                        this.f52005c = false;
                        this.f52004b = 1.0f;
                    }
                } else {
                    float f13 = this.f52004b - 0.013333334f;
                    this.f52004b = f13;
                    if (f13 < 0.0f) {
                        this.f52005c = true;
                        this.f52004b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.kr.f36858f.getInterpolation(this.f52004b) * org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.gd.f24314a0) {
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
        switch (this.f52003a) {
            case 0:
                super.setPressed(z10);
                if (this.f52005c != z10) {
                    this.f52005c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f10 = this.f52004b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new hz0(this, 12));
                            ((ValueAnimator) this.d).addListener(new i71(this, 1));
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
