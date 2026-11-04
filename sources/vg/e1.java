package vg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ri0;
public final class e1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f56601a;
    public final Object f56602b;
    public final Object f56603c;

    public e1(int i3, Object obj, Object obj2) {
        this.f56601a = i3;
        this.f56602b = obj;
        this.f56603c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56601a) {
            case 0:
                ri0 ri0Var = (ri0) this.f56602b;
                ri0Var.getClass();
                ((Drawable) this.f56603c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((h1) ri0Var.f37738c).f56642t2;
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).p2();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                ug.q1 q1Var = (ug.q1) this.f56602b;
                boolean[] zArr = (boolean[]) this.f56603c;
                q1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float f10 = floatValue / 0.5f;
                    q1Var.setRotationY(90.0f * f10);
                    q1Var.A0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f56222s0.b(q1Var.f56229z0, false);
                }
                float f11 = (floatValue - 0.5f) / 0.5f;
                q1Var.setRotationY((1.0f - f11) * (-90.0f));
                q1Var.A0 = (f11 * 0.3f) + 0.7f;
                q1Var.invalidate();
                return;
        }
    }
}
