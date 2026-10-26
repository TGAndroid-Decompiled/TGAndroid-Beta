package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.u4;
public final class v implements Animator.AnimatorListener {
    public final e1 E;
    public final z F;
    public final float f47840a;
    public final float f47841b;
    public final float f47842c;
    public final float d;
    public final e1 e;
    public final int f47843f;
    public final ValueAnimator h;
    public boolean f47844n;
    public float f47845r;
    public float f47846s;
    public boolean v = false;
    public boolean f47847w = false;
    public float f47848x;
    public final int f47849y;

    public v(z zVar, e1 e1Var, int i10, float f7, float f10, float f11, float f12, int i11, e1 e1Var2) {
        this.F = zVar;
        this.f47849y = i11;
        this.E = e1Var2;
        this.f47843f = i10;
        this.e = e1Var;
        this.f47840a = f7;
        this.f47841b = f10;
        this.f47842c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 11));
        ofFloat.setTarget(e1Var.f47738a);
        ofFloat.addListener(this);
        this.f47848x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f47847w) {
            this.e.q(true);
        }
        this.f47847w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f47848x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f47849y;
            e1 e1Var = this.E;
            z zVar = this.F;
            if (i10 <= 0) {
                zVar.f47869x.a(zVar.H, e1Var);
            } else {
                zVar.f47861a.add(e1Var.f47738a);
                this.f47844n = true;
                if (i10 > 0) {
                    zVar.H.post(new k9.u(zVar, this, i10));
                }
            }
            View view = zVar.M;
            View view2 = e1Var.f47738a;
            if (view == view2) {
                zVar.q(view2);
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
