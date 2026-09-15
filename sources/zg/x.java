package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.r8;
import yh.s8;
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final int f49185a;
    public final Object f49186b;
    public final Object f49187c;

    public x(int i10, Object obj, Object obj2) {
        this.f49185a = i10;
        this.f49186b = obj;
        this.f49187c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49185a) {
            case 0:
                c0 c0Var = (c0) this.f49186b;
                ArrayList arrayList = (ArrayList) this.f49187c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c0.g((View) arrayList.get(i10), floatValue);
                }
                c0Var.f48992m.f33802k0.invalidate();
                return;
            default:
                s8 s8Var = (s8) this.f49186b;
                s8Var.getClass();
                ((r8) this.f49187c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.a1();
                return;
        }
    }
}
