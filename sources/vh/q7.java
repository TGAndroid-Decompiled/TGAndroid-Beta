package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class q7 extends AnimatorListenerAdapter {
    public final int f51805a;
    public final o8 f51806b;

    public q7(o8 o8Var, int i10) {
        this.f51805a = i10;
        this.f51806b = o8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51805a) {
            case 0:
                o8 o8Var = this.f51806b;
                o8Var.f51651j2 = null;
                o8Var.f51672r.setTranslationY(0.0f);
                o8Var.f51672r.b(0.0f);
                return;
            case 1:
                o8 o8Var2 = this.f51806b;
                o8Var2.f51659n.removeView(o8Var2.M0);
                o8Var2.M0 = null;
                o8Var2.f51662n2 = null;
                o8Var2.f51668p2 = null;
                r2 r2Var = o8Var2.f51628c1.L;
                boolean z10 = true;
                if (o8Var2.f51637f0 == 1) {
                    z10 = false;
                }
                r2Var.b(z10);
                return;
            default:
                o8 o8Var3 = this.f51806b;
                y7 y7Var = o8Var3.C2;
                if (y7Var != null) {
                    if (y7Var.getParent() != null) {
                        ((ViewGroup) o8Var3.C2.getParent()).removeView(o8Var3.C2);
                    }
                    o8Var3.C2 = null;
                }
                o8Var3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
