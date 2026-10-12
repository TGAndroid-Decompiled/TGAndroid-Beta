package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final d1 E;
    public final z F;
    public final float f48016a;
    public final float f48017b;
    public final float f48018c;
    public final float d;
    public final d1 f48019e;
    public final int f48020f;
    public final ValueAnimator h;
    public boolean f48021n;
    public float f48022r;
    public float f48023s;
    public boolean v = false;
    public boolean f48024w = false;
    public float f48025x;
    public final int f48026y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.f48026y = i11;
        this.E = d1Var2;
        this.f48020f = i10;
        this.f48019e = d1Var;
        this.f48016a = f7;
        this.f48017b = f10;
        this.f48018c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.f47889a);
        ofFloat.addListener(this);
        this.f48025x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f48024w) {
            this.f48019e.q(true);
        }
        this.f48024w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f48025x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f48026y;
            d1 d1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f48056x.a(zVar.H, d1Var);
            } else {
                zVar.f48047a.add(d1Var.f47889a);
                this.f48021n = true;
                if (i10 > 0) {
                    zVar.H.post(new v(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = d1Var.f47889a;
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
