package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f43112a;
    public final float f43113b;
    public final float f43114c;
    public final float d;
    public final c1 e;
    public final int f43115f;
    public final ValueAnimator h;
    public boolean f43116n;
    public float f43117r;
    public float f43118s;
    public boolean v = false;
    public boolean f43119w = false;
    public float f43120x;
    public final int f43121y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f43121y = i11;
        this.E = c1Var2;
        this.f43115f = i10;
        this.e = c1Var;
        this.f43112a = f7;
        this.f43113b = f10;
        this.f43114c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42995a);
        ofFloat.addListener(this);
        this.f43120x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f43119w) {
            this.e.q(true);
        }
        this.f43119w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43120x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f43121y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f43143x.a(yVar.H, c1Var);
            } else {
                yVar.f43135a.add(c1Var.f42995a);
                this.f43116n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42995a;
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
