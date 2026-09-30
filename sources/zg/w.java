package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49455a;
    public final Object f49456b;
    public final Object f49457c;

    public w(int i10, Object obj, Object obj2) {
        this.f49455a = i10;
        this.f49456b = obj;
        this.f49457c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49455a) {
            case 0:
                b0 b0Var = (b0) this.f49456b;
                ArrayList arrayList = (ArrayList) this.f49457c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    b0.g((View) arrayList.get(i10), floatValue);
                }
                b0Var.f49256m.f32035k0.invalidate();
                return;
            default:
                q8 q8Var = (q8) this.f49456b;
                q8Var.getClass();
                ((p8) this.f49457c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
        }
    }
}
