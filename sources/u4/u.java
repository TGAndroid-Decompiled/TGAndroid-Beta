package u4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ei.n4;
public final class u implements Animator.AnimatorListener {
    public final int E;
    public final d1 F;
    public final y G;
    public final float f55655a;
    public final float f55656b;
    public final float f55657c;
    public final float d;
    public final d1 f55658e;
    public final int f55659f;
    public final ValueAnimator h;
    public boolean f55660n;
    public float f55661r;
    public float f55662s;
    public boolean f55663w = false;
    public boolean f55664x = false;
    public float f55665y;

    public u(y yVar, d1 d1Var, int i3, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.G = yVar;
        this.E = i10;
        this.F = d1Var2;
        this.f55659f = i3;
        this.f55658e = d1Var;
        this.f55655a = f10;
        this.f55656b = f11;
        this.f55657c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 12));
        ofFloat.setTarget(d1Var.f55540a);
        ofFloat.addListener(this);
        this.f55665y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f55664x) {
            this.f55658e.q(true);
        }
        this.f55664x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f55665y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f55663w) {
            int i3 = this.E;
            d1 d1Var = this.F;
            y yVar = this.G;
            if (i3 <= 0) {
                yVar.f55687y.a(yVar.I, d1Var);
            } else {
                yVar.f55677a.add(d1Var.f55540a);
                this.f55660n = true;
                if (i3 > 0) {
                    yVar.I.post(new l9.u(yVar, this, i3));
                }
            }
            View view = yVar.N;
            View view2 = d1Var.f55540a;
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
