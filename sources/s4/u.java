package s4;

import ai.k6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class u implements Animator.AnimatorListener {
    public final c1 E;
    public final y F;
    public final float f43078a;
    public final float f43079b;
    public final float f43080c;
    public final float d;
    public final c1 e;
    public final int f43081f;
    public final ValueAnimator h;
    public boolean f43082n;
    public float f43083r;
    public float f43084s;
    public boolean v = false;
    public boolean f43085w = false;
    public float f43086x;
    public final int f43087y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.f43087y = i11;
        this.E = c1Var2;
        this.f43081f = i10;
        this.e = c1Var;
        this.f43078a = f7;
        this.f43079b = f10;
        this.f43080c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 13));
        ofFloat.setTarget(c1Var.f42961a);
        ofFloat.addListener(this);
        this.f43086x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f43085w) {
            this.e.q(true);
        }
        this.f43085w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43086x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f43087y;
            c1 c1Var = this.E;
            y yVar = this.F;
            if (i10 <= 0) {
                yVar.f43109x.a(yVar.H, c1Var);
            } else {
                yVar.f43101a.add(c1Var.f42961a);
                this.f43082n = true;
                if (i10 > 0) {
                    yVar.H.post(new i9.s(yVar, this, i10));
                }
            }
            View view = yVar.M;
            View view2 = c1Var.f42961a;
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
