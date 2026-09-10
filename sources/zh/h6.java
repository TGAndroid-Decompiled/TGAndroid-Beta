package zh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class h6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48481a;
    public final p6 f48482b;
    public final float f48483c;
    public final float d;

    public h6(p6 p6Var, float f7, float f10, int i10) {
        this.f48481a = i10;
        this.f48482b = p6Var;
        this.f48483c = f7;
        this.d = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48481a) {
            case 0:
                p6 p6Var = this.f48482b;
                p6Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var.setScrollY((int) AndroidUtilities.lerp(this.f48483c, 0.0f, floatValue));
                o6 o6Var = p6Var.f48778b0;
                o6Var.f48758w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                o6Var.invalidate();
                return;
            default:
                p6 p6Var2 = this.f48482b;
                p6Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p6Var2.setScrollY((int) AndroidUtilities.lerp(this.f48483c, Math.min((p6Var2.getMeasuredHeight() - p6Var2.f48796u0) - AndroidUtilities.dp(64.0f), p6Var2.f48793r0.getBottom() - p6Var2.getMeasuredHeight()), floatValue2));
                o6 o6Var2 = p6Var2.f48778b0;
                o6Var2.f48758w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                o6Var2.invalidate();
                return;
        }
    }
}
