package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f43185a;
    public final float f43186b;
    public final float f43187c;
    public final float d;
    public final c1 e;
    public final int f43188f;
    public final ValueAnimator h;
    public boolean f43189n;
    public float f43190r;
    public float f43191s;
    public boolean v = false;
    public boolean f43192w = false;
    public float f43193x;
    public final int f43194y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f43194y = i11;
        this.E = c1Var2;
        this.f43188f = i10;
        this.e = c1Var;
        this.f43185a = f7;
        this.f43186b = f10;
        this.f43187c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f43068a);
        ofFloat.addListener(this);
        this.f43193x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f43192w) {
            this.e.q(true);
        }
        this.f43192w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43193x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f43194y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f43216x.a(yVar.H, c1Var);
            } else {
                yVar.f43208a.add(c1Var.f43068a);
                this.f43189n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f43068a;
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
