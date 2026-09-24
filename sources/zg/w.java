package zg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import yh.p8;
import yh.q8;
public final class w implements ValueAnimator.AnimatorUpdateListener {
    public final int f49442a;
    public final Object f49443b;
    public final Object f49444c;

    public w(int i10, Object obj, Object obj2) {
        this.f49442a = i10;
        this.f49443b = obj;
        this.f49444c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49442a) {
            case 0:
                b0 b0Var = (b0) this.f49443b;
                ArrayList arrayList = (ArrayList) this.f49444c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    b0.g((View) arrayList.get(i10), floatValue);
                }
                b0Var.f49243m.f32019k0.invalidate();
                return;
            default:
                q8 q8Var = (q8) this.f49443b;
                q8Var.getClass();
                ((p8) this.f49444c).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.a1();
                return;
        }
    }
}
