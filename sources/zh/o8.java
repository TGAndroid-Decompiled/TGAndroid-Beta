package zh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.pk0;
public final class o8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52397a;
    public final Object f52398b;
    public final Object f52399c;

    public o8(int i10, Object obj, Object obj2) {
        this.f52397a = i10;
        this.f52398b = obj;
        this.f52399c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52397a) {
            case 0:
                q8 q8Var = (q8) this.f52398b;
                q8Var.getClass();
                ((p8) this.f52399c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
            default:
                pk0 pk0Var = (pk0) this.f52398b;
                pk0Var.getClass();
                ((Drawable) this.f52399c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((sg.o1) pk0Var.f29415c).A0;
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).a3();
                    return;
                } else {
                    view.invalidate();
                    return;
                }
        }
    }
}
