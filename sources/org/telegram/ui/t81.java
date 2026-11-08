package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class t81 extends FrameLayout {
    public final int f49977a;
    public float f49978b;
    public boolean f49979c;
    public Object d;

    public t81(Context context, int i7) {
        super(context);
        this.f49977a = i7;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f49977a) {
            case 0:
                float f10 = ((1.0f - this.f49978b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.f49978b;
                    if (f11 != 1.0f) {
                        this.f49978b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                int i7 = 1;
                if (this.f49979c) {
                    float f12 = this.f49978b + 0.013333334f;
                    this.f49978b = f12;
                    if (f12 > 1.0f) {
                        this.f49979c = false;
                        this.f49978b = 1.0f;
                    }
                } else {
                    float f13 = this.f49978b - 0.013333334f;
                    this.f49978b = f13;
                    if (f13 < 0.0f) {
                        this.f49979c = true;
                        this.f49978b = 0.0f;
                    }
                }
                TextView textView = (TextView) this.d;
                float interpolation = org.telegram.ui.Components.xq.f40366f.getInterpolation(this.f49978b) * org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.id.f23157a0) {
                    i7 = -1;
                }
                textView.setTranslationX(interpolation * i7);
                invalidate();
                return;
        }
    }

    @Override
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        switch (this.f49977a) {
            case 0:
                super.setPressed(z9);
                if (this.f49979c != z9) {
                    this.f49979c = z9;
                    invalidate();
                    if (z9 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z9) {
                        float f10 = this.f49978b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new gz0(this, 12));
                            ((ValueAnimator) this.d).addListener(new s81(this, 0));
                            org.telegram.messenger.camera.q.i(5.0f, (ValueAnimator) this.d);
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
                super.setPressed(z9);
                return;
        }
    }
}
