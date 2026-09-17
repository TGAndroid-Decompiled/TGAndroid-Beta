package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import bi.u5;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f45871a;
    public final float f45872b;
    public final float f45873c;
    public final float d;
    public final c1 f45874e;
    public final int f45875f;
    public final ValueAnimator h;
    public boolean f45876n;
    public float f45877r;
    public float f45878s;
    public boolean v = false;
    public boolean f45879w = false;
    public float f45880x;
    public final int f45881y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f45881y = i11;
        this.E = c1Var2;
        this.f45875f = i10;
        this.f45874e = c1Var;
        this.f45871a = f7;
        this.f45872b = f10;
        this.f45873c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u5(this, 11));
        ofFloat.setTarget(c1Var.f45739a);
        ofFloat.addListener(this);
        this.f45880x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f45879w) {
            this.f45874e.q(true);
        }
        this.f45879w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f45880x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f45881y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f45905x.a(yVar.H, c1Var);
            } else {
                yVar.f45896a.add(c1Var.f45739a);
                this.f45876n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f45739a;
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
