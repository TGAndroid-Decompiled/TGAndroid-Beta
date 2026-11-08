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
    public final float f57160a;
    public final float f57161b;
    public final float f57162c;
    public final float d;
    public final d1 f57163e;
    public final int f57164f;
    public final ValueAnimator h;
    public boolean f57165n;
    public float f57166r;
    public float f57167s;
    public boolean f57168w = false;
    public boolean f57169x = false;
    public float f57170y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f57164f = i7;
        this.f57163e = d1Var;
        this.f57160a = f10;
        this.f57161b = f11;
        this.f57162c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new m4(this, 14));
        ofFloat.setTarget(d1Var.f57043a);
        ofFloat.addListener(this);
        this.f57170y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f57169x) {
            this.f57163e.q(true);
        }
        this.f57169x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f57170y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.f57168w) {
            int i7 = this.D;
            d1 d1Var = this.E;
            y yVar = this.F;
            if (i7 <= 0) {
                yVar.f57195y.a(yVar.H, d1Var);
            } else {
                yVar.f57185a.add(d1Var.f57043a);
                this.f57165n = true;
                if (i7 > 0) {
                    yVar.H.post(new fx(yVar, this, i7));
                }
            }
            View view = yVar.M;
            View view2 = d1Var.f57043a;
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
