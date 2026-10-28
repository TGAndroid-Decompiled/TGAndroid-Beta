package tg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;
import sg.b2;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48915a;
    public final Object f48916b;
    public final Object f48917c;

    public i1(int i10, Object obj, Object obj2) {
        this.f48915a = i10;
        this.f48916b = obj;
        this.f48917c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48915a) {
            case 0:
                ml0 ml0Var = (ml0) this.f48916b;
                ml0Var.getClass();
                ((Drawable) this.f48917c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ml0Var.f30559c).A0;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                b2 b2Var = (b2) this.f48916b;
                boolean[] zArr = (boolean[]) this.f48917c;
                b2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float f7 = floatValue / 0.5f;
                    b2Var.setRotationY(90.0f * f7);
                    b2Var.f48202z0 = ((1.0f - f7) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f48194r0.b(b2Var.f48201y0, false);
                }
                float f10 = (floatValue - 0.5f) / 0.5f;
                b2Var.setRotationY((1.0f - f10) * (-90.0f));
                b2Var.f48202z0 = (f10 * 0.3f) + 0.7f;
                b2Var.invalidate();
                return;
        }
    }
}
