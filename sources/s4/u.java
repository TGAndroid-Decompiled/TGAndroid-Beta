package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f46656a;
    public final float f46657b;
    public final float f46658c;
    public final float d;
    public final c1 f46659e;
    public final int f46660f;
    public final ValueAnimator h;
    public boolean f46661n;
    public float f46662r;
    public float f46663s;
    public boolean v = false;
    public boolean f46664w = false;
    public float f46665x;
    public final int f46666y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f46666y = i11;
        this.E = c1Var2;
        this.f46660f = i10;
        this.f46659e = c1Var;
        this.f46656a = f7;
        this.f46657b = f10;
        this.f46658c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f46524a);
        ofFloat.addListener(this);
        this.f46665x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f46664w) {
            this.f46659e.q(true);
        }
        this.f46664w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f46665x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f46666y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f46690x.a(yVar.H, c1Var);
            } else {
                yVar.f46681a.add(c1Var.f46524a);
                this.f46661n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f46524a;
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
