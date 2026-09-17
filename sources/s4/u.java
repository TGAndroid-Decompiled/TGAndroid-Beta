package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f42814a;
    public final float f42815b;
    public final float f42816c;
    public final float d;
    public final c1 e;
    public final int f42817f;
    public final ValueAnimator h;
    public boolean f42818n;
    public float f42819r;
    public float f42820s;
    public boolean v = false;
    public boolean f42821w = false;
    public float f42822x;
    public final int f42823y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f42823y = i11;
        this.E = c1Var2;
        this.f42817f = i10;
        this.e = c1Var;
        this.f42814a = f7;
        this.f42815b = f10;
        this.f42816c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42697a);
        ofFloat.addListener(this);
        this.f42822x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f42821w) {
            this.e.q(true);
        }
        this.f42821w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42822x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f42823y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f42845x.a(yVar.H, c1Var);
            } else {
                yVar.f42837a.add(c1Var.f42697a);
                this.f42818n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42697a;
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
