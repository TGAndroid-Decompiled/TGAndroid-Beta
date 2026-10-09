package yh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52711a;
    public final Object f52712b;
    public final Object f52713c;

    public i8(int i10, Object obj, Object obj2) {
        this.f52711a = i10;
        this.f52712b = obj;
        this.f52713c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52711a) {
            case 0:
                k8 k8Var = (k8) this.f52712b;
                k8Var.getClass();
                ((j8) this.f52713c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.c1();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f52712b;
                ArrayList arrayList = (ArrayList) this.f52713c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    zg.a0.g((View) arrayList.get(i10), floatValue);
                }
                a0Var.f54459m.f39138k0.invalidate();
                return;
        }
    }
}
