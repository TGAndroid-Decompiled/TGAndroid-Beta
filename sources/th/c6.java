package th;

import android.animation.ValueAnimator;
public final class c6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48858a;
    public final j6 f48859b;
    public final float f48860c;
    public final float d;

    public c6(j6 j6Var, float f7, float f10, int i10) {
        this.f48858a = i10;
        this.f48859b = j6Var;
        this.f48860c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48858a) {
            case 0:
                j6 j6Var = this.f48859b;
                j6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.setScrollY((int) org.telegram.messenger.i0.T1(this.f48860c, 0.0f, floatValue));
                i6 i6Var = j6Var.f49127b0;
                i6Var.f49090x = org.telegram.messenger.i0.T1(this.d, 0.0f, floatValue);
                i6Var.invalidate();
                return;
            default:
                j6 j6Var2 = this.f48859b;
                j6Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var2.setScrollY((int) org.telegram.messenger.i0.T1(this.f48860c, Math.min((j6Var2.getMeasuredHeight() - j6Var2.f49145u0) - org.telegram.messenger.i0.L(64.0f), j6Var2.f49142r0.getBottom() - j6Var2.getMeasuredHeight()), floatValue2));
                i6 i6Var2 = j6Var2.f49127b0;
                i6Var2.f49090x = org.telegram.messenger.i0.T1(this.d, 1.0f, floatValue2);
                i6Var2.invalidate();
                return;
        }
    }
}
