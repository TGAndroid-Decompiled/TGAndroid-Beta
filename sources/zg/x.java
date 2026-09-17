package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.r8;
import yh.s8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49208a;
    public final Object f49209b;
    public final Object f49210c;

    public x(int i10, Object obj, Object obj2) {
        this.f49208a = i10;
        this.f49209b = obj;
        this.f49210c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49208a) {
            case 0:
                c0 c0Var = (c0) this.f49209b;
                ArrayList arrayList = (ArrayList) this.f49210c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f49015m.f34467k0.invalidate();
                return;
            default:
                s8 s8Var = (s8) this.f49209b;
                s8Var.getClass();
                ((r8) this.f49210c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.a1();
                return;
        }
    }
}
