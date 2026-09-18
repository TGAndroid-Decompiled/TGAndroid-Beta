package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f42819a;
    public final float f42820b;
    public final float f42821c;
    public final float d;
    public final c1 e;
    public final int f42822f;
    public final ValueAnimator h;
    public boolean f42823n;
    public float f42824r;
    public float f42825s;
    public boolean v = false;
    public boolean f42826w = false;
    public float f42827x;
    public final int f42828y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f42828y = i11;
        this.E = c1Var2;
        this.f42822f = i10;
        this.e = c1Var;
        this.f42819a = f7;
        this.f42820b = f10;
        this.f42821c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42702a);
        ofFloat.addListener(this);
        this.f42827x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f42826w) {
            this.e.q(true);
        }
        this.f42826w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42827x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f42828y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f42850x.a(yVar.H, c1Var);
            } else {
                yVar.f42842a.add(c1Var.f42702a);
                this.f42823n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42702a;
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
