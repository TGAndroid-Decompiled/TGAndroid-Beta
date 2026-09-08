package zh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.pk0;
public final class o8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52427a;
    public final Object f52428b;
    public final Object f52429c;

    public o8(int i10, Object obj, Object obj2) {
        this.f52427a = i10;
        this.f52428b = obj;
        this.f52429c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52427a) {
            case 0:
                q8 q8Var = (q8) this.f52428b;
                q8Var.getClass();
                ((p8) this.f52429c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
            default:
                pk0 pk0Var = (pk0) this.f52428b;
                pk0Var.getClass();
                ((Drawable) this.f52429c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((sg.o1) pk0Var.f29441c).A0;
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
