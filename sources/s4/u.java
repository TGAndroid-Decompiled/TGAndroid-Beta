package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f42788a;
    public final float f42789b;
    public final float f42790c;
    public final float d;
    public final c1 e;
    public final int f42791f;
    public final ValueAnimator h;
    public boolean f42792n;
    public float f42793r;
    public float f42794s;
    public boolean v = false;
    public boolean f42795w = false;
    public float f42796x;
    public final int f42797y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f42797y = i11;
        this.E = c1Var2;
        this.f42791f = i10;
        this.e = c1Var;
        this.f42788a = f7;
        this.f42789b = f10;
        this.f42790c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(c1Var.f42671a);
        ofFloat.addListener(this);
        this.f42796x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f42795w) {
            this.e.q(true);
        }
        this.f42795w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42796x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f42797y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f42819x.a(yVar.H, c1Var);
            } else {
                yVar.f42811a.add(c1Var.f42671a);
                this.f42792n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42671a;
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
