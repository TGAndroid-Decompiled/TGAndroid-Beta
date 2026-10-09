package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f47785a;
    public final float f47786b;
    public final float f47787c;
    public final float d;
    public final d1 f47788e;
    public final int f47789f;
    public final ValueAnimator h;
    public boolean f47790n;
    public float f47791r;
    public float f47792s;
    public boolean v = false;
    public boolean f47793w = false;
    public float f47794x;
    public final int f47795y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f47795y = i11;
        this.E = d1Var2;
        this.f47789f = i10;
        this.f47788e = d1Var;
        this.f47785a = f7;
        this.f47786b = f10;
        this.f47787c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47658a);
        ofFloat.addListener(this);
        this.f47794x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47793w) {
            this.f47788e.q(true);
        }
        this.f47793w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47794x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47795y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47825x.a(zVar.H, d1Var);
            } else {
                zVar.f47816a.add(d1Var.f47658a);
                this.f47790n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47658a;
            if (view == view2) {
                zVar.o(view2);
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
