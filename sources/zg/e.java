package zg;

import android.animation.ValueAnimator;
import android.view.View;
import fi.v3;
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final int f52867a;
    public final View f52868b;

    public e(int i10, View view) {
        this.f52867a = i10;
        this.f52868b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52867a) {
            case 0:
                i iVar = (i) this.f52868b;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                v3 v3Var = (v3) this.f52868b;
                v3Var.getClass();
                v3Var.f11801o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                v3Var.invalidate();
                return;
        }
    }
}
