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
    public final float f57069a;
    public final float f57070b;
    public final float f57071c;
    public final float d;
    public final d1 f57072e;
    public final int f57073f;
    public final ValueAnimator h;
    public boolean f57074n;
    public float f57075r;
    public float f57076s;
    public boolean f57077w = false;
    public boolean f57078x = false;
    public float f57079y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57073f = i7;
        this.f57072e = d1Var;
        this.f57069a = f10;
        this.f57070b = f11;
        this.f57071c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new m4(this, 14));
        ofFloat.setTarget(d1Var.f56952a);
        ofFloat.addListener(this);
        this.f57079y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57078x) {
            this.f57072e.q(true);
        }
        this.f57078x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57079y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57077w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57104y.a(yVar.H, d1Var);
            } else {
                yVar.f57094a.add(d1Var.f56952a);
                this.f57074n = true;
                if (i7 > 0) {
                    yVar.H.post(new fx(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f56952a;
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
