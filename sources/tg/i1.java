package tg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ll0;
import sg.c2;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48877a;
    public final Object f48878b;
    public final Object f48879c;

    public i1(int i10, Object obj, Object obj2) {
        this.f48877a = i10;
        this.f48878b = obj;
        this.f48879c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48877a) {
            case 0:
                ll0 ll0Var = (ll0) this.f48878b;
                ll0Var.getClass();
                ((Drawable) this.f48879c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ll0Var.f30226c).A0;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                c2 c2Var = (c2) this.f48878b;
                boolean[] zArr = (boolean[]) this.f48879c;
                c2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float f7 = floatValue / 0.5f;
                    c2Var.setRotationY(90.0f * f7);
                    c2Var.f48171z0 = ((1.0f - f7) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.f48163r0.b(c2Var.f48170y0, false);
                }
                float f10 = (floatValue - 0.5f) / 0.5f;
                c2Var.setRotationY((1.0f - f10) * (-90.0f));
                c2Var.f48171z0 = (f10 * 0.3f) + 0.7f;
                c2Var.invalidate();
                return;
        }
    }
}
