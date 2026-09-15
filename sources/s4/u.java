package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f42792a;
    public final float f42793b;
    public final float f42794c;
    public final float d;
    public final c1 e;
    public final int f42795f;
    public final ValueAnimator h;
    public boolean f42796n;
    public float f42797r;
    public float f42798s;
    public boolean v = false;
    public boolean f42799w = false;
    public float f42800x;
    public final int f42801y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f42801y = i11;
        this.E = c1Var2;
        this.f42795f = i10;
        this.e = c1Var;
        this.f42792a = f7;
        this.f42793b = f10;
        this.f42794c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42675a);
        ofFloat.addListener(this);
        this.f42800x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f42799w) {
            this.e.q(true);
        }
        this.f42799w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42800x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f42801y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f42823x.a(yVar.H, c1Var);
            } else {
                yVar.f42815a.add(c1Var.f42675a);
                this.f42796n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42675a;
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
