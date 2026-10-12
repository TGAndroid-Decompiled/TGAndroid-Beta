package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import bi.w5;
public final class u implements Animator.AnimatorListener {
    public final b1 E;
    public final y F;
    public final float f44958a;
    public final float f44959b;
    public final float f44960c;
    public final float d;
    public final b1 e;
    public final int f44961f;
    public final ValueAnimator h;
    public boolean f44962n;
    public float f44963r;
    public float f44964s;
    public boolean v = false;
    public boolean f44965w = false;
    public float f44966x;
    public final int f44967y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.f44967y = i11;
        this.E = b1Var2;
        this.f44961f = i10;
        this.e = b1Var;
        this.f44958a = f7;
        this.f44959b = f10;
        this.f44960c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new w5(this, 11));
        ofFloat.setTarget(b1Var.f44838a);
        ofFloat.addListener(this);
        this.f44966x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f44965w) {
            this.e.q(true);
        }
        this.f44965w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44966x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f44967y;
            b1 b1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f44992x.a(yVar.H, b1Var);
            } else {
                yVar.f44984a.add(b1Var.f44838a);
                this.f44962n = true;
                if (i10 > 0) {
                    yVar.H.post(new j9.u(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = b1Var.f44838a;
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
