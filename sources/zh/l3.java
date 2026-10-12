package zh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class l3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50792a;
    public final o3 f50793b;

    public l3(o3 o3Var, int i10) {
        this.f50792a = i10;
        this.f50793b = o3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50792a) {
            case 0:
                o3 o3Var = this.f50793b;
                o3Var.getClass();
                o3Var.f50930s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var.d(o3Var.U);
                return;
            case 1:
                o3 o3Var2 = this.f50793b;
                o3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float t10 = com.google.android.gms.internal.play_billing.k3.t((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                o3Var2.f50931t0 = t10;
                FrameLayout frameLayout = o3Var2.f50908b;
                frameLayout.setScaleX(t10);
                frameLayout.setScaleY(o3Var2.f50931t0);
                o3Var2.invalidate();
                return;
            default:
                o3 o3Var3 = this.f50793b;
                o3Var3.getClass();
                o3Var3.f50930s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o3Var3.d(o3Var3.U);
                return;
        }
    }
}
