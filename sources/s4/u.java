package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f41727a;
    public final float f41728b;
    public final float f41729c;
    public final float d;
    public final c1 e;
    public final int f41730f;
    public final ValueAnimator h;
    public boolean f41731n;
    public float f41732r;
    public float f41733s;
    public boolean v = false;
    public boolean f41734w = false;
    public float f41735x;
    public final int f41736y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f41736y = i11;
        this.E = c1Var2;
        this.f41730f = i10;
        this.e = c1Var;
        this.f41727a = f7;
        this.f41728b = f10;
        this.f41729c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ai.m(this, 12));
        ofFloat.setTarget(c1Var.f41610a);
        ofFloat.addListener(this);
        this.f41735x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f41734w) {
            this.e.q(true);
        }
        this.f41734w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f41735x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f41736y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f41758x.a(yVar.H, c1Var);
            } else {
                yVar.f41750a.add(c1Var.f41610a);
                this.f41731n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f41610a;
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
