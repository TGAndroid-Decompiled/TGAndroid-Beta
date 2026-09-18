package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.r8;
import yh.s8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49213a;
    public final Object f49214b;
    public final Object f49215c;

    public x(int i10, Object obj, Object obj2) {
        this.f49213a = i10;
        this.f49214b = obj;
        this.f49215c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49213a) {
            case 0:
                c0 c0Var = (c0) this.f49214b;
                ArrayList arrayList = (ArrayList) this.f49215c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f49020m.f34472k0.invalidate();
                return;
            default:
                s8 s8Var = (s8) this.f49214b;
                s8Var.getClass();
                ((r8) this.f49215c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.a1();
                return;
        }
    }
}
