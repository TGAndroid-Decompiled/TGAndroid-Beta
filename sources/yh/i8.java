package yh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52924a;
    public final Object f52925b;
    public final Object f52926c;

    public i8(int i10, Object obj, Object obj2) {
        this.f52924a = i10;
        this.f52925b = obj;
        this.f52926c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52924a) {
            case 0:
                k8 k8Var = (k8) this.f52925b;
                k8Var.getClass();
                ((j8) this.f52926c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.c1();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f52925b;
                ArrayList arrayList = (ArrayList) this.f52926c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    zg.a0.g((View) arrayList.get(i10), floatValue);
                }
                a0Var.f54683m.f40278k0.invalidate();
                return;
        }
    }
}
