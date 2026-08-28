package zf;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.su0;
import yf.a2;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50518a;
    public final Object f50519b;
    public final Object f50520c;

    public h1(int i9, Object obj, Object obj2) {
        this.f50518a = i9;
        this.f50519b = obj;
        this.f50520c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50518a) {
            case 0:
                su0 su0Var = (su0) this.f50519b;
                su0Var.getClass();
                ((Drawable) this.f50520c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((k1) su0Var.f32556c).f50588w0;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            default:
                a2 a2Var = (a2) this.f50519b;
                boolean[] zArr = (boolean[]) this.f50520c;
                a2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float f10 = floatValue / 0.5f;
                    a2Var.setRotationY(90.0f * f10);
                    a2Var.f49749v0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    return;
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.f49741n0.b(a2Var.f49748u0, false);
                }
                float f11 = (floatValue - 0.5f) / 0.5f;
                a2Var.setRotationY((1.0f - f11) * (-90.0f));
                a2Var.f49749v0 = (f11 * 0.3f) + 0.7f;
                a2Var.invalidate();
                return;
        }
    }
}
