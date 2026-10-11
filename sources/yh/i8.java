package yh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52821a;
    public final Object f52822b;
    public final Object f52823c;

    public i8(int i10, Object obj, Object obj2) {
        this.f52821a = i10;
        this.f52822b = obj;
        this.f52823c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52821a) {
            case 0:
                k8 k8Var = (k8) this.f52822b;
                k8Var.getClass();
                ((j8) this.f52823c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.c1();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f52822b;
                ArrayList arrayList = (ArrayList) this.f52823c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    zg.a0.g((View) arrayList.get(i10), floatValue);
                }
                a0Var.f54580m.f38934k0.invalidate();
                return;
        }
    }
}
