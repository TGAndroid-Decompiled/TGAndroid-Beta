package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class t implements Animator.AnimatorListener {
    public final int D;
    public final c1 E;
    public final x F;
    public final float f48011a;
    public final float f48012b;
    public final float f48013c;
    public final float d;
    public final c1 e;
    public final int f48014f;
    public final ValueAnimator h;
    public boolean f48015n;
    public float f48016r;
    public float f48017s;
    public boolean f48018w = false;
    public boolean f48019x = false;
    public float f48020y;

    public t(x xVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = xVar;
        this.D = i11;
        this.E = c1Var2;
        this.f48014f = i10;
        this.e = c1Var;
        this.f48011a = f7;
        this.f48012b = f10;
        this.f48013c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bg.o(this, 10));
        ofFloat.setTarget(c1Var.f47909a);
        ofFloat.addListener(this);
        this.f48020y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f48019x) {
            this.e.q(true);
        }
        this.f48019x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f48020y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f48018w) {
            int i10 = this.D;
            c1 c1Var = this.E;
            x xVar = this.F;
            if (i10 <= 0) {
                xVar.f48041y.a(xVar.H, c1Var);
            } else {
                xVar.f48032a.add(c1Var.f47909a);
                this.f48015n = true;
                if (i10 > 0) {
                    xVar.H.post(new j9.u(xVar, this, i10));
                }
            }
            View view = xVar.M;
            View view2 = c1Var.f47909a;
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
