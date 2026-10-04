package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f46655a;
    public final float f46656b;
    public final float f46657c;
    public final float d;
    public final c1 f46658e;
    public final int f46659f;
    public final ValueAnimator h;
    public boolean f46660n;
    public float f46661r;
    public float f46662s;
    public boolean v = false;
    public boolean f46663w = false;
    public float f46664x;
    public final int f46665y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f46665y = i11;
        this.E = c1Var2;
        this.f46659f = i10;
        this.f46658e = c1Var;
        this.f46655a = f7;
        this.f46656b = f10;
        this.f46657c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f46523a);
        ofFloat.addListener(this);
        this.f46664x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46663w) {
            this.f46658e.q(true);
        }
        this.f46663w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46664x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46665y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46689x.a(yVar.H, c1Var);
            } else {
                yVar.f46680a.add(c1Var.f46523a);
                this.f46660n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f46523a;
            if (view == view2) {
                yVar.o(view2);
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
