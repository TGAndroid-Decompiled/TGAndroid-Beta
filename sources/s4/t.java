package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class t implements Animator.AnimatorListener {
    public final int D;
    public final c1 E;
    public final x F;
    public final float f48000a;
    public final float f48001b;
    public final float f48002c;
    public final float d;
    public final c1 e;
    public final int f48003f;
    public final ValueAnimator h;
    public boolean f48004n;
    public float f48005r;
    public float f48006s;
    public boolean f48007w = false;
    public boolean f48008x = false;
    public float f48009y;

    public t(x xVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = xVar;
        this.D = i11;
        this.E = c1Var2;
        this.f48003f = i10;
        this.e = c1Var;
        this.f48000a = f7;
        this.f48001b = f10;
        this.f48002c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bg.o(this, 10));
        ofFloat.setTarget(c1Var.f47898a);
        ofFloat.addListener(this);
        this.f48009y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f48008x) {
            this.e.q(true);
        }
        this.f48008x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f48009y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f48007w) {
            int i10 = this.D;
            c1 c1Var = this.E;
            x xVar = this.F;
            if (i10 <= 0) {
                xVar.f48030y.a(xVar.H, c1Var);
            } else {
                xVar.f48021a.add(c1Var.f47898a);
                this.f48004n = true;
                if (i10 > 0) {
                    xVar.H.post(new j9.u(xVar, this, i10));
                }
            }
            View view = xVar.M;
            View view2 = c1Var.f47898a;
            if (view == view2) {
                xVar.q(view2);
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
