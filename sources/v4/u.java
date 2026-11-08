package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.m4;
import org.telegram.ui.fx;
public final class u implements Animator.AnimatorListener {
    public final int D;
    public final d1 E;
    public final y F;
    public final float f57161a;
    public final float f57162b;
    public final float f57163c;
    public final float d;
    public final d1 f57164e;
    public final int f57165f;
    public final ValueAnimator h;
    public boolean f57166n;
    public float f57167r;
    public float f57168s;
    public boolean f57169w = false;
    public boolean f57170x = false;
    public float f57171y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57165f = i7;
        this.f57164e = d1Var;
        this.f57161a = f10;
        this.f57162b = f11;
        this.f57163c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new m4(this, 14));
        ofFloat.setTarget(d1Var.f57044a);
        ofFloat.addListener(this);
        this.f57171y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57170x) {
            this.f57164e.q(true);
        }
        this.f57170x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57171y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57169w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57196y.a(yVar.H, d1Var);
            } else {
                yVar.f57186a.add(d1Var.f57044a);
                this.f57166n = true;
                if (i7 > 0) {
                    yVar.H.post(new fx(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f57044a;
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
