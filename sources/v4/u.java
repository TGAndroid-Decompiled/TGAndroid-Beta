package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.n4;
import org.telegram.ui.ix;
public final class u implements Animator.AnimatorListener {
    public final int D;
    public final d1 E;
    public final y F;
    public final float f57169a;
    public final float f57170b;
    public final float f57171c;
    public final float d;
    public final d1 f57172e;
    public final int f57173f;
    public final ValueAnimator h;
    public boolean f57174n;
    public float f57175r;
    public float f57176s;
    public boolean f57177w = false;
    public boolean f57178x = false;
    public float f57179y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57173f = i7;
        this.f57172e = d1Var;
        this.f57169a = f10;
        this.f57170b = f11;
        this.f57171c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 14));
        ofFloat.setTarget(d1Var.f57052a);
        ofFloat.addListener(this);
        this.f57179y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57178x) {
            this.f57172e.q(true);
        }
        this.f57178x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57179y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57177w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57204y.a(yVar.H, d1Var);
            } else {
                yVar.f57194a.add(d1Var.f57052a);
                this.f57174n = true;
                if (i7 > 0) {
                    yVar.H.post(new ix(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f57052a;
            if (view == view2) {
                yVar.q(view2);
            }
        }
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}
